package main_screen;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;

public class MainScreenController {
	@FXML
	private Button userManagement;

	@FXML
	private Button productManagement;

	@FXML
	private Button backToMainScreen;

	public void showUserManagementScreen(ActionEvent event)throws Exception 
	{
		UserManagementScreen.showUserManagementScreen();
	}

	public void showProductManagementScreen(ActionEvent event) {
		ProductManagementScreen.showProductManagementScreen();
	}

	public void backToMainScreen(ActionEvent event) {
	}
}

