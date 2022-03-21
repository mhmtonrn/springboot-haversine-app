package com.softengine.hotel.repository;

import com.softengine.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
    String  HAVERSINE_FORMULA = "6371 * acos(cos(radians(h.city.cityCentreLatitude)) * cos(radians(h.latitude)) * cos(radians(h.longitude) - radians(h.city.cityCentreLongitude)) + sin(radians(h.city.cityCentreLatitude)) * sin(radians(h.latitude)))";

    @Query("SELECT h FROM Hotel h WHERE h.city.id = ?1 ORDER BY "+ HAVERSINE_FORMULA +  " ASC" )
    List<Hotel> getHotelsOrderByCityCenterDistance(@Param("cityId") Long cityId);

}