package ru.systempla.talos_server.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "operations")
public class StorageOperation {

    private int id;
    private LocalDate date;
    private String customerName;
    private String type;
    private boolean isPerformed;
    private int stairsFrameCount;
    private int passFrameCount;
    private int diagonalConnectionCount;
    private int horizontalConnectionCount;
    private int crossbarCount;
    private int deckCount;
    private int supportsCount;
    private int stairsFrameBadCount;
    private int passFrameBadCount;
    private int diagonalConnectionBadCount;
    private int horizontalConnectionBadCount;
    private int crossbarBadCount;
    private int deckBadCount;
    private int supportsBadCount;

    public StorageOperation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "operation_id")
    public int getId() {
        return id;
    }

    public StorageOperation(int id, LocalDate date, String customerName, String type,
                            boolean isPerformed, int stairsFrameCount, int passFrameCount,
                            int diagonalConnectionCount, int horizontalConnectionCount,
                            int crossbarCount, int deckCount, int supportsCount,
                            int stairsFrameBadCount, int passFrameBadCount, int diagonalConnectionBadCount,
                            int horizontalConnectionBadCount, int crossbarBadCount, int deckBadCount,
                            int supportsBadCount) {
        this.id = id;
        this.date = date;
        this.customerName = customerName;
        this.type = type;
        this.isPerformed = isPerformed;
        this.stairsFrameCount = stairsFrameCount;
        this.passFrameCount = passFrameCount;
        this.diagonalConnectionCount = diagonalConnectionCount;
        this.horizontalConnectionCount = horizontalConnectionCount;
        this.crossbarCount = crossbarCount;
        this.deckCount = deckCount;
        this.supportsCount = supportsCount;
        this.stairsFrameBadCount = stairsFrameBadCount;
        this.passFrameBadCount = passFrameBadCount;
        this.diagonalConnectionBadCount = diagonalConnectionBadCount;
        this.horizontalConnectionBadCount = horizontalConnectionBadCount;
        this.crossbarBadCount = crossbarBadCount;
        this.deckBadCount = deckBadCount;
        this.supportsBadCount = supportsBadCount;
    }

    @Column(name = "date")
    public LocalDate getDate() {
        return date;
    }

    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    @Column(name = "customer_type")
    public String getType() {
        return type;
    }

    @Column(name = "is_performed")
    public boolean isPerformed() {
        return isPerformed;
    }

    @Column(name = "stairs_frame_count")
    public int getStairsFrameCount() {
        return stairsFrameCount;
    }

    @Column(name = "pass_frame_count")
    public int getPassFrameCount() {
        return passFrameCount;
    }

    @Column(name = "diagonal_connection_count")
    public int getDiagonalConnectionCount() {
        return diagonalConnectionCount;
    }

    @Column(name = "horizontal_connection_count")
    public int getHorizontalConnectionCount() {
        return horizontalConnectionCount;
    }

    @Column(name = "crossbar_count")
    public int getCrossbarCount() {
        return crossbarCount;
    }

    @Column(name = "deck_count")
    public int getDeckCount() {
        return deckCount;
    }

    @Column(name = "supports_count")
    public int getSupportsCount() {
        return supportsCount;
    }

    @Column(name = "stairs_frame_bad_count")
    public int getStairsFrameBadCount() {
        return stairsFrameBadCount;
    }

    @Column(name = "pass_frame_bad_count")
    public int getPassFrameBadCount() {
        return passFrameBadCount;
    }

    @Column(name = "diagonal_connection_bad_count")
    public int getDiagonalConnectionBadCount() {
        return diagonalConnectionBadCount;
    }

    @Column(name = "horizontal_connection_bad_count")
    public int getHorizontalConnectionBadCount() {
        return horizontalConnectionBadCount;
    }

    @Column(name = "crossbar_bad_count")
    public int getCrossbarBadCount() {
        return crossbarBadCount;
    }

    @Column(name = "deck_bad_count")
    public int getDeckBadCount() {
        return deckBadCount;
    }

    @Column(name = "supports_bad_count")
    public int getSupportsBadCount() {
        return supportsBadCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPerformed(boolean performed) {
        isPerformed = performed;
    }

    public void setStairsFrameCount(int stairsFrameCount) {
        this.stairsFrameCount = stairsFrameCount;
    }

    public void setPassFrameCount(int passFrameCount) {
        this.passFrameCount = passFrameCount;
    }

    public void setDiagonalConnectionCount(int diagonalConnectionCount) {
        this.diagonalConnectionCount = diagonalConnectionCount;
    }

    public void setHorizontalConnectionCount(int horizontalConnectionCount) {
        this.horizontalConnectionCount = horizontalConnectionCount;
    }

    public void setCrossbarCount(int crossbarCount) {
        this.crossbarCount = crossbarCount;
    }

    public void setDeckCount(int deckCount) {
        this.deckCount = deckCount;
    }

    public void setSupportsCount(int supportsCount) {
        this.supportsCount = supportsCount;
    }

    public void setStairsFrameBadCount(int stairsFrameBadCount) {
        this.stairsFrameBadCount = stairsFrameBadCount;
    }

    public void setPassFrameBadCount(int passFrameBadCount) {
        this.passFrameBadCount = passFrameBadCount;
    }

    public void setDiagonalConnectionBadCount(int diagonalConnectionBadCount) {
        this.diagonalConnectionBadCount = diagonalConnectionBadCount;
    }

    public void setHorizontalConnectionBadCount(int horizontalConnectionBadCount) {
        this.horizontalConnectionBadCount = horizontalConnectionBadCount;
    }

    public void setCrossbarBadCount(int crossbarBadCount) {
        this.crossbarBadCount = crossbarBadCount;
    }

    public void setDeckBadCount(int deckBadCount) {
        this.deckBadCount = deckBadCount;
    }

    public void setSupportsBadCount(int supportsBadCount) {
        this.supportsBadCount = supportsBadCount;
    }
}
