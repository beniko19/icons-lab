package com.alkemy.icons.icons.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class IconDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private LocalDate fechaCreacion;
    private Long altura;
    private String historia;
    private List<PaisDTO> paises;
}
