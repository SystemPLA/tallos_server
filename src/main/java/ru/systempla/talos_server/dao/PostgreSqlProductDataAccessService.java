package ru.systempla.talos_server.dao;

import ru.systempla.talos_server.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PostgreSqlProductDataAccessService implements ProductDao {

    @Override
    public int insertProduct(UUID id, Product product) {
        return 0;
    }

    @Override
    public int insertProduct(Product product) {
        return 0;
    }

    @Override
    public List<Product> selectAllProducts() {
        return null;
    }

    @Override
    public Optional<Product> selectProductById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteProductById(UUID id) {
        return 0;
    }

    @Override
    public int updateProductById(UUID id, Product update) {
        return 0;
    }
}
