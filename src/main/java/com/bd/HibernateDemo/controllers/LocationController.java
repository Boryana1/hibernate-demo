package com.bd.HibernateDemo.controllers;
import com.bd.HibernateDemo.models.Location;
import com.bd.HibernateDemo.models.User;
import com.bd.HibernateDemo.repositories.LocationRepository;
import com.bd.HibernateDemo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @GetMapping("/locations/{id}")
    public Optional<Location> getLocationById(@PathVariable Integer id){
        return locationService.getLocationById(id);
    }

    @GetMapping("/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id) {
        Optional<Location> location = locationService.getLocationById(id);

        if(location.isPresent()) {
            Location newLocation = location.get();
            return newLocation.getUsers();
        }else{
            return null;
        }
    }

    @PostMapping("/locations/addNew")
    public void AddLocation(@RequestBody Location location) {
        locationService.AddLocation(location);
    }

    @PutMapping("/locations/{id}/update")
    public void UpdateLocation(@RequestBody Location location) {
        locationService.updateLocation(location);
    }

}
