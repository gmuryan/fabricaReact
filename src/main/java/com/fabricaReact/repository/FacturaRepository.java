package com.fabricaReact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabricaReact.model.Factura;

@Repository("facturaRepository")
public interface FacturaRepository extends JpaRepository<Factura, Long>{

}
