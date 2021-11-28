package com.djamware.springmvc.repositories; 
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.djamware.springrnvc.models.Product; 

public interface ProductRepository extends JpaRepository<Product, Long> { 
Product findByProdName(final String prodName); 
}