package ru.systempla.talos_server.service;

import ru.systempla.talos_server.model.StorageOperation;

import java.util.List;
import java.util.Optional;

public interface OperationService {

    int create(StorageOperation storageOperation);

    List<StorageOperation> readAll();

    Optional<StorageOperation> read(Integer id);

    int update(StorageOperation storageOperation, Integer id);

    int delete(Integer id);
}
