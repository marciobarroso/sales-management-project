package com.icodeuplay.sales.management.app;

import com.icodeuplay.base.common.utils.MessageUtils;
import com.icodeuplay.base.view.javafx.common.ConfirmBox;
import com.icodeuplay.sales.management.client.vo.Session;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main {

	private Session session;

	private BorderPane layout;

	public Main(Session session) {
		this.session = session;
	}

	private void exit() {
		if (ConfirmBox.show(MessageUtils.getString("app.messages.exit.confirm"))) {
			System.exit(0);
		}
	}

	public void show() {
		int width = MessageUtils.getInt("app.screen.width");
		int height = MessageUtils.getInt("app.screen.height");

		Stage stage = new Stage();
		stage.setTitle(MessageUtils.getString("app.title"));
		stage.setResizable(false);
		stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				exit();
			}
		});

		MenuBar menu = new MenuBar();
		Menu system = new Menu(MessageUtils.getString("app.menu.system"));
		menu.getMenus().add(system);

		MenuItem exit = new MenuItem(MessageUtils.getString("app.menu.exit"));
		exit.setOnAction(e -> {
			this.exit();
		});
		system.getItems().add(exit);

		layout = new BorderPane();
		layout.setTop(menu);

		Scene scene = new Scene(layout, width, height);
		stage.setScene(scene);

		stage.show();
	}
}
