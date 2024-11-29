package com.example.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.caminoRepository;
import com.example.demo.repository.ciudadRepository;
import com.example.demo.model.Camino;
import com.example.demo.model.Ciudad;

import java.util.List;
import java.util.Optional;

@Service
public class CaminoService {
	 @Autowired
	    private ciudadRepository ciudadRepository;

	    @Autowired
	    private caminoRepository caminoRepository;

	    // Método que obtiene los caminos hacia las ciudades vecinas
	    public List<Camino> obtenerCaminosVecinos(Long codigoPostal) {
	        Optional<Ciudad> ciudadOpt = ciudadRepository.findById(codigoPostal);
	        if (ciudadOpt.isPresent()) {
	            Ciudad ciudad = ciudadOpt.get();
	            return caminoRepository.findByCiudadDestino(ciudad.getNombre());
	        }
	        return null; // Si la ciudad no se encuentra, se puede retornar null o un mensaje de error
	    }
	 // Obtener todos los camiones
	    public List<Camino> findAll() {
	        return caminoRepository.findAll();
	    }
	    
	 // Obtener un camion por ID
	    public Camino findById(Long id) {
	        Optional<Camino> optionalCamino = caminoRepository.findById(id);
	        return optionalCamino.orElse(null); // Si no se encuentra, devolver null
	    }

	 // Guardar un nuevo camino o actualizarlo
	    public Camino save(Camino camino) {
	        return caminoRepository.save(camino);
	    }
	 // Eliminar un camion por ID
	    public void delete(Long id) {
	        caminoRepository.deleteById(id);
	    }
}
