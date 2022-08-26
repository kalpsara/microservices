package com.kalpana.microservice.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minimumLimit;
    private int maximumLimit;
    public int getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(int maximumLimit) {
        this.maximumLimit = maximumLimit;
    }

    public int getMinimumLimit() {
        return minimumLimit;
    }

    public void setMinimumLimit(int minimumLimit) {
        this.minimumLimit = minimumLimit;
    }

    //fsfrs
}
