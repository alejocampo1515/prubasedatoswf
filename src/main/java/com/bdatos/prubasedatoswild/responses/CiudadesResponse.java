package com.bdatos.prubasedatoswild.responses;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;

public class CiudadesResponse {
	private Integer responseCode;
	private String responseDescription;
	private CiudadesEntity ciudad;

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

	public CiudadesEntity getCiudad() {
		return ciudad;
	}

	public void setCiudad(CiudadesEntity ciudad) {
		this.ciudad = ciudad;
	}

}
