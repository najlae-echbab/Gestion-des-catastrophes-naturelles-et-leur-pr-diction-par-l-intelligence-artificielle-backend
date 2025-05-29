package com.backend.pfa_backend.repository;

import com.backend.pfa_backend.model.Volontaire;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VolontaireRepository extends JpaRepository<Volontaire, Long> {

        List<Volontaire> findAll();
    }

