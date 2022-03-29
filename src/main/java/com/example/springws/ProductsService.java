package com.example.springws;

import com.example.api.products.Product;
import com.example.api.products.ProductsList;
import org.springframework.stereotype.Component;

@Component
public class ProductsService {

    public ProductsList getProductsList(String request) {
        ProductsList productsList = new ProductsList();

        // хардкодим три продукта и записываем их в список
        Product product1 = new Product();
        product1.setId(1);
        product1.setTitle("one");
        product1.setPrice(100.01f);

        Product product2 = new Product();
        product2.setId(2);
        product2.setTitle("two");
        product2.setPrice(200.01f);

        Product product3 = new Product();
        product3.setId(3);
        product3.setTitle("three");
        product3.setPrice(300.01f);

        productsList.getProductsList().add(product1);
        productsList.getProductsList().add(product2);
        productsList.getProductsList().add(product3);

        return productsList;
    }

}
