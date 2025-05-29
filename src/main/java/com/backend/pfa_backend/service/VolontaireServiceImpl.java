package com.backend.pfa_backend.service;
import com.backend.pfa_backend.dto.VolontaireRequest;
import com.backend.pfa_backend.model.User;
import com.backend.pfa_backend.model.Volontaire;
import com.backend.pfa_backend.repository.UserRepository;
import com.backend.pfa_backend.repository.VolontaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VolontaireServiceImpl implements VolontaireService {

    @Autowired private UserRepository userRepository;
    @Autowired private VolontaireRepository volontaireRepository;
    @Autowired private PasswordEncoder passwordEncoder;

    @Override
    public Volontaire createVolontaire(VolontaireRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        user.setRole("volontaire");
        userRepository.save(user);

        Volontaire volontaire = new Volontaire();
        volontaire.setCompetence(request.getCompetences());
        volontaire.setUser(user);
        return volontaireRepository.save(volontaire);
    }

    @Override
    public List<Volontaire> getAllVolontaires() {
        return volontaireRepository.findAll();
    }

    @Override
    public Volontaire getVolontaireById(Long id) {
        return volontaireRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteVolontaire(Long id) {
        volontaireRepository.deleteById(id);
    }
}