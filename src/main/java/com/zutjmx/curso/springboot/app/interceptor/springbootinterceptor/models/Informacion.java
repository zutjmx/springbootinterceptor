package com.zutjmx.curso.springboot.app.interceptor.springbootinterceptor.models;

public class Informacion {
    private String message;
    private String author;
    private String version;

    public Informacion() {
    }

    public Informacion(String message, String author, String version) {
        this.message = message;
        this.author = author;
        this.version = version;
    }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    
}
