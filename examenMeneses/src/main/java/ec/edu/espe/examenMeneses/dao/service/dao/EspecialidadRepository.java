package ec.edu.espe.examenMeneses.dao.service.dao;
import java.util.List;

import ec.edu.espe.examenMeneses.domain.especialidad;

public interface EspecialidadRepository {

    List<especialidad> findByNombreLikeOrderByNombre(String nombre);
}
