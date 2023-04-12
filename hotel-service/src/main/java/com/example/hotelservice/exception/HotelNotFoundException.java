package com.example.hotelservice.exception;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException() {
        super("Отель не найден!");
    }

    public HotelNotFoundException(String message) {
        super(message);
    }
}
