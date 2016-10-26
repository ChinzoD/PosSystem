package com.concise.pos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	Product getProductByProductId(Integer productID);

	// findAll comes with repository
	@Query("SELECT p FROM Product p")
	public List<Product> getAllProducts();

	@Query("SELECT p FROM Product p where p.productId = :productId")
	Product getProductById(@Param("productId") String key);
	
	@Query("SELECT p FROM Product p where p.category.categoryId = :categoryId" )
	List<Product> getProductsByCategory(@Param("categoryId") String category);

}
