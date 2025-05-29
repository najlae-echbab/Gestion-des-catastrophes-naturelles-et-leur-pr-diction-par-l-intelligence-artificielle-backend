package com.backend.pfa_backend.Controller;

import com.backend.pfa_backend.model.Alerte;
import com.backend.pfa_backend.repository.AlerteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alertes")
@CrossOrigin("*")
public class AlerteController {

    @Autowired
    private AlerteRepository alerteRepository;

    @GetMapping
    public List<Alerte> getAll() {
        return alerteRepository.findAll();
    }
}
