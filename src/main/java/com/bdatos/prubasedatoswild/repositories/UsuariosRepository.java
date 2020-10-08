package com.bdatos.prubasedatoswild.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatoswild.entities.UsuariosEntity;

@Repository
public interface UsuariosRepository extends CrudRepository<UsuariosEntity, Long> {

}
