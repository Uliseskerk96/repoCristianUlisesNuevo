package com.example.demo.controller;
import com.example.demo.model.Paquete;
import com.example.demo.services.PaqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paquetes")
public class PaqueteController {
	@Autowired
    private PaqueteService paqueteService;

    @PostMapping("/registrar")
    public Paquete registrarPaquete(@RequestBody Paquete paquete) {
        return paqueteService.registrarPaquete(paquete);
    }
}
