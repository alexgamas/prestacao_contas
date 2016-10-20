package br.com.gamas.treinamento.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

import org.hibernate.annotations.Type;

@Entity
@Table(name = "prestacao_item")
public class PrestacaoItem implements Serializable {
	
	private static final long serialVersionUID = -706387364595019646L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

	@ManyToOne()
	@JoinColumn(name="id_prestacao")
	private Prestacao prestacao;
	
	@Enumerated(EnumType.ORDINAL)
	private NaturezaDespesa naturezaDespesa;
	
	@Type(type="date")
	@Column(name = "data_despesa", nullable = false)
	private Date data;
	
	@Column(name = "valor", nullable = false)
	private BigDecimal valor;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Prestacao getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(Prestacao prestacao) {
		this.prestacao = prestacao;
	}

	public NaturezaDespesa getNaturezaDespesa() {
		return naturezaDespesa;
	}

	public void setNaturezaDespesa(NaturezaDespesa naturezaDespesa) {
		this.naturezaDespesa = naturezaDespesa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
}
