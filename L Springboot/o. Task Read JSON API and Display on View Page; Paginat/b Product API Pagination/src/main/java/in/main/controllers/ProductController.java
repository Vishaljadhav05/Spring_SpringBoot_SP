package in.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.main.beans.Products;
import in.main.services.ProductService;


@Controller
public class ProductController {
	
	private static final int PAGE_SIZE = 10;
	
	@Autowired
	private ProductService productService;

    @GetMapping("/products")
    public String getProductsLists(Model model,@RequestParam(defaultValue = "1")int page) throws Exception 
    {
    	 
        List<Products> product_list = productService.getProduct();

        int total_products = product_list.size();
        int total_pages = total_products / PAGE_SIZE;
        int start_index = (page-1)*PAGE_SIZE;        //0  //10    //20
        int end_index = start_index+PAGE_SIZE;    //9  //19    //29
        
        
	    model.addAttribute("listOfProducts", product_list.subList(start_index, end_index));
	    model.addAttribute("model_totalPages", total_pages);
	    model.addAttribute("model_currentPage", page);


        return "index";
    }
}