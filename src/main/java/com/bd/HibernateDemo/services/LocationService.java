package com.bd.HibernateDemo.services;
import com.bd.HibernateDemo.models.Location;
import com.bd.HibernateDemo.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getAllLocations() {
        return (List<Location>) locationRepository.findAll();
    }

    public Optional<Location> getLocationById(Integer id) {
        return locationRepository.findById(id);
    }

    public void addLocation(Location location) {
        locationRepository.save(location);
    }

    public void updateLocation(Integer id, Location location) {
        location.setId(id);
        locationRepository.save(location);
    }

    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }
}
