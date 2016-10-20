package br.com.gamas.treinamento.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "prestacao")
public class Prestacao implements Serializable {
	
	private static final long serialVersionUID = 2039739023018151775L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@Enumerated(EnumType.ORDINAL)
	private TipoPrestacao tipo;
	
	@Column(name = "motivo", nullable = false)
	private String motivo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoPrestacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoPrestacao tipo) {
		this.tipo = tipo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
}
