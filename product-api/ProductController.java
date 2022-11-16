package Product_Details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class ProductController {

		
	@Autowired
	ProductService productservice;

	@RequestMapping(method=RequestMethod.GET, value="/product")
	public List<Product> getProducts()
	{
		return productservice.getProduct();
	}

	@RequestMapping(method=RequestMethod.GET, value="/product/{id}")
	public Product getProduct(@PathVariable String product_id)
	{
	   return productservice.getProduct(product_id);	
	}

	@RequestMapping(method=RequestMethod.POST, value="/product")
	public void addProduct(@RequestBody Product p1)
	{
		productservice.addProduct(p1);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
	public List<Product> deleteProduct(@PathVariable String product_id)
	{
		return productservice.deleteProduct(product_id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/product/{oldproduct_id}")
	public List<Product> updateProduct(@PathVariable String product_id, @RequestBody Product p)
	{
		
		String oldproduct_id=null;
		return productservice.updateProduct(oldproduct_id,p);
	}
	}


