package tn.pi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pi.entities.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
