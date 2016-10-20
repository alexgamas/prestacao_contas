package br.com.gamas.treinamento.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "viagem")
public class Viagem implements Serializable {

	private static final long serialVersionUID = 1973864702297221441L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

	@Column(name = "origem", nullable = false)
	private String origem;

	@Column(name = "destino", nullable = false)
	private String destino;
	
	@Column(name = "data_criacao", nullable = false)
	@Type(type="timestamp")
	private Date dataCriacao;
	
	@Column(name = "data_partida", nullable = false)
	@Type(type="timestamp")
	private Date dataPartida;
	
	@Column(name = "data_retorno", nullable = true)
	@Type(type="timestamp")
	private Date dataRetorno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(Date dataPartida) {
		this.dataPartida = dataPartida;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	
	
	
}
