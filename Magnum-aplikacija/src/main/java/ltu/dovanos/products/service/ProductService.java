package ltu.dovanos.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import ltu.dovanos.producs.dao.ProductsRepository;
import ltu.dovanos.producs.model.Product;

public class ProductService implements CRUD {
	@Autowired
	private ProductsRepository productsRepository;

	@Override
	@Transactional
	public void createProduct(Product product) {
		this.productsRepository.save(product);
	}

	@Override
	@Transactional
	public List<Product> getAllProducts() {
		return this.productsRepository.findAll();
	}

	@Override
	@Transactional
	public Product getProduct(Long productId) {
		return this.productsRepository.findById(productId).orElse(null);
	}

	@Override
	@Transactional
	public void updateProduct(Long productId, Product product) {
		if (this.productsRepository.existsById(productId)) {
			this.productsRepository.deleteById(productId);
			this.productsRepository.save(product);
		}
	}

	@Override
	public void deleteProduct(Long productId) {
		this.productsRepository.deleteById(productId);
	}

}