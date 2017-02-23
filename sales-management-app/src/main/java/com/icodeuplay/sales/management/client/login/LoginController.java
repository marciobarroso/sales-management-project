package com.icodeuplay.sales.management.client.login;

import com.icodeuplay.base.common.utils.JavaFXUtils;
import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.view.javafx.common.ConfirmBox;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController extends Application {

	public static final String FORM_REFERENCE = JavaFXUtils.getFormReference(LoginController.class);

	@FXML
	private TextField username;

	@FXML
	private PasswordField password;

	public void login(ActionEvent event) {
		boolean result = ConfirmBox.show("Confirma sua ação?");
		System.out.println(result);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle(MessageUtils.getString("app.title"));

		String form = LoginController.FORM_REFERENCE;
		Parent root = FXMLLoader.load(getClass().getResource(form));
		Scene scene = new Scene(root, 300, 300);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}