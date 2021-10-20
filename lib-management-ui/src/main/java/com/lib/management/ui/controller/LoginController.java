package com.lib.management.ui.controller;

import com.lib.management.common.exception.ConnectionFailedException;
import com.lib.management.ui.utils.FxmlUtils;
import com.lib.management.ui.common.ModuleFactory;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private void validateUser(){
        try {
            boolean validUser = ModuleFactory.getInstance().getDomainFactory().
                    getDomainServiceFactoryInstance().getLoginDomainService().validateUser(username.getText(), password.getText());

        } catch (SQLException | ConnectionFailedException  e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void closeloginScreen(){
        FxmlUtils.close();
    }

}
