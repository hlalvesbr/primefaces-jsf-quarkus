package com.github.hlalvesbr;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class IndexBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String message = "Hello";

    public String sayHello() {
        message = "Hello " + name;
        return "index";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
