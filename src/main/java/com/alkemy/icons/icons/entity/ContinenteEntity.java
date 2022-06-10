package com.alkemy.icons.icons.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "continente")
@Data
public class ContinenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imagen;

    private String denominacion;

    private boolean deleted = Boolean.FALSE;
}
