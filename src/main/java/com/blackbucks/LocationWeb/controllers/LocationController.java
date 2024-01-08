package com.blackbucks.LocationWeb.controllers;

import com.blackbucks.LocationWeb.Services.LocationService;
import com.blackbucks.LocationWeb.Services.LocationServiceImpl;
import com.blackbucks.LocationWeb.models.Location;
import com.blackbucks.LocationWeb.util.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/locationWeb")
public class LocationController {

    @Autowired
    LocationServiceImpl service;

    @Autowired
    EmailUtil emailUtil;

    @RequestMapping("/showCreate")
    public String showCreate(){
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelMap){
        Location savedLocation=service.saveLocation(location);
        String msg="Location saved with id "+ location.getId();
        modelMap.addAttribute("msg",msg);
        emailUtil.sendEmail("smitthakur@gmail.com", "Location Saved",
        		"Location Saved Successfully and about to return a response");
        return "createLocation";
    }

    @RequestMapping("/viewLocations")
    public String viewLocations(ModelMap modelMap){
        List<Location> locations= service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }

    @RequestMapping("/deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap){
        service.deleteLocation(id);
        List<Location> locations= service.getAllLocations();
        modelMap.addAttribute("locations",locations);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = service.getLocation(id);
        modelMap.addAttribute("location", location);
        return "updateLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        service.updateLocation(location);
        List<Location> locations = service.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }
}
