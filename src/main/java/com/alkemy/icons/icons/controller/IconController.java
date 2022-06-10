package com.alkemy.icons.icons.controller;

import com.alkemy.icons.icons.dto.IconDTO;
import com.alkemy.icons.icons.service.IconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("icons")
public class IconController {

    @Autowired
    private IconService iconService;

    @PostMapping
    public ResponseEntity<IconDTO> save(@RequestBody IconDTO icono) {
        IconDTO iconoGuardado = iconService.save(icono);
        return ResponseEntity.status(HttpStatus.CREATED).body(iconoGuardado);
    }

    @GetMapping
    public ResponseEntity<List<IconDTO>> getAll() {
        List<IconDTO> iconos = iconService.getAll();
        return ResponseEntity.ok().body(iconos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<IconDTO> update(@PathVariable Long id, @RequestBody IconDTO icon) {
        IconDTO result = iconService.update(id, icon);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        iconService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
