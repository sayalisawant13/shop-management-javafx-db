package add_user;

import db_operations.DbUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main_screen.MainScreen;
import user_management.UserManagementScreen;

public class AddUserScreenController {
	@FXML
	private TextField userName;
	
	@FXML
	private TextField loginName;
	
	@FXML
	private TextField password;
	
	@FXML
	private TextField confirmPassword;
	
	@FXML
	private TextField userRole;

public void save(ActionEvent event) 
{
	String query = "INSERT INTO Users(userName,loginName,Password,ConfirmPassword,userRole) "
			+ "VALUES  ('"+userName.getText()+"', '"+loginName.getText()+"', '"+password.getText()+"','"+confirmPassword.getText()+"','"+userRole.getText()+"')";                                         
	DbUtil.executeQuery(query);
}
public void close(ActionEvent event)
{
	MainScreen.showMainScreen();
}
}

