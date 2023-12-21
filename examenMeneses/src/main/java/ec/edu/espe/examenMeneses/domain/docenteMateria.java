package ec.edu.espe.examenMeneses.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "DOCENTE_MATERIA")
public class docenteMateria {
     @EmbeddedId
    private DocenteMateriaPK docenteMateriaPK;

    @Column(name = "PERIODO", nullable = false, length = 10)
    private String periodo;

    @Column(name = "ALUMNOS_MATRICULADOS", nullable = false, length = 2)
    private long alumnosMatriculados;
@Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;

    @Column(name = "PROMEDIO_CURSO", nullable = false, length = 4, scale = 2)
    private long promedioCurso;

    @Column(name = "FECHA_ULTIMO_CAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimoCambio;

    @Version
    private long version;

    public docenteMateria(DocenteMateriaPK docenteMateriaPK) {
        this.docenteMateriaPK = docenteMateriaPK;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((docenteMateriaPK == null) ? 0 : docenteMateriaPK.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        docenteMateria other = (docenteMateria) obj;
        if (docenteMateriaPK == null) {
            if (other.docenteMateriaPK != null)
                return false;
        } else if (!docenteMateriaPK.equals(other.docenteMateriaPK))
            return false;
        return true;
    }




}
