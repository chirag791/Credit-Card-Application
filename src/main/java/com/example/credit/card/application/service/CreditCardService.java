package com.example.credit.card.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.credit.card.application.model.CreditCard;
import com.example.credit.card.application.repository.CreditCardRepository;

@Service
public class CreditCardService {

    private final CreditCardRepository repository;

    public CreditCardService(CreditCardRepository repository) {
        this.repository = repository;
    }

    public CreditCard saveCard(CreditCard card) {
        return repository.save(card);
    }

    public List<CreditCard> getAllCards() {
        return repository.findAll();
    }

    public CreditCard getCardById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteCard(String id) {
        repository.deleteById(id);
    }
}

