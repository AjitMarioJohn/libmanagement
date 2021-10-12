package com.lib.management.common.exception;

public class ConnectionFailedException extends Exception{
    public ConnectionFailedException(Throwable cause) {
        super("Failled to connect to database", cause);
    }
    public ConnectionFailedException() {
        super("Failled to connect to database");
    }
}
