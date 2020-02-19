package ru.systempla.talos_server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.systempla.talos_server.dao.OperationDao;
import ru.systempla.talos_server.dao.OrderDao;
import ru.systempla.talos_server.model.Order;
import ru.systempla.talos_server.model.StorageOperation;

import java.util.List;
import java.util.Optional;

@Service
public class OperationServiceImpl implements OperationService{

    private final OperationDao operationDao;

    @Autowired
    public OperationServiceImpl(@Qualifier("PostgresOperationDao") OperationDao operationDao){
        this.operationDao = operationDao;
    }

    @Override
    public int create(StorageOperation storageOperation) {
        return operationDao.insertProduct(storageOperation);
    }

    @Override
    public List<StorageOperation> readAll() {
        return operationDao.selectAllProducts();
    }

    @Override
    public Optional<StorageOperation> read(Integer id) {
        return operationDao.selectProductById(id) ;
    }

    @Override
    public int update(StorageOperation storageOperation, Integer id) {
        return operationDao.updateProductById(id, storageOperation);
    }

    @Override
    public int delete(Integer id) {
        return operationDao.deleteProductById(id);
    }
}
