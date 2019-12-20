package ltu.dovanos.producs.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ltu.dovanos.producs.model.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}