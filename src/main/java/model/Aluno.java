package model;

import javax.persistence.*;


@Table(name="aluno")
@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}

