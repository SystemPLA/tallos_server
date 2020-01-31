package ru.systempla.talos_server.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {

    private Integer orderId;
    private String clientName;
    private Date creationDate;
    private Date acceptionDate;
    private Date returnDate;
    private long typeOneCount;
    private long typeTwoCount;
    private long typeThreeCount;
    private long typeFourCount;
    private long typeFiveCount;
    private long typeSixCount;
    private long typeSevenCount;
    private String orderStatus;

    public Order(Integer orderId, String clientName, Date creationDate, Date acceptionDate, Date returnDate,
                 long typeOneCount, long typeTwoCount, long typeThreeCount, long typeFourCount, long typeFiveCount,
                 long typeSixCount, long typeSevenCount, String orderStatus) {
        this.orderId = orderId;
        this.clientName = clientName;
        this.creationDate = creationDate;
        this.acceptionDate = acceptionDate;
        this.returnDate = returnDate;
        this.typeOneCount = typeOneCount;
        this.typeTwoCount = typeTwoCount;
        this.typeThreeCount = typeThreeCount;
        this.typeFourCount = typeFourCount;
        this.typeFiveCount = typeFiveCount;
        this.typeSixCount = typeSixCount;
        this.typeSevenCount = typeSevenCount;
        this.orderStatus = orderStatus;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    public Integer getOrderId() {
        return orderId;
    }

    @Column(name = "client_name", nullable = false)
    public String getClientName() {
        return clientName;
    }

    @Column(name = "creation_date", nullable = false)
    public Date getCreationDate() {
        return creationDate;
    }

    @Column(name = "acception_date")
    public Date getAcceptionDate() {
        return acceptionDate;
    }

    @Column(name = "return_date")
    public Date getReturnDate() {
        return returnDate;
    }

    @Column(name = "1_count", nullable = false)
    public long getTypeOneCount() {
        return typeOneCount;
    }

    @Column(name = "2_count", nullable = false)
    public long getTypeTwoCount() {
        return typeTwoCount;
    }

    @Column(name = "3_count", nullable = false)
    public long getTypeThreeCount() {
        return typeThreeCount;
    }

    @Column(name = "4_count", nullable = false)
    public long getTypeFourCount() {
        return typeFourCount;
    }

    @Column(name = "5_count", nullable = false)
    public long getTypeFiveCount() {
        return typeFiveCount;
    }

    @Column(name = "6_count", nullable = false)
    public long getTypeSixCount() {
        return typeSixCount;
    }

    @Column(name = "7_count", nullable = false)
    public long getTypeSevenCount() {
        return typeSevenCount;
    }

    @Column(name = "order_status", nullable = false)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setAcceptionDate(Date acceptionDate) {
        this.acceptionDate = acceptionDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setTypeOneCount(long typeOneCount) {
        this.typeOneCount = typeOneCount;
    }

    public void setTypeTwoCount(long typeTwoCount) {
        this.typeTwoCount = typeTwoCount;
    }

    public void setTypeThreeCount(long typeThreeCount) {
        this.typeThreeCount = typeThreeCount;
    }

    public void setTypeFourCount(long typeFourCount) {
        this.typeFourCount = typeFourCount;
    }

    public void setTypeFiveCount(long typeFiveCount) {
        this.typeFiveCount = typeFiveCount;
    }

    public void setTypeSixCount(long typeSixCount) {
        this.typeSixCount = typeSixCount;
    }

    public void setTypeSevenCount(long typeSevenCount) {
        this.typeSevenCount = typeSevenCount;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
