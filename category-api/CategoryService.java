package Category_Details;

import org.springframework.stereotype.Service;

import Product_Details.Product;
import Product_Details.ProductService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CategoryService
{

ProductService productservice;

Category c1=new Category("273","Flower",productservice.getProduct());
Category c2=new Category("768","Book",productservice.getProduct());
Category c3=new Category("971","Pen",productservice.getProduct());
Category c4=new Category("654","Clothes",productservice.getProduct());
Category c5=new Category("465","Mobile",productservice.getProduct());

List<Category> clist=new ArrayList<Category>(Arrays.asList(c1,c2,c3,c4,c5));

public List<Category>getCategory()
{
	return clist;
}

public Category getCategory(String category_id)
{
	Category c=null;
	for(Category category:clist)
	{
		if(category.getCategory_id().equals(category_id))
		{
			c=category;
		}
	}
	return c;
}

public void addCategory(Category c)
{
	clist.add(c);
}

public List<Category> deleteCategory(String category_id)
{
	for(Category c:clist)
	{
		if(c.getCategory_id().equals(category_id))
		{
			clist.remove(c);
		}
	}
	return clist; 
}
	 
public List<Category> updateCategory(String oldcategory_id, Category c)
{
	for(Category c1:clist)
	{
		if(c1.getCategory_id().equals(oldcategory_id))
		{
			c1.setCategory_id(c.getCategory_id());
		}
	
	}
	return clist;
}
}
