package com.alkemy.icons.icons.service.impl;

import com.alkemy.icons.icons.dto.IconDTO;
import com.alkemy.icons.icons.entity.IconEntity;
import com.alkemy.icons.icons.mapper.IconMapper;
import com.alkemy.icons.icons.repository.IconRepository;
import com.alkemy.icons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IconServiceImpl implements IconService {

    @Autowired
    private IconMapper iconMapper;

    @Autowired
    private IconRepository iconRepository;

    @Override
    public IconDTO getDetailsById(Long id) {
        return null;
    }

    public IconDTO save(IconDTO dto) {
        IconEntity entity = iconMapper.iconDTO2Entity(dto);
        IconEntity entitySaved = iconRepository.save(entity);
        IconDTO result = iconMapper.iconEntity2DTO(entitySaved);
        return result;
    }

    @Override
    public List<IconDTO> getByFilters(String name, String date, List<Long> cities, String order) {
        return null;
    }

    public List<IconDTO> getAll() {
        List<IconEntity> entities = iconRepository.findAll();
        List<IconDTO> result = iconMapper.iconEntityList2DTOList(entities, false);
        return result;
    }

    @Override
    public IconDTO update(Long id, IconDTO icon) {
        IconEntity entity = iconMapper.iconDTO2Entity(icon);
        iconRepository.getReferenceById(id).setImagen(entity.getImagen());
        iconRepository.getReferenceById(id).setDenominacion(entity.getDenominacion());
        iconRepository.getReferenceById(id).setFechaCreacion(entity.getFechaCreacion());
        iconRepository.getReferenceById(id).setAltura(entity.getAltura());
        iconRepository.getReferenceById(id).setHistoria(entity.getHistoria());
        iconRepository.save(iconRepository.getReferenceById(id));
        IconDTO result = iconMapper.iconEntity2DTO(iconRepository.getReferenceById(id));
        return result;
    }

    @Override
    public void addPais(Long id, Long idPais) {

    }

    @Override
    public void remvovePais(Long id, Long idPais) {

    }

    @Override
    public void delete(Long id) {
        iconRepository.deleteById(id);
    }
}
