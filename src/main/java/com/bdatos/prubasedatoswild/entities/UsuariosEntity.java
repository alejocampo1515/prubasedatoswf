package com.bdatos.prubasedatoswild.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
@NamedQuery(name="UsuariosEntity.findAll", query="SELECT u FROM UsuariosEntity u")
public class UsuariosEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usu")
	private Long idUsu;

	private String apellido1;
	
	private String apellido2;

	private String direccion;

	private Integer documento;

	private String email;

	@Column(name="id_ciu")
	private Integer idCiu;

	private String nombre1;

	private String nombre2;

	private String telefono;

	private Boolean tienehijos;

	private Integer tipodocumento;

	public UsuariosEntity() {
	}

	public Long getIdUsu() {
		return this.idUsu;
	}

	public void setIdUsu(Long idUsu) {
		this.idUsu = idUsu;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getDocumento() {
		return this.documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdCiu() {
		return this.idCiu;
	}

	public void setIdCiu(Integer idCiu) {
		this.idCiu = idCiu;
	}

	public String getNombre1() {
		return this.nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return this.nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getTienehijos() {
		return this.tienehijos;
	}

	public void setTienehijos(Boolean tienehijos) {
		this.tienehijos = tienehijos;
	}

	public Integer getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(Integer tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

}
