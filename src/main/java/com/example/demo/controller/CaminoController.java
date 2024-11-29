package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.CaminoService;
import com.example.demo.model.Camino;

import java.util.List;

@RestController
@RequestMapping("/api/caminos")
public class CaminoController {
	@Autowired
    private CaminoService caminoService;

    // Obtener caminos hacia las ciudades vecinas a partir del código postal de la ciudad de origen
    @GetMapping("/estado/{codigoPostal}")
    public List<Camino> obtenerCaminosVecinos(@PathVariable Long codigoPostal) {
        return caminoService.obtenerCaminosVecinos(codigoPostal);
    }
}
