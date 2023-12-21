package ec.edu.espe.examenMeneses.dao.service.dao;

import org.springframework.data.repository.CrudRepository;

import ec.edu.espe.examenMeneses.domain.docente;

public interface DocenteRepository extends CrudRepository<docente, Long> {
 docente findByCedula(String cedula);
 docente findByNombreAndEspecialidad(String nombre, String especialidad);
}




