package search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import edit_product.EditProductScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import product_management.ProductManagementScreen;
import user_management.UserManagementScreen;


public class SearchProductScreenController {
	
	@FXML
	private TextField productNameSearch;
	
	@FXML
	private TextField productName;
	
	@FXML
	private TextField productID;
	
	@FXML
	private TextField price;
	
	@FXML
	private TextField quantity;
	
	@FXML
	private TextField category;
	
	@FXML
	private Button editProduct;
	
	@FXML
	private Button backButton;
	
	@FXML
	private Button delete;
	
	@FXML
	private Button searchButton;
	

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
			
			productName.setText(rs.getString("Product_name"));
			productID.setText(rs.getString("Product_ID"));
			price.setText(rs.getString("price"));
			quantity.setText(rs.getString("category"));
			category.setText(rs.getString("quantity"));
			}
		}
	 catch (Exception e) {
		e.printStackTrace();
	}
	
	return false;
}

public void close(ActionEvent event) {
	ProductManagementScreen.showProductManagementScreen();
		
	}


public void edit(ActionEvent event) {
	 EditProductScreen.showEditProductScreen();
		
	}

public void deleteProduct(ActionEvent event) {
	String query = "delete from products where Product_Name='" + productNameSearch.getText() + "' ";
	db_operations.DbUtil.executeQuery(query);
}
}


