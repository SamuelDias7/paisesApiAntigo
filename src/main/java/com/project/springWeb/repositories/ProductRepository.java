package com.project.springWeb.repositories;

import com.project.springWeb.models.ProductModel;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductModel, Integer> {

    Iterable<ProductModel> findAll();

    ProductModel findByid(int id);
}
