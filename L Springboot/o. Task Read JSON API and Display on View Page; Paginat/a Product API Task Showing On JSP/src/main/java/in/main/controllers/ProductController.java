package in.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import in.main.beans.Products;
import in.main.services.ProductService;


@Controller
public class ProductController {


	@Autowired
	private ProductService productService;
	
    @GetMapping("/products")
    public String getProductsLists(Model model) throws Exception 
    {

        List<Products> product_list;
		
        product_list = productService.getProduct();

	    model.addAttribute("listOfProducts", product_list);
		

        return "index";
    }
}