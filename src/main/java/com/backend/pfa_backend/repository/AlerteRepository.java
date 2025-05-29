package com.backend.pfa_backend.repository;

import com.backend.pfa_backend.model.Alerte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlerteRepository extends JpaRepository<Alerte, Long> {
}
