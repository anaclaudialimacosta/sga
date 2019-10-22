package com.uem.sga.model;

import javax.persistence.*;

@Table(name = "professor")
@Entity
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
