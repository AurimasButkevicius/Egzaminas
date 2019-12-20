package ltu.dovanos.producs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import ltu.dovanos.producs.model.CreateProduct;
import ltu.dovanos.producs.model.Product;
import ltu.dovanos.products.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;

	public ProductController() {
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Create product", notes = "Creates new shop product.")
	public void createProduct(
			@ApiParam(value = "Product data", required = true) @RequestBody final CreateProduct command) {
		this.productService.createProduct(new Product(command.getTitle(), command.getType(), command.getImageUrl(), command.getDescription()));
	}

	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get all products", notes = "Returns all products.")
	public List<Product> getAllProducts() {
		return this.productService.getAllProducts();
	}

	@RequestMapping(path = "/{productId}", method = RequestMethod.GET)
	@ApiOperation(value = "Get single product", notes = "Rerturns single product by provided product id.")
	public Product getProduct(@PathVariable Long productId) {
		return this.productService.getProduct(productId);
	}

	@RequestMapping(path = "/{productId}", method = RequestMethod.PUT)
	@ApiOperation(value = "Updates product", notes = "Updates product using provided product id.")
	public void updateProduct(@PathVariable("productId") Long productId,
			@RequestBody final CreateProduct command) {
		this.productService.updateProduct(productId, new Product(command.getTitle(), command.getType(),
				command.getImageUrl(), command.getDescription()));
	}

	@RequestMapping(path = "/{productId}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Deletes product", notes = "Deletes product using provided product id.")
	public void deleteProduct(@PathVariable Long productId) {
		this.productService.deleteProduct(productId);
	}

}