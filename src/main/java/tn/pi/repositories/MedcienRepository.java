package tn.pi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.pi.entities.Medcin;

    @Repository
    public interface MedcienRepository extends JpaRepository<Medcin, Long> {

    }

