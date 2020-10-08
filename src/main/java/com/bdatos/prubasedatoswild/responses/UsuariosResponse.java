package com.bdatos.prubasedatoswild.responses;

import com.bdatos.prubasedatoswild.entities.UsuariosEntity;

public class UsuariosResponse {
	private Integer responseCode;
	private String responseDescription;
	private UsuariosEntity usuario;

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseDescription() {
		return responseDescription;
	}

	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}

	public UsuariosEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuariosEntity usuario) {
		this.usuario = usuario;
	}

}
