package com.bdatos.prubasedatoswild.services;

import java.util.List;
import java.util.Optional;

import com.bdatos.prubasedatoswild.entities.UsuariosEntity;
import com.bdatos.prubasedatoswild.responses.UsuariosResponse;

public interface UsuariosService {

	List<UsuariosEntity> getAllUsuarios();

	Optional<UsuariosEntity> getUnUsuario(Long idusuario);

	UsuariosResponse elimUsuario(Long idusuario);

}
