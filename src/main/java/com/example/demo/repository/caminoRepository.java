package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Camino;
import java.util.List;

public interface caminoRepository extends JpaRepository<Camino, Long>{
	// Buscar caminos hacia una ciudad dada
    List<Camino> findByCiudadDestino(String ciudadDestino);
}
