package br.com.gamas.treinamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gamas.treinamento.model.Prestacao;
import br.com.gamas.treinamento.repository.PrestacaoRepository;

@Service
public class PrestacaoService {

	@Autowired
	private PrestacaoRepository prestacaoRepository; 
	
	public void save(Prestacao prestacao) {
		prestacaoRepository.save(prestacao);
	}
	
	public List<Prestacao> findAll() {
		return prestacaoRepository.findAll();
	}
	
	public Prestacao findOne(Long id) {
		return prestacaoRepository.findOne(id);
	}
	
}
