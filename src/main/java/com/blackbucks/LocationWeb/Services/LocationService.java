package com.blackbucks.LocationWeb.Services;

import com.blackbucks.LocationWeb.models.Location;

import java.util.List;

public interface LocationService {
    public Location saveLocation(Location location);
    public Location updateLocation(Location location);
    public void deleteLocation(Location location);
    public Location getLocation(int id);
    public List<Location> getAllLocations();
}
