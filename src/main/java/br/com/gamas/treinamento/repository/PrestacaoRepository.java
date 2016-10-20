package br.com.gamas.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gamas.treinamento.model.Prestacao;


@Repository
public interface PrestacaoRepository extends JpaRepository<Prestacao, Long> {
	
}
