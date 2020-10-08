package com.bdatos.prubasedatoswild.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the paises database table.
 * 
 */
@Entity
@Table(name="paises")
@NamedQuery(name="PaisesEntity.findAll", query="SELECT p FROM PaisesEntity p")
public class PaisesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_pai")

	private Integer idPai;
	//@JsonIgnore
	private String abreviatura;

	private String nombre;

	public PaisesEntity() {
	}

	public Integer getIdPai() {
		return this.idPai;
	}

	public void setIdPai(Integer idPai) {
		this.idPai = idPai;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
