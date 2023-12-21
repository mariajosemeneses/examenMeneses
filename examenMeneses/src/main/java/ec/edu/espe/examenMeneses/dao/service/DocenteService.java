package ec.edu.espe.examenMeneses.dao.service;

import java.util.Optional;
import ec.edu.espe.examenMeneses.domain.docente;
import ec.edu.espe.examenMeneses.dao.service.dao.DocenteRepository;
import ec.edu.espe.examenMeneses.dao.service.dao.EspecialidadRepository;

public class DocenteService<docente> {
    private final DocenteRepository docenteRepository;
    private final EspecialidadRepository especialidadRepository;
    public DocenteService(DocenteRepository docenteRepository, EspecialidadRepository especialidadRepository) {
        this.docenteRepository = docenteRepository;
        this.especialidadRepository = especialidadRepository;
    }

    
    
    

}
