package com.alkemy.icons.icons.dto;

import lombok.Data;

import java.util.List;

@Data
public class PaisDTO {
    private Long id;
    private String imagen;
    private String denominacion;
    private Long cantidadHabitantes;
    private Long superficie;
    private Long continenteId;
    private List<IconDTO> icons;
}
