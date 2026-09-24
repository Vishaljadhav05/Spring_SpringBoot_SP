package in.main.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import in.main.beans.Products;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;



@Service
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductService
{
	public List<Products> getProduct() throws Exception
	{
		String url = "https://dummyjson.com/products";
		
		RestTemplate restTemplate = new RestTemplate();
		String jsonStr = restTemplate.getForObject(url, String.class);
		System.out.println("1 : "+ jsonStr);
		
		ObjectMapper mapper = new ObjectMapper();
		// mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
		
		
		JsonNode rootNode = mapper.readTree(jsonStr);
		System.out.println("2 : "+ rootNode);
		
		JsonNode productsNode = rootNode.get("products");
		System.out.println(productsNode);
		System.out.println("3 : "+ productsNode);
		
		List<Products> products_list = mapper.readValue(productsNode.toString(), new TypeReference<List<Products>>() {});
		System.out.println("4 : "+products_list);
		
		return products_list;
	}
}
