package com.backend.pfa_backend.repository;

import com.backend.pfa_backend.model.Catastrophe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatastropheRepository extends JpaRepository<Catastrophe, Long> {
}
