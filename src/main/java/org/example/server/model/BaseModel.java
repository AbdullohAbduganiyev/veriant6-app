package org.example.server.model;

import lombok.Getter;

import java.util.Date;
import java.util.UUID;

@Getter
public abstract class BaseModel {
    protected final String id;

    protected final Date date;
    public BaseModel() {
        this.id = UUID.randomUUID().toString();
        this.date = new Date();
    }
}
