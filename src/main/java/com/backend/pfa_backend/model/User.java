package com.backend.pfa_backend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    private String role;


    @CreationTimestamp
    private LocalDateTime createdAt;

    // ==== CONSTRUCTEURS ====
    public User() {}

    public User(String name, String email, String password, String role, String photo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // ==== GETTERS & SETTERS ====
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }



    public LocalDateTime getCreatedAt() { return createdAt; }

    // ==== TO STRING ====
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Volontaire volontaire;
}
