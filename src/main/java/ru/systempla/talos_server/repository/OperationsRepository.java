package ru.systempla.talos_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.systempla.talos_server.model.Order;
import ru.systempla.talos_server.model.StorageOperation;

@Repository
public interface OperationsRepository extends JpaRepository<StorageOperation, Integer> {
}
