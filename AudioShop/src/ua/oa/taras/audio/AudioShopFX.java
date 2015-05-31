package ua.oa.taras.audio;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ua.oa.taras.audio.controller.AudioShopController;

public class AudioShopFX extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		URL url = AudioShopFX.class.getResource("/ua/oa/taras/audio/view/AudioShopView.fxml");
        FXMLLoader loader = new FXMLLoader(url);
		Parent root = loader.load();
		Scene scene = new Scene(root);
	
		AudioShopController controller = loader.getController();
        controller.setTableView();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Audio");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
