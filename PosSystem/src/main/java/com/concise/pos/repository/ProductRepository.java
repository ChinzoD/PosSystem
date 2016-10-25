package com.concise.pos.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>, JpaSpecificationExecutor<Product> {
	Product getProductByProductId(String key);

	// findAll comes with repository
	@Query("SELECT p FROM PRODUCT p")
	public List<Product> getAllProducts();

	@Query("SELECT p FROM PRODUCT p where PRODUCTID = :productId")
	Product getProductById(@Param("productId") String key);

	List<Product> getProductsByCategory(String category);

}
