package com.softengine.hotel.controller;

import com.softengine.hotel.model.City;
import com.softengine.hotel.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
@RequiredArgsConstructor
public class CityController {
  private final CityService cityService;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<City> getAllCities() {
    return cityService.getAllCities();
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public City createCity(@RequestBody City city) {
    return cityService.createCity(city);
  }
}
