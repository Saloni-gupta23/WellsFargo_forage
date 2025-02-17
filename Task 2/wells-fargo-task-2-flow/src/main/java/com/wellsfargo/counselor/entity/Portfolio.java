package com.example.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private Set<Security> securities;

    public Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() { return portfolioId; }
    public Client getClient() { return client; }
}
