package com.blackbucks.LocationWeb.controllers;

import com.blackbucks.LocationWeb.Services.LocationServiceImpl;
import com.blackbucks.LocationWeb.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


public class LocationRestController {

    @Autowired
    LocationServiceImpl service;

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return service.saveLocation(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location) {
        return service.updateLocation(location);

    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id) {
        service.deleteLocation(id);
    }

    @GetMapping("/{id}")
    public Location getLocation(@PathVariable("id") int id) {
        return service.getLocation(id);
    }
}
