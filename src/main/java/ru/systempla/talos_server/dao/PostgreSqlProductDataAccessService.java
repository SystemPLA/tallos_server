package ru.systempla.talos_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Product;
import ru.systempla.talos_server.repository.ProductsRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PostgresProductDao")
public class PostgreSqlProductDataAccessService implements ProductDao {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public int insertProduct(UUID id, Product product) {
        productsRepository.save(new Product(id, product.getName(), product.getSource(), product.getStatus(), product.getCount()));
        return 1;
    }

    @Override
    public List<Product> selectAllProducts() {
        return productsRepository.findAll();
    }

    @Override
    public Optional<Product> selectProductById(UUID id) {
       return productsRepository.findById(id);
    }

    @Override
    public int deleteProductById(UUID id) {
        Optional<Product> result = productsRepository.findById(id);
        if (result.isEmpty()) {
            return 0;
        } else {
            productsRepository.delete(result.get());
            return 1;
        }
    }

    @Override
    public int updateProductById(UUID id, Product update) {
        Optional<Product> result = selectProductById(id);
        if (result.isEmpty()) return 0;
        insertProduct(id, update);
        return 1;
    }
}
