package ec.edu.espe.examenMeneses.domain;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "DOCENTE")
public class docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_DOCENTE", nullable = false)
    private Long codigo;
    @ManyToOne
    @JoinColumn(name = "COD_ESPECIALIDAD")
    private especialidad especialidad;


    @Column(name = "CEDULA", nullable = false, length = 10)
    private String cedula;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "FECHA_INGRESO")
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Column(name = "TITULO", nullable = false, length = 100)
    private String titulo;

    @OneToMany(mappedBy = "docente")
    private List<docenteMateria> docenteMateria;

    @Version
    private long version;


    public docente(Long codigo) {
        this.codigo = codigo;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
        docente other = (docente) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "docente [codigo=" + codigo + ", especialidad=" + especialidad + ", cedula=" + cedula + ", nombre="
                + nombre + ", fechaIngreso=" + fechaIngreso + ", titulo=" + titulo + ", docenteMateria="
                + docenteMateria + "]";
    }

}
