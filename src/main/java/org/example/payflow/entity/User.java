package org.example.payflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // safer than "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String name;

    @Column(name = "upi_id", unique = true, nullable = false)
    private String upiId;

    private Double balance;

    @Column(name = "phone_number")
    private String phoneNumber;

    public User() {}

    public User(String name, String upiId, Double balance, String phoneNumber) {
        this.name = name;
        this.upiId = upiId;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters
}