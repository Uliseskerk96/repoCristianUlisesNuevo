package com.example.demo.services;
import com.example.demo.model.Ciudad;
import com.example.demo.repository.ciudadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CiudadServices {
	 @Autowired
	    private ciudadRepository ciudadRepository;

	    // Obtener todas las ciudades
	    public List<Ciudad> findAll() {
	        return ciudadRepository.findAll();
	    }

	    

	    // Guardar una nueva ciudad o actualizarla
	    public Ciudad save(Ciudad ciudad) {
	        return ciudadRepository.save(ciudad);
	    }
	    
	    // Eliminar una ciudad por ID
	    public void delete(Long id) {
	        ciudadRepository.deleteById(id);
	    }
	    // Método para obtener una ciudad por su ID
	    public Ciudad findById(Long id) {
	        return ciudadRepository.findById(id).orElse(null);  // Devuelve la ciudad si existe, o null si no se encuentra
	    }

	    
}
