package com.lucas.kano.rastreio.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.kano.rastreio.domain.Registro;
import com.lucas.kano.rastreio.service.HistoricoService;

@RestController
@RequestMapping(value = "/historico")
public class HistoricoResource {
	
	@Autowired
	private HistoricoService service;
	
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<Registro> findAllByCodigo(@PathVariable Integer id){
		Registro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
			
	}

}
