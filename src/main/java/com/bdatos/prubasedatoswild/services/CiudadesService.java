package com.bdatos.prubasedatoswild.services;

import java.util.List;
import java.util.Optional;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;
import com.bdatos.prubasedatoswild.responses.CiudadesResponse;

public interface CiudadesService {

	List<CiudadesEntity> getAllCiudades();

	Optional<CiudadesEntity> getUnCiudad(Long idciudad);

	CiudadesResponse addModCiudadErrores(CiudadesEntity ciudad);

	CiudadesResponse elimCiudad(Long idciudad);

}
