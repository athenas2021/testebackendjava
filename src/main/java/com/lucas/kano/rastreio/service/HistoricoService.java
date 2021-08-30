package com.lucas.kano.rastreio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.kano.rastreio.domain.Registro;
import com.lucas.kano.rastreio.repositories.RegistroRepository;

@Service
public class HistoricoService {
		
	@Autowired
	private RegistroRepository repository;
	

	public Registro findById(Integer id) {
		Optional<Registro> obj = repository.findById(id);
		return obj.orElse(null);		
	}	
	
}
