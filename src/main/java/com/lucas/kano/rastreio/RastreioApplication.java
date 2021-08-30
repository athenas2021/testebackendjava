package com.lucas.kano.rastreio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.kano.rastreio.domain.Registro;
import com.lucas.kano.rastreio.domain.Historico;
import com.lucas.kano.rastreio.domain.Mensagem;

import com.lucas.kano.rastreio.repositories.RegistroRepository;
import com.lucas.kano.rastreio.repositories.HistoricoRepository;
import com.lucas.kano.rastreio.repositories.MensagemRepository;


@SpringBootApplication
public class RastreioApplication implements CommandLineRunner{
	
	@Autowired
	private RegistroRepository registroRepository;

	@Autowired
	private MensagemRepository mensagemRepository;
	
	@Autowired
	private HistoricoRepository historicoRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(RastreioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Mensagem mensagem1 = new Mensagem(null,  "Objeto recebido pela transportadora");
		Mensagem mensagem2 = new Mensagem(null,  "Objeto extraviado");
		Registro registro1 = new Registro(null, mensagem1, "xpto");
		Registro registro2 = new Registro(null, mensagem2, "xpto");
		List<Registro> registros = new ArrayList<Registro>();
		registros.add(registro1);		
		registros.add(registro2);
		Historico historico1 = new Historico(null, registros);
		
		historico1.getRegistros().addAll(Arrays.asList(registro1));
		
		this.mensagemRepository.save(mensagem1);
		this.registroRepository.saveAll(Arrays.asList(registro1));
		this.historicoRepository.saveAll(Arrays.asList(historico1));
		
			
		
	}



}
