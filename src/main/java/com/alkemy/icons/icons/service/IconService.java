package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.IconDTO;

import java.util.List;

public interface IconService {

    IconDTO getDetailsById(Long id);
    IconDTO save(IconDTO dto);

    List<IconDTO> getByFilters(String name, String date, List<Long> cities, String order);
    List<IconDTO> getAll();

    IconDTO update(Long id, IconDTO icon);

    void addPais(Long id, Long idPais);

    void remvovePais(Long id, Long idPais);
    void delete(Long id);
}
