package com.backend.pfa_backend.service;

import com.backend.pfa_backend.dto.VolontaireRequest;
import com.backend.pfa_backend.model.User;
import com.backend.pfa_backend.model.Volontaire;
import com.backend.pfa_backend.repository.UserRepository;
import com.backend.pfa_backend.repository.VolontaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface VolontaireService {
    Volontaire createVolontaire(VolontaireRequest request);
    List<Volontaire> getAllVolontaires();
    Volontaire getVolontaireById(Long id);
    void deleteVolontaire(Long id);
}