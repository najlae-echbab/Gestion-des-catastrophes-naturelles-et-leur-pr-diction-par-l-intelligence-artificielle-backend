package com.backend.pfa_backend.Controller;

import com.backend.pfa_backend.dto.VolontaireRequest;
import com.backend.pfa_backend.model.Volontaire;
import com.backend.pfa_backend.service.VolontaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/volontaires")
@CrossOrigin("*")
public class VolontaireController {

    @Autowired private VolontaireService volontaireService;

    @PostMapping
    public ResponseEntity<Volontaire> create(@RequestBody VolontaireRequest request) {
        return ResponseEntity.ok(volontaireService.createVolontaire(request));
    }

    @GetMapping
    public List<Volontaire> getAll() {
        return volontaireService.getAllVolontaires();
    }

    @GetMapping("/{id}")
    public Volontaire getOne(@PathVariable Long id) {
        return volontaireService.getVolontaireById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        volontaireService.deleteVolontaire(id);
        return ResponseEntity.ok("Volontaire supprimé");
    }
}
