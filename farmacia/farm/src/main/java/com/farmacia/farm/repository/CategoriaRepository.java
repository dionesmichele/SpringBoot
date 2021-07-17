package com.farmacia.farm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.farm.model.Categoria;

@Repository
interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
