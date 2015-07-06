package org.springframework.cloud.config.server;

import org.springframework.context.ApplicationEvent;

/**
 *
 */
public class PropertySourceRegisteredEvent extends ApplicationEvent {

    private final String name;

    public PropertySourceRegisteredEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
