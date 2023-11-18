package login;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import main_screen.MainScreen;

public class LoginScreenController {
	@FXML
	private TextField userName;
	
	@FXML
	private TextField password;
	
	@FXML
	private Button loginButton;
	
	public void login(ActionEvent event) throws SQLException
	{
		boolean loginStatus= LoginScreenController.validateUserandPassword(userName.getText(),password.getText());
		if(loginStatus)
		{
			MainScreen.showMainScreen();
	}else {
		System.out.println("Login Unsuccessfull");
	}

}
public static boolean validateUserandPassword(String loginName, String Password) throws SQLException {
	String query = "select*from users where loginName='" + loginName + "' and Password='" + Password + "'";
	ResultSet rs =db_operations.DbUtil.executeQueryGetResult(query);
	try {
		if (rs.next()) {
			return true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return false;
}
}
 

