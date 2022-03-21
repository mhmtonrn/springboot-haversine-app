package com.softengine.hotel.controller;

import com.softengine.hotel.model.Hotel;
import com.softengine.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Hotel createHotel(@RequestBody Hotel hotel) {
        return hotelService.createNewHotel(hotel);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteHotel(@PathVariable Long id) {
         hotelService.deleteHotelById(id);
    }

    @GetMapping("/search/{cityId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Hotel> getHotelsOrderByCityCenterDistance(@PathVariable("cityId") Long cityId) {
        return hotelService.getHotelsOrderByCityCenterDistance(cityId) ;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Hotel getHotel(@PathVariable Long id) {
        return hotelService.getHotelById(id);
    }

}
