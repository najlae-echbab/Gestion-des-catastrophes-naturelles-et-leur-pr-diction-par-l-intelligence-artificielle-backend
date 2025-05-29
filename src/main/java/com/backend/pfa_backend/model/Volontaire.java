package com.backend.pfa_backend.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Volontaire {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String getCompetence() {
        return competence;
    }

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    private String competence;
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}

   /// @ManyToOne
    //@JoinColumn(name = "catastrophe_id", referencedColumnName = "id")
   // private Catastrophe catastrophe;

   // @ManyToOne
    //@JoinColumn(name = "utilisateur_id", referencedColumnName = "id")
    //private Utilisateur utilisateur;


