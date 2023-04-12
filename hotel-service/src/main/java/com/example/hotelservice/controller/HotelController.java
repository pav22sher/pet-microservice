package com.example.hotelservice.controller;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Hotel> get() {
        return hotelService.get();
    }

    @GetMapping("/{hotelId}")
    public Hotel getById(@PathVariable String hotelId) {
        return hotelService.getById(hotelId);
    }

    @PostMapping
    public Hotel save(@RequestBody Hotel hotel) {
        return hotelService.save(hotel);
    }
}
