package org.rajawadi.hospitaldata.repository;

import org.rajawadi.hospitaldata.dto.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Patient_Repository extends JpaRepository<Patient, Integer> {

    Patient save (Patient patient);
}
