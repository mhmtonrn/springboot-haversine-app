package com.softengine.hotel.service.impl;

import com.softengine.hotel.exception.BadRequestException;
import com.softengine.hotel.exception.ElementNotFoundException;
import com.softengine.hotel.model.Hotel;
import com.softengine.hotel.repository.HotelRepository;
import com.softengine.hotel.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
class DefaultHotelService implements HotelService {
    private final HotelRepository hotelRepository;

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getHotelsByCity(Long cityId) {
        return hotelRepository.findAll().stream()
                .filter(hotel -> cityId.equals(hotel.getCity().getId()))
                .collect(Collectors.toList());
    }

    @Override
    public Hotel createNewHotel(Hotel hotel) {
        if (hotel.getId() != null) {
            throw new BadRequestException("The ID must not be provided when creating a new Hotel");
        }

        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(Long id) {
        Optional<Hotel> hotel = hotelRepository.findById(id);
        if (hotel.isPresent()) {
            return hotel.get();
        } else throw new ElementNotFoundException("Records not found with given id");
    }

    @Override
    public void deleteHotelById(Long id) {
        getHotelById(id);
        hotelRepository.deleteById(id);
    }

    @Override
    public List<Hotel> getHotelsOrderByCityCenterDistance(Long cityId) {
        return hotelRepository.getHotelsOrderByCityCenterDistance(cityId);
    }
}
