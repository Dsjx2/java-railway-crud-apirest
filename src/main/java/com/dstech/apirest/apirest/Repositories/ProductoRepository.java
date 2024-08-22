package com.dstech.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dstech.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
