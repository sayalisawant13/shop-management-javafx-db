package product_management;

import add_product.AddProductScreen;
import add_user.AddUserScreen;
import edit_product.EditProductScreen;
import edit_user.EditUserScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import search_product.SearchProductScreen;
import search_user.SearchUserScreen;

public class ProductManagementScreenController {
	@FXML
	private Button addProduct;
 
 @FXML
	private Button editProduct;
 
 @FXML
	private Button searchProduct;
 
 @FXML
	private Button deleteProduct;
 
 @FXML
	private Button Quit;
 
 public void showAddProductOptions(ActionEvent event) {
	 AddProductScreen.showAddProductScreen();
	}
 
 public void showEditProductOptions(ActionEvent event) {
	 EditProductScreen.showEditProductScreen();
	 
	}
 public void showSearchProductOptions(ActionEvent event) {
	 SearchProductScreen.showSearchProductScreen();
	}
 public void showDeleteProductOptions(ActionEvent event) {
	}
 public void quitProductManagement(ActionEvent event) {
	}
}


