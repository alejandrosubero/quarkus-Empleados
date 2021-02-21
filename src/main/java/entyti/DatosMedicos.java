package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "Datos_Medicos")
public class DatosMedicos implements Serializable {

    private static final long serialVersionUID = -8614492546311476102L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "medico_seq", initialValue = 15, allocationSize=100)
    @Column(name = "id_datos_medicos", updatable = false, nullable = false)
    private Integer idDatosMedicos;


    @Column
    private String historialMediconumero;

    @Column
    private String gruposanguineo;

    @Column
    private Double peso;

    @Column
    private Double altura;

    @Column
    private Boolean problemascardiacos;


    public DatosMedicos() {    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdDatosMedicos() {
        return idDatosMedicos;
    }

    public void setIdDatosMedicos(Integer idDatosMedicos) {
        this.idDatosMedicos = idDatosMedicos;
    }

    public String getHistorialMediconumero() {
        return historialMediconumero;
    }

    public void setHistorialMediconumero(String historialMediconumero) {
        this.historialMediconumero = historialMediconumero;
    }

    public String getGruposanguineo() {
        return gruposanguineo;
    }

    public void setGruposanguineo(String gruposanguineo) {
        this.gruposanguineo = gruposanguineo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Boolean getProblemascardiacos() {
        return problemascardiacos;
    }

    public void setProblemascardiacos(Boolean problemascardiacos) {
        this.problemascardiacos = problemascardiacos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosMedicos that = (DatosMedicos) o;
        return Objects.equals(idDatosMedicos, that.idDatosMedicos) && Objects.equals(historialMediconumero, that.historialMediconumero) && Objects.equals(gruposanguineo, that.gruposanguineo) && Objects.equals(peso, that.peso) && Objects.equals(altura, that.altura) && Objects.equals(problemascardiacos, that.problemascardiacos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatosMedicos, historialMediconumero, gruposanguineo, peso, altura, problemascardiacos);
    }

    @Override
    public String toString() {
        return "DatosMedicos{" +
                "idDatosMedicos=" + idDatosMedicos +
                ", historialMediconumero='" + historialMediconumero + '\'' +
                ", gruposanguineo='" + gruposanguineo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", problemascardiacos=" + problemascardiacos +
                '}';
    }
}
