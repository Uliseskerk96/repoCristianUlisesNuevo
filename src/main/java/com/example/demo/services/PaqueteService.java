package com.example.demo.services;
import com.example.demo.model.Paquete;
import com.example.demo.repository.paqueteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaqueteService {
	 @Autowired
	    private paqueteRepository paqueteRepository;
	 public List<Paquete> findAll() {			
			return paqueteRepository.findAll();
		}
	    public Paquete registrarPaquete(Paquete paquete) {
	        // Validación del peso y destino
	        if (paquete.getPeso() == null || paquete.getDestino() == null) {
	            throw new IllegalArgumentException("El peso y el destino son obligatorios.");
	        }

	        // Validar que los DNI estén registrados
	        if (!validarDni(paquete.getDniEmisor()) || !validarDni(paquete.getDniDestinatario())) {
	            throw new IllegalArgumentException("Los DNI deben estar registrados en el sistema.");
	        }

	        // Registrar el paquete
	        return paqueteRepository.save(paquete);
	    }
	 // Método para obtener una paquete por su ID
	    public Paquete findById(Long id) {
	        return paqueteRepository.findById(id).orElse(null);  // Devuelve la ciudad si existe, o null si no se encuentra
	    }

	    private boolean validarDni(String dni) {
	        // Aquí puedes agregar la lógica para validar que el DNI está registrado
	        return true; // Simulamos que siempre está registrado
	    }
	 // Eliminar una paquete por ID
	    public void delete(Long id) {
	        paqueteRepository.deleteById(id);
	    }
	 // Guardar un paquete
	    public Paquete save(Paquete paquete) {
	        return paqueteRepository.save(paquete);
	    }
}
