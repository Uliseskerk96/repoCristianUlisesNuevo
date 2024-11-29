package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Paquete {
	@Id
    private Long id;
    private String origen;
    private String destino;
    private Double peso;
    private Boolean fragil;
    private String dniEmisor;
    private String dniDestinatario;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getFragil() {
        return fragil;
    }

    public void setFragil(Boolean fragil) {
        this.fragil = fragil;
    }

    public String getDniEmisor() {
        return dniEmisor;
    }

    public void setDniEmisor(String dniEmisor) {
        this.dniEmisor = dniEmisor;
    }

    public String getDniDestinatario() {
        return dniDestinatario;
    }

    public void setDniDestinatario(String dniDestinatario) {
        this.dniDestinatario = dniDestinatario;
    }
}
