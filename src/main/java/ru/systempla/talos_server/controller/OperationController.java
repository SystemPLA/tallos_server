package ru.systempla.talos_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.systempla.talos_server.model.StorageOperation;
import ru.systempla.talos_server.service.OperationService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RequestMapping("api/v1/operations")
@RestController
public class OperationController {

    private final OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping
    public ResponseEntity<?> create(@Valid @RequestBody StorageOperation storageOperation) {
        operationService.create(storageOperation);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<StorageOperation>> read() {
        final List<StorageOperation> storageOperations = operationService.readAll();

        return storageOperations != null &&  !storageOperations.isEmpty()
                ? new ResponseEntity<>(storageOperations, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Optional<StorageOperation>> read(@PathVariable(name = "id") Integer id) {
        final Optional<StorageOperation> storageOperation = operationService.read(id);

        return !storageOperation.isEmpty()
                ? new ResponseEntity<>(storageOperation, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") Integer id, @Valid @RequestBody StorageOperation storageOperation) {
        final int updated = operationService.update(storageOperation, id);

        return updated==1
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer id) {
        final int deleted = operationService.delete(id);

        return deleted==1
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
