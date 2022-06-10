package com.alkemy.icons.icons.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IconDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
}
