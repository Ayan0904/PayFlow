package org.example.payflow.service;

import org.example.payflow.entity.Transaction;
import org.example.payflow.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction sendMoney(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}