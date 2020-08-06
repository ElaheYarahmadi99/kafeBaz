package model.repository;

import model.entity.products.Product;

import java.util.List;

public interface ProductDA {

    void insertToDB(Product product);
    void updateDB(Product product);
    void delete(long id);
    List<Product> selectAll();
}
