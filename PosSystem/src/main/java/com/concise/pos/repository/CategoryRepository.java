package com.concise.pos.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.concise.pos.domain.Category;
import com.concise.pos.domain.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>, JpaSpecificationExecutor<Product> {
	@Query("SELECT c.Pname from catagory c where c.name = :name")
	List<Product> getProductsByCategory(@Param("name") String category);

}
