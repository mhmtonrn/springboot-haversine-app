package com.softengine.hotel.service.impl;

import com.softengine.hotel.exception.BadRequestException;
import com.softengine.hotel.exception.ElementNotFoundException;
import com.softengine.hotel.model.City;
import com.softengine.hotel.repository.CityRepository;
import com.softengine.hotel.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class DefaultCityService implements CityService {
  private final CityRepository cityRepository;

  @Autowired
  DefaultCityService(CityRepository cityRepository) {
    this.cityRepository = cityRepository;
  }

  @Override
  public City getCityById(Long id) {
    return cityRepository
        .findById(id)
        .orElseThrow(() -> new ElementNotFoundException("Could not find city with ID provided"));
  }

  @Override
  public List<City> getAllCities() {
    return cityRepository.findAll();
  }

  @Override
  public City createCity(City city) {
    if (city.getId() != null) {
      throw new BadRequestException("The ID must not be provided when creating a new City");
    }

    return cityRepository.save(city);
  }
}
