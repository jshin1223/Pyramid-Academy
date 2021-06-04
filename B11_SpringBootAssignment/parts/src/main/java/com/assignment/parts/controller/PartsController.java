package com.assignment.parts.controller;

import com.assignment.parts.entity.Parts;
import com.assignment.parts.service.PartsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

//This is to allow calls from React... NOT IMPORTANT RIGHT NOW
@CrossOrigin(origins = { "http://localhost:3306"})
@RestController
public class PartsController {

    private final PartsService partsService;

    //Constructor Injection: this is telling the spring framework to wire up your
    //dependencies for the partsService.

    @Autowired
    public PartsController(@Qualifier("partsServiceIMPL")PartsService partsService) {
        this.partsService = partsService;
    }

    @GetMapping("/retrieveById/{partsId}")
    public Parts findById(@PathVariable int partsId) {
        return partsService.findById(partsId);
    }



    //This is a GET request that will read a list of all the parts.
    //http://localhost:8080/retrieveAllParts
    @GetMapping("/retrieveAllParts")
    public List<Parts> findAll() {
        return partsService.findAll();
    }

    //This is a POST request to add a new employee.
    //http://localhost:8080/addParts
    @PostMapping("/addParts")
    public Parts addParts(@RequestBody Parts theParts) {
        //also just in case they pass an id in JSON .... set id to o
        //this is to force a save of new item .... instead of update
        theParts.setId(0);

        //This will call the partsDqoImpl.save method to save a new part
        //through the partsService interface SPRING
        partsService.saveOrUpdate(theParts);
        return theParts;
    }

    //This is a PUT request to update an existing part.
    //http://localhost:8080/updateParts
    @PutMapping("/updateParts")
    public Parts updateParts(@RequestBody Parts updateParts) {
        //No theEmployee.setId(0); this will execute an update instead of a create
        partsService.saveOrUpdate(updateParts);
        return updateParts;
    }

    //This is a DELETE request to delete an existing part.
    //http://localhost:8080/deleteParts/1
    @DeleteMapping("/deleteParts/{partsId}")
    public String deleteParts(@PathVariable int partsId) {
        //This will execute the deleteByID.
        partsService.deleteById(partsId);
        return "Deleted parts id : " + partsId;
    }





}
