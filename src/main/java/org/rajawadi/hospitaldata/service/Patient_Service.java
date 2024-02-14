package org.rajawadi.hospitaldata.service;

import org.rajawadi.hospitaldata.dao.Patient_Dao;
import org.rajawadi.hospitaldata.dto.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Patient_Service {

    @Autowired
    private Patient_Dao dao;

    public Patient savePatient(Patient patient){
        return  dao.savePatient(patient);
    }

    public Patient updateById(int id,Patient patient){
        return  dao.updateById(id, patient);
    }

    public Optional<Patient> findById(int id){
        return  dao.findById(id);
    }

    public void deleteByid(int id) {
        dao.deleteByid(id);
    }
}
