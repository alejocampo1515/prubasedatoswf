package com.bdatos.prubasedatoswild.servicesimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bdatos.prubasedatoswild.entities.UsuariosEntity;
import com.bdatos.prubasedatoswild.repositories.UsuariosRepository;
import com.bdatos.prubasedatoswild.responses.UsuariosResponse;
import com.bdatos.prubasedatoswild.services.UsuariosService;

@Service
public class UsuariosServicesImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuarioesRepository;

	@Override
	public List<UsuariosEntity> getAllUsuarios() {
		return (List<UsuariosEntity>) usuarioesRepository.findAll();
	}

	@Override
	public Optional<UsuariosEntity> getUnUsuario(Long idusuario) {
		return usuarioesRepository.findById(idusuario);
	}

	@Override
	public UsuariosResponse elimUsuario(Long idusuario) {
		UsuariosResponse ret = new UsuariosResponse();
		try {
			usuarioesRepository.deleteById(idusuario);
			ret.setResponseCode(1);
			ret.setResponseDescription("Se elimino el usuario correctamente");
		} catch (Exception e) {
			ret.setResponseCode(-1);
			ret.setResponseDescription("Fallo al  eliminar el usuario");

		}
		// TODO Auto-generated method stub
		return ret;
	}

}
