package com.example.demo.repository;
import com.example.demo.model.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paqueteRepository extends JpaRepository<Paquete, Long> {

}
