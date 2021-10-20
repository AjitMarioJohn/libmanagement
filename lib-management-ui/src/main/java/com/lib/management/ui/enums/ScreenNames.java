package com.lib.management.ui.enums;

public enum ScreenNames {
    LOGIN("login/login.fxml","");

    private final String fileName;
    private final String cssName;
    private final String basePath = "/fxml/";

    private ScreenNames(String fileName, String cssName) {
        this.fileName = this.basePath+fileName;
        this.cssName = this.basePath+cssName;
    }

    public String getFileName() {
        return fileName;
    }

    public String getCssName() {
        return cssName;
    }

    public String getBasePath() {
        return basePath;
    }
}
