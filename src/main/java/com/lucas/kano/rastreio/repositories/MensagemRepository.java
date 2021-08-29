package com.lucas.kano.rastreio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucas.kano.rastreio.domain.Mensagem;


@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Integer>{

}
