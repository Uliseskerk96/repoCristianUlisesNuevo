package com.example.demo.services;
import com.example.demo.model.Camion;
import com.example.demo.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CamionServices {
	@Autowired
    private CamionRepository camionRepository;

    // Obtener todos los camiones
    public List<Camion> findAll() {
        return camionRepository.findAll();
    }

    // Obtener un camion por ID
    public Camion findById(Long id) {
        Optional<Camion> optionalCamion = camionRepository.findById(id);
        return optionalCamion.orElse(null); // Si no se encuentra, devolver null
    }

    // Guardar un nuevo camion o actualizarlo
    public Camion save(Camion camion) {
        return camionRepository.save(camion);
    }

    // Eliminar un camion por ID
    public void delete(Long id) {
        camionRepository.deleteById(id);
    }
}
