package com.blackbucks.LocationWeb.controllers;

import com.blackbucks.LocationWeb.Services.LocationService;
import com.blackbucks.LocationWeb.Services.LocationServiceImpl;
import com.blackbucks.LocationWeb.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RequestMapping("/products")
public class LocationController {

    @Autowired
    LocationServiceImpl service;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation=service.saveLocation(location);
        String msg="Location saved with id "+ location.getId();
        modelMap.addAttribute("msg",msg);
        return "createLocation";
    }

    @RequestMapping("/displayLoc")
    public String viewLocations(ModelMap modelMap){
        List<Location> locations= service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }
}
