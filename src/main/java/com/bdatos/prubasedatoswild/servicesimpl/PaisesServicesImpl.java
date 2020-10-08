package com.bdatos.prubasedatoswild.servicesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdatos.prubasedatoswild.entities.PaisesEntity;
import com.bdatos.prubasedatoswild.repositories.PaisesRepository;
import com.bdatos.prubasedatoswild.responses.PaisesResponse;
import com.bdatos.prubasedatoswild.services.PaisesService;

@Service
public class PaisesServicesImpl implements PaisesService {
	
	@Autowired
	private PaisesRepository paisesRepository;

	
	@Override
	public List<PaisesEntity> getAllPaises() { 
		return (List<PaisesEntity>) paisesRepository.findAll();
	}

	@Override
	public  Optional<PaisesEntity> getUnPais(Integer idpais) {
		return paisesRepository.findById(idpais);
	}

	@Override
	public PaisesEntity addModPais(PaisesEntity pais) {
		PaisesEntity retpais = null;
		try {
			retpais = paisesRepository.save(pais);
			
	        } catch (Exception e) {
	        	String a = "Error"+ e.getMessage();
	        }
		
		// TODO Auto-generated method stub
		return retpais;
	}

	@Override
	public PaisesResponse addModPaisErrores(PaisesEntity pais) {
		PaisesResponse ret = new PaisesResponse();
		try {
			ret.setPais(paisesRepository.save(pais));
			
			ret.setResponseCode(1);
			ret.setResponseDescription("Se guardo el pais correctamente");
			
	        } catch (Exception e) {
	    		ret.setResponseCode(-1);
				ret.setResponseDescription("Fallo al guardar el pais");
			
	        }
		
		// TODO Auto-generated method stub
		return ret;
	}

	@Override
	public PaisesResponse elimPais(Integer idpais) {
		PaisesResponse ret = new PaisesResponse();
		try {
			paisesRepository.deleteById(idpais);
			ret.setResponseCode(1);
			ret.setResponseDescription("Se elimino el pais correctamente");
	        } catch (Exception e) {
	    		ret.setResponseCode(-1);
	    		ret.setResponseDescription("Fallo al  eliminar el pais");
			
	        }
		// TODO Auto-generated method stub
		return ret;
	}

	@Override
	public PaisesResponse pruebaPais(Integer idpais) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
