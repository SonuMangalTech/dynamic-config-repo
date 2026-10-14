package com.deeson.labs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    private final AppConfig appConfig;

    public AppController(AppConfig appConfig) {
        this.appConfig = appConfig;
    }

    // Read config from local application file
    @GetMapping("/localFile")
    private int healthApi() {
        return appConfig.getRateLimit();
    }

    // Read config from git repo
    @GetMapping("/gitConfig")
    private String getNameFromConfigServer() {
        return appConfig.getRateLimitName();
    }

}
