package rsilva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "F001NAT")
public class Natureza {
    @Id
    @GeneratedValue
    @Column(name = "codnat")
    private int id;
    @Column(name = "nomnat")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipnat")
    private TipoNatureza tipo;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TipoNatureza getTipo() {
		return tipo;
	}
	public void setTipo(TipoNatureza tipo) {
		this.tipo = tipo;
	}
    
}
