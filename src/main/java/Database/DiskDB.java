package Database;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

		import Order.Product;

public class DiskDB {
	private ArrayList<Product> products = new ArrayList<Product>();

	public ArrayList<Product> getProductsfromDisk() {
		ObjectMapper objectMapper = new ObjectMapper();
		products = objectMapper.readValue(new File("src/test/resources/json_car.json"), products);
		return products;
	}

	public void writeProductsToDisk(ArrayList<Product> products)
			throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("/CarCosCan-Livreisan/src/test/resources/Database/products.json"), products);
	}
}
