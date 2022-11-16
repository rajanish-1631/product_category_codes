package Product_Details;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	@Id

	private String product_id;
	private String product_name;
	private String product_price;
	
public Product()
{}

public Product(String product_id, String product_name, String product_price) {
	super();
	this.product_id = product_id;
	this.product_name = product_name;
	this.product_price = product_price;
}

public String getProduct_id() {
	return product_id;
}

public void setProduct_id(String product_id) {
	this.product_id = product_id;
}

public String getProduct_name() {
	return product_name;
}

public void setProduct_name(String product_name) {
	this.product_name = product_name;
}

public String getProduct_price() {
	return product_price;
}

public void setProduct_price(String product_price) {
	this.product_price = product_price;
}

}
