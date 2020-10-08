package com.bdatos.prubasedatoswild.responses;

import java.util.List;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;
import com.bdatos.prubasedatoswild.entities.PaisesEntity;

public class PaisesCiudadesResponse {
	private Integer responseCode;
	private String responseDescription;
	private List<PaisesEntity> paises;
	private List<CiudadesEntity> ciudades;

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

	public List<PaisesEntity> getPaises() {
		return paises;
	}

	public void setPaises(List<PaisesEntity> paises) {
		this.paises = paises;
	}

	public List<CiudadesEntity> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<CiudadesEntity> ciudades) {
		this.ciudades = ciudades;
	}

}
