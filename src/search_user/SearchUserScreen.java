package search_user;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SearchUserScreen {
	public static void showSearchUserScreen() {
		try {
			Parent actorGroup = FXMLLoader.load(new URL(
					"file:///C:\\Users\\Lenovo\\eclipse-workspace\\ShopManagementAppDB\\src\\search_user\\search_user.fxml"));

			StageFactory.stage.setTitle("Search User ");
			Scene scene = new Scene(actorGroup, 600, 400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
