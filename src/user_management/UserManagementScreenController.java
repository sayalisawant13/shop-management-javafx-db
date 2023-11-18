package user_management;

import add_user.AddUserScreen;
import edit_user.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_user.SearchUserScreen;

public class UserManagementScreenController {
 @FXML
	private Button addUser;
 
 @FXML
	private Button editUser;
 
 @FXML
	private Button searchUser;
 
 @FXML
	private Button deleteUser;
 
 @FXML
	private Button quit;
 
 public void showAddUserOptions(ActionEvent event) {
	 AddUserScreen.showAddUserScreen();
	}
 
 public void showEditUserOptions(ActionEvent event) {
	 EditUserScreen.showEditUserScreen();
	 
	}
 public void showSearchUserOptions(ActionEvent event) {
	 SearchUserScreen.showSearchUserScreen();
	}
 public void showDeleteUserOptions(ActionEvent event) {
	}
 public void quitUserManagement(ActionEvent event) {
	}
}
