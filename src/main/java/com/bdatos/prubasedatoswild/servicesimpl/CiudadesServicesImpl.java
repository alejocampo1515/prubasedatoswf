package com.bdatos.prubasedatoswild.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;
import com.bdatos.prubasedatoswild.repositories.CiudadesRepository;
import com.bdatos.prubasedatoswild.responses.CiudadesResponse;
import com.bdatos.prubasedatoswild.services.CiudadesService;

@Service
public class CiudadesServicesImpl implements CiudadesService {

	@Autowired
	private CiudadesRepository ciudadesRepository;

	@Override
	public List<CiudadesEntity> getAllCiudades() {
		return (List<CiudadesEntity>) ciudadesRepository.findAll();
	}

	@Override
	public Optional<CiudadesEntity> getUnCiudad(Long idciudad) {
		return ciudadesRepository.findById(idciudad);
	}

	@Override
	public CiudadesResponse addModCiudadErrores(CiudadesEntity ciudad) {
		CiudadesResponse ret = new CiudadesResponse();
		try {
			ret.setCiudad(ciudadesRepository.save(ciudad));

			ret.setResponseCode(1);
			ret.setResponseDescription("Se guardo el ciudad correctamente");

		} catch (Exception e) {
			ret.setResponseCode(-1);
			ret.setResponseDescription("Fallo al guardar el ciudad");

		}

		// TODO Auto-generated method stub
		return ret;
	}

	@Override
	public CiudadesResponse elimCiudad(Long idciudad) {
		CiudadesResponse ret = new CiudadesResponse();
		try {
			ciudadesRepository.deleteById(idciudad);
			ret.setResponseCode(1);
			ret.setResponseDescription("Se elimino el ciudad correctamente");
		} catch (Exception e) {
			ret.setResponseCode(-1);
			ret.setResponseDescription("Fallo al  eliminar el ciudad");

		}
		// TODO Auto-generated method stub
		return ret;
	}

}
