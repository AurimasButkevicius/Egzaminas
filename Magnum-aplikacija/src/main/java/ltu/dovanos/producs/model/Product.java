package ltu.dovanos.producs.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String title;
	@Column
	private String type;
	
	@OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
	private ProductDetails productDetails;

	public Product() {
	}

	public Product(String title, String type, String imageUrl, String details) {
		this.title = title;
		this.type = type;
		this.productDetails = new ProductDetails(imageUrl, details, this);
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getPrice() {
		return type;
	}



	public ProductDetails getProductDetails() {
		return productDetails;
	}

}