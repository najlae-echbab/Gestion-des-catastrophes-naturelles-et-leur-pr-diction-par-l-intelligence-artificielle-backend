package com.backend.pfa_backend.dto;

import java.time.LocalDate;

public class AlerteDTO {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public String getTypeCatastrophe() {
        return typeCatastrophe;
    }

    public void setTypeCatastrophe(String typeCatastrophe) {
        this.typeCatastrophe = typeCatastrophe;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNiveauUrgence() {
        return niveauUrgence;
    }

    public void setNiveauUrgence(String niveauUrgence) {
        this.niveauUrgence = niveauUrgence;
    }

    private Long id;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String typeCatastrophe;
    private String pays;
    private String ville;
    private String etat;
    private String niveauUrgence;
}
