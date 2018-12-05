package com.jobxhub.service.util;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jobx",ignoreInvalidFields = true)
public class PropertyPlaceholder {

    private String registry;

    private String monitorPort;

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(String registry) {
        this.registry = registry;
    }

    public String getMonitorPort() {
        return monitorPort;
    }

    public void setMonitorPort(String monitorPort) {
        this.monitorPort = monitorPort;
    }
}