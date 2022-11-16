package Category_Details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	
@Autowired
CategoryService categoryservice;


@RequestMapping(method=RequestMethod.GET,value="/category")
public List<Category> getCategories()
{
	return categoryservice.getCategory();
}

@RequestMapping(method=RequestMethod.GET, value="/category/{id}")
public Category getCategory(@PathVariable String category_id)
{
   return categoryservice.getCategory(category_id);	
}

@RequestMapping(method=RequestMethod.POST, value="/category")
public void addCategory(@RequestBody Category c1)
{
	categoryservice.addCategory(c1);
}

@RequestMapping(method=RequestMethod.DELETE, value="/category/{id}")
public List<Category> deleteCategory(@PathVariable String category_id)
{
	return categoryservice.deleteCategory(category_id);
}

@RequestMapping(method=RequestMethod.PUT, value="/category/{oldcategory_id}")
public List<Category> updateCategory(@PathVariable String category_id, @RequestBody Category c)
{
	String oldcategory_id = null;
	return categoryservice.updateCategory(oldcategory_id,c);
}
}
