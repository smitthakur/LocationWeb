package com.blackbucks.LocationWeb;

import com.blackbucks.LocationWeb.Repositories.LocationRepository;
import com.blackbucks.LocationWeb.models.Location;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LocationWebApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private LocationRepository repository;

	@Test
	public void testSaveLocation(){
		Location location=new Location();
		location.setId(2);
		location.setCode("DEL");
		location.setName("Delhi");
		location.setType("Rural");
		repository.save(location);
	}

}
