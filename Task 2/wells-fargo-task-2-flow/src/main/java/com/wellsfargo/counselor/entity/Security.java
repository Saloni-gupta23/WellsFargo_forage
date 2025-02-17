package com.example.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private LocalDate purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    public Security() {}

    public Security(String name, String category, LocalDate purchaseDate, double purchasePrice, int quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Long getSecurityId() { return securityId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
}
