package ec.edu.espe.examenMeneses.domain;

import jakarta.persistence.Column;

public class DocenteMateriaPK {
 @Column(name = "COD_DOCENTE", nullable = false)
    private Integer codDocente;

    @Column(name = "COD_ESPECIALIDAD", nullable = false, length = 3)
    private Integer codEspecialidad;

    public DocenteMateriaPK(Integer codDocente, Integer codEspecialidad) {
        this.codDocente = codDocente;
        this.codEspecialidad = codEspecialidad;
    }

    
}
