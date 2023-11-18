package add_product;

import db_operations.DbUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import main_screen.MainScreen;
import product_management.ProductManagementScreen;

public class AddProductScreencontroller {
	public class AddProductScreenController {
		@FXML
		private TextField productName;
		
		@FXML
		private TextField productID;
		
		@FXML
		private TextField price;
		
		@FXML
		private TextField category;
		
		@FXML
		private TextField quantity;

	public void save(ActionEvent event) 
	{
		String query = "INSERT INTO products(Product_Name,Product_ID,price,quantity,category) VALUES  ('"+productName.getText()+"', '"+productID.getText()+"', '"+price.getText()+"','"+category.getText()+"','"+quantity.getText()+"',) " ;
		DbUtil.executeQuery(query); 
	}
	public void close(ActionEvent event)
	{
		MainScreen.showMainScreen();
	}
	}
}
