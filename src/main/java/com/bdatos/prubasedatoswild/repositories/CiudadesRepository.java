package com.bdatos.prubasedatoswild.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatoswild.entities.CiudadesEntity;

@Repository
public interface CiudadesRepository extends CrudRepository<CiudadesEntity, Long> {

}
