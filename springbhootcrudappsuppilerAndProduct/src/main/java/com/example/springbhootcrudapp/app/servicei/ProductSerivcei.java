package com.example.springbhootcrudapp.app.servicei;

import java.util.List;
import java.util.Optional;

import com.example.springbhootcrudapp.app.model.Product;

public interface ProductSerivcei 
{
	Product saveProduct(Product p);

	List<Product> getProducts();

	Product updateProduct(int productId, Product p);

   void  deleteProduct(int productId);

   Optional<Product> getProductById(int productId);


}
