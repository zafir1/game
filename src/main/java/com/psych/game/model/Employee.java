package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "employees")
public class Employee extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "name")
    @Getter
    @Setter
    @NotBlank
    private String name;
}
