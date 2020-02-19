package ru.systempla.talos_server.dao;

import ru.systempla.talos_server.model.StorageOperation;

import java.util.List;
import java.util.Optional;

public interface OperationDao {

    int insertProduct(StorageOperation storageOperation);

    List<StorageOperation> selectAllProducts();

    Optional<StorageOperation> selectProductById(Integer id);

    int deleteProductById(Integer id);

    int updateProductById(Integer id, StorageOperation update);
}
