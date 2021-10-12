package com.lib.management.ui;

import com.lib.management.ui.enums.ScreenNames;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInitiator extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FxmlUtils.invokeScreen(stage, ScreenNames.LOGIN);
    }

    public static void main(String[] args) {
        launch();
    }
}