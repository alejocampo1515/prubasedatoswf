package com.bdatos.prubasedatoswild.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bdatos.prubasedatoswild.entities.PaisesEntity;


@Repository
public interface PaisesRepository extends CrudRepository<PaisesEntity, Integer> {

}
