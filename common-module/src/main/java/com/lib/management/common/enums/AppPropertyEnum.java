package com.lib.management.common.enums;

public enum AppPropertyEnum {
    APP_TITLE("app.title"), DB_DRIVER_CLASS("db.driverClass"),
    DB_URL("db.url"), DB_USER("db.user"), DB_PASSWORD("db.password");

    private String fileString;

    private AppPropertyEnum(String fileString) {
        this.fileString = fileString;
    }

    public String getFileString() {
        return fileString;
    }
}
