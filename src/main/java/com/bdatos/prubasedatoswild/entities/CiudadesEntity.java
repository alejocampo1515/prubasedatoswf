package com.bdatos.prubasedatoswild.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ciudades database table.
 * 
 */
@Entity
@Table(name="ciudades")
@NamedQuery(name="CiudadesEntity.findAll", query="SELECT c FROM CiudadesEntity c")
public class CiudadesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ciu")
	private Long idCiu;

	@Column(name="id_pai")
	private Integer idPai;

	@Column(name="nombre_ciu")
	private String nombreCiu;

	public CiudadesEntity() {
	}

	public Long getIdCiu() {
		return this.idCiu;
	}

	public void setIdCiu(Long idCiu) {
		this.idCiu = idCiu;
	}

	public Integer getIdPai() {
		return this.idPai;
	}

	public void setIdPai(Integer idPai) {
		this.idPai = idPai;
	}

	public String getNombreCiu() {
		return this.nombreCiu;
	}

	public void setNombreCiu(String nombreCiu) {
		this.nombreCiu = nombreCiu;
	}

}
