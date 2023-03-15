package com.example.restweb;

class OrderNotFoundException extends RuntimeException {
    OrderNotFoundException(Long id) {
        super("Could not find the order " + id);
    }
}
