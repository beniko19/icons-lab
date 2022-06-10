package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.IconDTO;

import javax.swing.*;
import java.util.List;

public interface IconService {

    IconDTO save(IconDTO dto);

    List<IconDTO> getAllIconos();

    IconDTO update(Long id, IconDTO icon);
}
