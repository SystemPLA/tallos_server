package ru.systempla.talos_server.model;

import javax.persistence.*;

@Entity
@Table(name = "info_data")
public class InfoData {

    private int infoId;
    private String name;
    private float weight;
    private float priceSv;
    private float priceRin;
    private float priceDzsl;

    public InfoData(int infoId, String name, float weight, float priceSv, float priceRin, float priceDzsl) {
        this.infoId = infoId;
        this.name = name;
        this.weight = weight;
        this.priceSv = priceSv;
        this.priceRin = priceRin;
        this.priceDzsl = priceDzsl;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getInfoId() {
        return infoId;
    }

    @Column(name = "info_product_name", nullable = false)
    public String getName() {
        return name;
    }

    @Column(name = "info_weight", nullable = false)
    public float getWeight() {
        return weight;
    }

    @Column(name = "price_sv", nullable = false)
    public float getPriceSv() {
        return priceSv;
    }

    @Column(name = "price_rin", nullable = false)
    public float getPriceRin() {
        return priceRin;
    }

    @Column(name = "price_dzsl", nullable = false)
    public float getPriceDzsl() {
        return priceDzsl;
    }
}
