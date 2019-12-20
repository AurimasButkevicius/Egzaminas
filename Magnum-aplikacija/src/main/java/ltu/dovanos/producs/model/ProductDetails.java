package ltu.dovanos.producs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class ProductDetails {
	@Id
	private Long detailsId;
	@Column
	private String imageUrl;
	@Column
	private String details;
	@OneToOne
	@MapsId
	private Product product;

	public ProductDetails() {
	}

	public ProductDetails(String imageUrlString, String details, Product product) {
		this.imageUrl = imageUrlString;
		this.details = details;
		this.product = product;
	}

	public String getImageUrlString() {
		return imageUrl;
	}

	public String getDetails() {
		return details;
	}

}