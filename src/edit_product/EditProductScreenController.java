package edit_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;

public class EditProductScreenController {
	@FXML
	private TextField productNameSearch;
	
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
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button searchButton;
	

public void close(ActionEvent event) 
{
	ProductManagementScreen.showProductManagementScreen();
}

public void edit(ActionEvent event) throws SQLException { 

String query = "UPDATE products SET Product_Name = '" +productName.getText() + "', " + "Product_ID = '" + productID.getText()
+ "', " + "price = '" + price.getText() + "', " + "category = '" +category.getText()
+ "'," + "quantity = '" + quantity.getText() + "'" + "WHERE Product_Name = '" + productName.getText() + "'";

db_operations.DbUtil.executeQuery(query);

}
public void search(ActionEvent event)throws SQLException 
{
	boolean searchstatus= SearchProduct(productNameSearch.getText());
	
	if(searchstatus) {
		SearchProduct(null);
	}
	else {
		System.out.println("Product not found");
	}
}

public boolean SearchProduct(String productNameSearch ) {
	String query = "select* from products where Product_Name='" + productNameSearch + "' ";
	ResultSet rs = db_operations.DbUtil.executeQueryGetResult(query);
	try {
		if(rs.next()) {
			
			productName.setText(rs.getString("Product_Name"));
			productID.setText(rs.getString("Product_ID"));
			price.setText(rs.getString("price"));
			category.setText(rs.getString("category"));
			quantity.setText(rs.getString("quantity"));
			}
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	return false;
}



}

