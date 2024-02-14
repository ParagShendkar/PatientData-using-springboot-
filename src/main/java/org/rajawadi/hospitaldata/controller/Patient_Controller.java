package org.rajawadi.hospitaldata.controller;

import org.rajawadi.hospitaldata.dto.Patient;
import org.rajawadi.hospitaldata.service.Patient_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Patient_Controller {

    @Autowired
    private Patient_Service service;

    @PostMapping("/save/patient")
    public Patient savePatient(@RequestBody Patient patient){
        return service.savePatient(patient);
    }

    @PutMapping("/update/patient/{id}")
    public Patient updateById(@PathVariable int id,@RequestBody Patient patient){
        return service.updateById(id, patient);
    }

    @GetMapping("/find/patient/{id}")
    public Optional<Patient> findById(@PathVariable int id){
        return  service.findById(id);
    }

    @DeleteMapping("/delete/patient/{id}")
    public void deleteByid(@PathVariable int id) {
        service.deleteByid(id);
    }
}
