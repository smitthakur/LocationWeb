package com.blackbucks.LocationWeb.Services;

import com.blackbucks.LocationWeb.Repositories.LocationRepository;
import com.blackbucks.LocationWeb.models.Location;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationRepository repository;

    @Override
    public Location saveLocation(Location location) {
        return (Location) repository.save(location);
    }

    @Override
    public Location updateLocation(Location location) {
        return (Location) repository.save(location);
    }

    @Override
    public void deleteLocation(Location location) {
        repository.delete(location);
    }

    @Override
    public Location getLocation(int id) {
        return (Location) repository.findById(id).get();
    }

    @Override
    public List<Location> getAllLocations() {
        return repository.findAll();
    }
}
