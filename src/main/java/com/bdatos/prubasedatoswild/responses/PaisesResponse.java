package com.bdatos.prubasedatoswild.responses;

import com.bdatos.prubasedatoswild.entities.PaisesEntity;

public class PaisesResponse {
	private Integer responseCode;
    private String responseDescription;
    private PaisesEntity pais;
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
	public PaisesEntity getPais() {
		return pais;
	}
	public void setPais(PaisesEntity pais) {
		this.pais = pais;
	}
    
}
