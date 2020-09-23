package it.fiani.facciaLibro.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.fiani.facciaLibro.entity.NumeroTelefono;

@Repository
public interface NumeroTeleofonoRepository extends CrudRepository<NumeroTelefono, Long> {

}
