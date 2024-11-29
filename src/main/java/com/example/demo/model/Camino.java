package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Camino {
	@Id
    private Long id; // Identificador del camino

    private String ciudadDestino; // Ciudad destino
    private String estadoCamino; // Estado del camino (por ejemplo: "bueno", "malo", "cerrado")
    private String estadoClima; // Estado del clima en la ciudad destino

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public String getEstadoCamino() {
        return estadoCamino;
    }

    public void setEstadoCamino(String estadoCamino) {
        this.estadoCamino = estadoCamino;
    }

    public String getEstadoClima() {
        return estadoClima;
    }

    public void setEstadoClima(String estadoClima) {
        this.estadoClima = estadoClima;
    }
}
