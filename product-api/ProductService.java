package Product_Details;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService 
{
	Product p1=new Product("252","Rose Plant","764");
	Product p2=new Product("754","One Plus","923");
	Product p3=new Product("967","Cindrella","865");
	Product p4=new Product("108","Montex","987");
	Product p5=new Product("687","T-Shirt","764");
	
	List<Product> plist=new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5));
	
public List<Product> getProduct()
{
	return plist;
}

public Product getProduct(String product_id)
{
	Product p=null;
	for(Product product:plist)
	{
		if(product.getProduct_id().equals(product_id))
		{
		     p=product;	
		}
	}
	return p;
}

public void addProduct(Product p)
{
	plist.add(p);
}

public List<Product> deleteProduct(String product_id)
{
	for(Product p:plist)
	{
		if(p.getProduct_id().equals(product_id))
		{
			plist.remove(p);
		}
	}
	return plist; 
}

public List<Product> updateProduct(String oldproduct_id,Product p)
{
	for(Product p1:plist)
	{
		if(p1.getProduct_id().equals(oldproduct_id))
			{
			  p1.setProduct_id(p.getProduct_id());
			}
		}
	return plist ;
}


}
