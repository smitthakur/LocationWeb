package com.blackbucks.LocationWeb;

import com.blackbucks.LocationWeb.Services.LocationService;
import com.blackbucks.LocationWeb.Services.LocationServiceImpl;
import com.blackbucks.LocationWeb.models.Location;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LocationServiceTest {

    @Autowired
    private LocationService service;

    @Test
    void testCreateNewLocation(){
        Location location=new Location();
        location.setId(3);
        location.setCode("BAN");
        location.setName("Bangalore");
        location.setType("Rural");
        service.saveLocation(location);
    }
}
