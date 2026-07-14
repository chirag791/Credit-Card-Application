package com.example.credit.card.application.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.credit.card.application.model.CreditCard;
import com.example.credit.card.application.service.CreditCardService;

@RestController
@RequestMapping("/cards")
public class CreditCardController {

    private final CreditCardService service;

    public CreditCardController(CreditCardService service) {
        this.service = service;
    }

    // Create
    @PostMapping
    public CreditCard saveCard(@RequestBody CreditCard card) {
        return service.saveCard(card);
    }

    // Read All
    @GetMapping
    public List<CreditCard> getAllCards() {
        return service.getAllCards();
    }

    // Read By Id
    @GetMapping("/{id}")
    public CreditCard getCardById(@PathVariable String id) {
        return service.getCardById(id);
    }

    // Delete
    @DeleteMapping("/{id}")
    public String deleteCard(@PathVariable String id) {
        service.deleteCard(id);
        return "Credit Card Application Deleted Successfully";
    }
}

