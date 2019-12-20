package ltu.dovanos.products.service;


import java.util.List;

import ltu.dovanos.producs.model.Product;

public interface CRUD {

	void createProduct(Product product);

	List<Product> getAllProducts();

	Product getProduct(Long productId);

	void updateProduct(Long productId, Product product);

	void deleteProduct(Long productId);

}