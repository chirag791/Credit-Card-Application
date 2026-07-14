package com.example.credit.card.application.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.credit.card.application.model.CreditCard;

public interface CreditCardRepository extends MongoRepository<CreditCard, String> {

}