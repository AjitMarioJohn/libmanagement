module com.lib.management.ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    requires lib.management.core.domain;
    requires java.sql;
    requires lib.management.common;

    opens com.lib.management.ui to javafx.fxml, javafx.graphics;
    opens com.lib.management.ui.controller to javafx.fxml, javafx.graphics;
}