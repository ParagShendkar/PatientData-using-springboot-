package org.rajawadi.hospitaldata.dao;

import org.rajawadi.hospitaldata.dto.Patient;
import org.rajawadi.hospitaldata.repository.Patient_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class Patient_Dao {

    @Autowired
    private Patient_Repository repository;

    public Patient savePatient(Patient patient){
        return repository.save(patient);
    }

    public Patient updateById(int id,Patient patient){
        patient.setId(id);
        return repository.save(patient);
    }

    public Optional<Patient> findById(int id){
        return  repository.findById(id);
    }

    public void deleteByid(int id) {
        repository.deleteById(id);
    }
}
