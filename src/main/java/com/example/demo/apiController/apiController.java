package com.example.demo.apiController;

import com.example.demo.model.Camion;
import com.example.demo.model.Ciudad;
import com.example.demo.model.Paquete;
import com.example.demo.model.Camino;

import com.example.demo.services.PaqueteService;
import com.example.demo.services.CaminoService;
import com.example.demo.services.CamionServices;  // Asegúrate de que la clase CamionService esté bien importada
import com.example.demo.services.CiudadServices;  // Lo mismo para CiudadService

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class apiController {

    @Autowired
    private CamionServices camionService;  // Correcta la instancia CamionService

    @Autowired
    private CiudadServices ciudadService;  // Correcta la instancia CiudadService

    @Autowired
    private PaqueteService paqueteService;

    @Autowired
    private CaminoService caminoService;

    // ---------------------------- CAMIONES ----------------------------

    // Obtener todos los camiones
    @GetMapping("/camiones")
    public List<Camion> getAllCamiones() {
        return camionService.findAll();  // Usa camionService correctamente
    }

    // Obtener un camion por su ID
    @GetMapping("/camiones/{id}")
    public Camion getCamionById(@PathVariable Long id) {
        return camionService.findById(id);  // Usa camionService correctamente
    }

    // Crear un nuevo camion
    @PostMapping("/camiones")
    public Camion createCamion(@RequestBody Camion camion) {
        return camionService.save(camion);  // Usa camionService correctamente
    }

    // Actualizar un camion
    @PutMapping("/camiones/{id}")
    public Camion updateCamion(@PathVariable Long id, @RequestBody Camion camion) {
        camion.setId(id);  // Establecer el ID para la actualización
        return camionService.save(camion);  // Usa camionService correctamente
    }

    // Eliminar un camion
    @DeleteMapping("/camiones/{id}")
    public void deleteCamion(@PathVariable Long id) {
        camionService.delete(id);  // Usa camionService correctamente
    }
 // ---------------------------- CIUDADES ----------------------------

    // Obtener todas las ciudades
    @GetMapping("/ciudades")
    public List<Ciudad> getAllCiudades() {
        return ciudadService.findAll();  // Usa ciudadService correctamente
    }

    // Obtener una ciudad por su ID
    @GetMapping("/ciudades/{id}")
    public Ciudad getCiudadById(@PathVariable Long id) {
        return ciudadService.findById(id);  // Usa ciudadService correctamente
    }

    // Crear una nueva ciudad
    @PostMapping("/ciudades")
    public Ciudad createCiudad(@RequestBody Ciudad ciudad) {
        return ciudadService.save(ciudad);  // Usa ciudadService correctamente
    }

    // Actualizar una ciudad
    @PutMapping("/ciudades/{id}")
    public Ciudad updateCiudad(@PathVariable Long id, @RequestBody Ciudad ciudad) {
        ciudad.setId(id);  // Establecer el ID para la actualización
        return ciudadService.save(ciudad);  // Usa ciudadService correctamente
    }

    // Eliminar una ciudad
    @DeleteMapping("/ciudades/{id}")
    public void deleteCiudad(@PathVariable Long id) {
        ciudadService.delete(id);  // Usa ciudadService correctamente
    }

    // ---------------------------- PAQUETES ----------------------------

    // Obtener todos los paquetes
    @GetMapping("/paquetes")
    public List<Paquete> getAllPaquetes() {
        return paqueteService.findAll();  // Usa paqueteService correctamente
    }

    // Obtener un paquete por su ID
    @GetMapping("/paquetes/{id}")
    public Paquete getPaqueteById(@PathVariable Long id) {
        return paqueteService.findById(id);  // Usa paqueteService correctamente
    }

    // Crear un nuevo paquete
    @PostMapping("/paquetes")
    public Paquete createPaquete(@RequestBody Paquete paquete) {
        return paqueteService.save(paquete);  // Usa paqueteService correctamente
    }

    // Actualizar un paquete
    @PutMapping("/paquetes/{id}")
    public Paquete updatePaquete(@PathVariable Long id, @RequestBody Paquete paquete) {
        paquete.setId(id);  // Establecer el ID para la actualización
        return paqueteService.save(paquete);  // Usa paqueteService correctamente
    }

    // Eliminar un paquete
    @DeleteMapping("/paquetes/{id}")
    public void deletePaquete(@PathVariable Long id) {
        paqueteService.delete(id);  // Usa paqueteService correctamente
    }

    // ---------------------------- CAMINOS ----------------------------

    // Obtener todos los caminos
    @GetMapping("/caminos")
    public List<Camino> getAllCaminos() {
        return caminoService.findAll();  // Usa caminoService correctamente
    }

    // Obtener un camino por su ID
    @GetMapping("/caminos/{id}")
    public Camino getCaminoById(@PathVariable Long id) {
        return caminoService.findById(id);  // Usa caminoService correctamente
    }

    // Crear un nuevo camino
    @PostMapping("/caminos")
    public Camino createCamino(@RequestBody Camino camino) {
        return caminoService.save(camino);  // Usa caminoService correctamente
    }

    // Actualizar un camino
    @PutMapping("/caminos/{id}")
    public Camino updateCamino(@PathVariable Long id, @RequestBody Camino camino) {
        camino.setId(id);  // Establecer el ID para la actualización
        return caminoService.save(camino);  // Usa caminoService correctamente
    }

    // Eliminar un camino
    @DeleteMapping("/caminos/{id}")
    public void deleteCamino(@PathVariable Long id) {
        caminoService.delete(id);  // Usa caminoService correctamente
    }
}
