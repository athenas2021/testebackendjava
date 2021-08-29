package com.lucas.kano.rastreio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lucas.kano.rastreio.domain.Historico;
import com.lucas.kano.rastreio.domain.Mensagem;
import com.lucas.kano.rastreio.domain.Objeto;
import com.lucas.kano.rastreio.repositories.HistoricoRepository;
import com.lucas.kano.rastreio.repositories.MensagemRepository;
import com.lucas.kano.rastreio.repositories.ObjetoRepository;

@SpringBootApplication
public class RastreioApplication implements CommandLineRunner{
	
	@Autowired
	private HistoricoRepository historicoRepository;
	@Autowired
	private ObjetoRepository objetoRepository;
	@Autowired
	private MensagemRepository mensagemRepository;

	public static void main(String[] args) {
		SpringApplication.run(RastreioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Mensagem mensagem1 = new Mensagem(null,  "Objeto recebido pela transportadora");
		Objeto objeto1 = new Objeto(null, "xpto");
		Historico historico1 = new Historico(null, mensagem1, objeto1);
		
		this.mensagemRepository.save(mensagem1);
		this.objetoRepository.save(objeto1);
		this.historicoRepository.save(historico1);
		
			
		
	}



}
