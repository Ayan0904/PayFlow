package org.example.payflow.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "sender_upi_id")
    private String senderUpiId;

    @Column(name = "receiver_upi_id")
    private String receiverUpiId;

    private Double amount;

    private String note;

    public Transaction() {}

    public Transaction(String senderUpiId, String receiverUpiId, Double amount, String note) {
        this.senderUpiId = senderUpiId;
        this.receiverUpiId = receiverUpiId;
        this.amount = amount;
        this.note = note;
    }

    // Getters & Setters
}