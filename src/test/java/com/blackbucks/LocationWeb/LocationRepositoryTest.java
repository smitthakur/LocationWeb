package com.blackbucks.LocationWeb;

import com.blackbucks.LocationWeb.Repositories.LocationRepository;
import com.blackbucks.LocationWeb.models.Location;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LocationRepositoryTest {

    @Autowired
    private LocationRepository repository;

    @Test
    public void testSaveLocation(){
        Location location=new Location();
        location.setId(1);
        location.setCode("MUM");
        location.setName("Mumbai");
        location.setType("Urban");
        repository.save(location);
    }
}
