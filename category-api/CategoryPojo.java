package Category_Details;
import java.util.LinkedList;
import java.util.List;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import Product_Details.Product;

@Entity
@Table(name="category")

public class Category {
	@Id
	private String  category_id;
	private String category_name;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product> plist =new LinkedList<>();
	
public Category()
{
	
}

public Category(String category_id,String category_name,List<Product> plist)
{
	super();
	this.category_id=category_id;
	this.category_name=category_name;
	this.plist=plist;
}

public String getCategory_id() {
	return category_id;
}

public void setCategory_id(String category_id) {
	this.category_id = category_id;
}

public String getCategory_name() {
	return category_name;
}

public void setCategory_name(String category_name) {
	this.category_name = category_name;
}

public void setPlist(List<Product> plist) {
	this.plist = plist;
}
}

