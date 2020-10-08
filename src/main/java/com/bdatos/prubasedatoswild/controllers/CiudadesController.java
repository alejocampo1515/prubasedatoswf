package com.bdatos.prubasedatoswild.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;
import com.bdatos.prubasedatoswild.responses.CiudadesResponse;
import com.bdatos.prubasedatoswild.services.CiudadesService;

//@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CiudadesController {

	@Autowired
	CiudadesService ciudadesService;

	@GetMapping("/ciudades")
	public List<CiudadesEntity> getAllCiudades() {
		return ciudadesService.getAllCiudades();
	}

	@GetMapping("/ciudades/{id}")
	public Optional<CiudadesEntity> getCiudad(@PathVariable(value = "id") Long IdCiudad) {
		return ciudadesService.getUnCiudad(IdCiudad);

	}

	@PostMapping("/ciudades")
	public CiudadesResponse addCiudadRequest(@RequestBody CiudadesEntity ciudades) {
		return ciudadesService.addModCiudadErrores(ciudades);
	}

	@PutMapping("/ciudades")
	public CiudadesResponse modCiudad(@RequestBody CiudadesEntity ciudades) {
		return ciudadesService.addModCiudadErrores(ciudades);
	}

	@DeleteMapping("/ciudades/{id}")
	public CiudadesResponse elCiudad(@PathVariable(value = "id") Long IdPai) {
		return ciudadesService.elimCiudad(IdPai);
	}

}
