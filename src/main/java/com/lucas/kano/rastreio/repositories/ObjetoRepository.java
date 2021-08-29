package com.lucas.kano.rastreio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.kano.rastreio.domain.Objeto;

@Repository
public interface ObjetoRepository extends JpaRepository<Objeto, Integer>{

}
