package ru.systempla.talos_server.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Order;
import ru.systempla.talos_server.model.StorageOperation;
import ru.systempla.talos_server.repository.OperationsRepository;
import ru.systempla.talos_server.repository.OrdersRepository;

import java.util.List;
import java.util.Optional;

@Repository("PostgresOperationDao")
public class PostgreSqlOperationDataAccessService implements OperationDao {

    @Autowired
    private OperationsRepository operationsRepository;

    @Override
    public int insertProduct(StorageOperation storageOperation) {
        operationsRepository.save(storageOperation);
        return 1;
    }

    @Override
    public List<StorageOperation> selectAllProducts() {
        return operationsRepository.findAll();
    }

    @Override
    public Optional<StorageOperation> selectProductById(Integer id) {
       return operationsRepository.findById(id);
    }

    @Override
    public int deleteProductById(Integer id) {
        Optional<StorageOperation> result = operationsRepository.findById(id);
        if (result.isEmpty()) {
            return 0;
        } else {
            operationsRepository.delete(result.get());
            return 1;
        }
    }

    @Override
    public int updateProductById(Integer id, StorageOperation update) {
        Optional<StorageOperation> result = selectProductById(id);
        if (result.isEmpty()) return 0;
        operationsRepository.save(new StorageOperation(id, update.getDate(), update.getCustomerName(), update.getType(),
                update.isPerformed(), update.getStairsFrameCount(), update.getPassFrameCount(), update.getDiagonalConnectionCount(),
                update.getHorizontalConnectionCount(), update.getCrossbarCount(), update.getDeckCount(), update.getSupportsCount(),
                update.getStairsFrameBadCount(), update.getPassFrameBadCount(), update.getDiagonalConnectionBadCount(),
                update.getHorizontalConnectionBadCount(), update.getCrossbarBadCount(),
                update.getDeckBadCount(), update.getSupportsBadCount()));
        return 1;
    }
}
