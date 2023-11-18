 package search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import edit_user.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import user_management.UserManagementScreen;

public class SearchUserScreenController {
	
	@FXML
	private TextField userNameSearch;
	
	
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
	
	@FXML
	private Button editUser;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button delete;
	
	@FXML
	private Button searchButton;
	

public void search(ActionEvent event)throws SQLException 
{
	boolean searchstatus= SearchUser(userNameSearch.getText());
	
	if(searchstatus) {
		SearchUser(null);
	}
	else {
		System.out.println("User not found");
	}
}

public boolean SearchUser(String userNameSearch ) {
	String query = "select* from users where userName='" + userNameSearch + "' ";
	ResultSet rs = db_operations.DbUtil.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			
			userName.setText(rs.getString("userName"));
			loginName.setText(rs.getString("loginName"));
			password.setText(rs.getString("Password"));
			confirmPassword.setText(rs.getString("confirmPassword"));
			userRole.setText(rs.getString("userRole"));
			}
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	return false;
}

public void close(ActionEvent event) {
	UserManagementScreen.showUserManagementScreen();
		
	}


public void edit(ActionEvent event) {
	 EditUserScreen.showEditUserScreen();
		
	}

public void deleteUser(ActionEvent event) {
	String query = "delete from users where userName='" + userNameSearch.getText() + "' ";
	db_operations.DbUtil.executeQuery(query);
}
}


 














