package com.lib.management.ui;

import com.lib.management.ui.enums.ScreenNames;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public final class FxmlUtils {
    private static Stage presentStage = new Stage();

    public static void invokeScreen(Stage stage, ScreenNames screenNames) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        URL url = FxmlUtils.class.getResource(screenNames.getFileName());
        loader.setLocation(url);
        Parent parentNode = (Parent)loader.load();
        Scene scene = new Scene(parentNode);
        scene.getStylesheets().add(screenNames.getCssName());
        presentStage.hide();
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.setMaximized(screenNames!=ScreenNames.LOGIN);
        if(screenNames == ScreenNames.LOGIN){
            stage.centerOnScreen();
        }
        stage.show();
        presentStage = stage;
    }

    public static void close(){
        presentStage.close();
    }
}
