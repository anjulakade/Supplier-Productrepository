package com.example.springbhootcrudapp.app.repositoryi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbhootcrudapp.app.model.Product;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
