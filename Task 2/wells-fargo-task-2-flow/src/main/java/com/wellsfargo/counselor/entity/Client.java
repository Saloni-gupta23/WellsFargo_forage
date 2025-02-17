package com.example.entities;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    @JoinColumn(name = "advisor_id")
    private FinancialAdvisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL)
    private Portfolio portfolio;

    public Client() {}

    public Client(String name, String email, String phone, FinancialAdvisor advisor) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.advisor = advisor;
    }

    public Long getClientId() { return clientId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
