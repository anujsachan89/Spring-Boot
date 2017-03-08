package anuj.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import anuj.springframework.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}
