package com.deeson.labs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@RefreshScope
@Component
public class AppConfig {

    @Value("${rate.limit}")
    private int rateLimit;

    @Value("${rate.limit.name}")
    private String rateLimitName;

    public int getRateLimit() {
        return rateLimit;
    }

    public String getRateLimitName() {
        return rateLimitName;
    }

}
