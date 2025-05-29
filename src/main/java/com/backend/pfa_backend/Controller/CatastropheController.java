package com.backend.pfa_backend.Controller;

import com.backend.pfa_backend.model.Catastrophe;
import com.backend.pfa_backend.repository.CatastropheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/catastrophes")
@CrossOrigin("*")
public class CatastropheController {

    @Autowired
    private CatastropheRepository catastropheRepository;

    @GetMapping
    public List<Catastrophe> getAll() {
        return catastropheRepository.findAll();
    }
}
