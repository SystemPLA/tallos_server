package ru.systempla.talos_server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "products")
public class Product {

    private final UUID id;

    private String name;
    private String source;
    private String status;
    private long count;

    public Product(UUID id, String name, String source, String status, long count) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.status = status;
        this.count = count;
    }

    @Id
    public UUID getId() {
        return id;
    }

    @Column(name = "product_name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "product_source", nullable = false)
    public String getSource() {
        return source;
    }

    @Column(name = "product_status", nullable = false)
    public String getStatus() {
        return status;
    }

    @Column(name = "product_count", nullable = false)
    public long getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
