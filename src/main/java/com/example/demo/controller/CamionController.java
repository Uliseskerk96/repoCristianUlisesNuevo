package com.example.demo.controller;

import com.example.demo.model.Camion;
import com.example.demo.repository.CamionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CamionController {
	 @Autowired
	    private CamionRepository camionRepository;

	    @GetMapping("/camiones")
	    public String listarCamiones(Model model) {
	        model.addAttribute("camiones", camionRepository.findAll());
	        return "camiones";
	    }

	    @GetMapping("/camion/nuevo")
	    public String mostrarFormulario(Model model) {
	        model.addAttribute("camion", new Camion());
	        return "formularioCamion";
	    }

	    @PostMapping("/camion/guardar")
	    public String guardarCamion(Camion camion, Model model) {
	        if (camionRepository.existsByPatente(camion.getPatente())) {
	            model.addAttribute("error", "La patente ya está registrada.");
	            return "formularioCamion";
	        }
	        camionRepository.save(camion);
	        return "redirect:/camiones";
	    }
}
