package rsilva.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name = "F010MOV")
public class Movimento {
    @Id
    @GeneratedValue
    @Column(name = "codmov")
    private int id;
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    @Column(name = "datlac")
    private DateTime dataLancamento;
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    @Column(name = "datven")
    private DateTime dataVencimento;
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
    @Column(name = "datmov")
    private DateTime dataMovimento;
    @Column(nullable= false, precision=7, scale=2, name = "vlrmov")    
    @Digits(integer=9, fraction=2)                   
    private BigDecimal valorMovimento;    
    @Column(name = "obsmov")
    private String observacao;
    @OneToOne
    @JoinColumn(name="codnat")
    private Natureza natureza;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DateTime getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(DateTime dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	public DateTime getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(DateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public DateTime getDataMovimento() {
		return dataMovimento;
	}
	public void setDataMovimento(DateTime dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	public BigDecimal getValorMovimento() {
		return valorMovimento;
	}
	public void setValorMovimento(BigDecimal valorMovimento) {
		this.valorMovimento = valorMovimento;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Natureza getNatureza() {
		return natureza;
	}
	public void setNatureza(Natureza natureza) {
		this.natureza = natureza;
	}

 
}
