package edu.fatec.di.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.fatec.di.model.Product;

@Repository
public interface ProductService extends CrudRepository<Product, Long>{

	Page<Product> findAll(Pageable pageable);

}
