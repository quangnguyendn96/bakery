package com.example.jwtst.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Roles {
    @Column(name = "rolesid")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolesId;
}
