package app.gui.menu.listeners;

import app.gui.settings.Settings;
import app.utility.LoadingScreen;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class SettingsButton implements EventHandler<MouseEvent> {

	private final Scene scene;

	public SettingsButton(Scene scene) {
		this.scene = scene;
	}

	@Override
	public void handle(MouseEvent arg0) {
		AnchorPane pane = (AnchorPane) scene.lookup("#principalPane");
		pane.getChildren().clear();

		//LoadingScreen load = new LoadingScreen(scene);
		//load.enableLoadingScreen();

		

		new Settings(pane.getScene()).setContent();
	}

}
