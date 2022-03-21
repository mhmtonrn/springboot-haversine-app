package com.softengine.hotel.service;

import com.softengine.hotel.model.Hotel;

import java.util.List;

public interface HotelService {
  List<Hotel> getAllHotels();

  List<Hotel> getHotelsByCity(Long cityId);

  Hotel createNewHotel(Hotel hotel);

  Hotel getHotelById(Long id);

  void deleteHotelById(Long id);

  List<Hotel> getHotelsOrderByCityCenterDistance(Long cityId);
}
