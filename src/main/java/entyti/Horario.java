package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Horario")
public class Horario implements Serializable {

    private static final long serialVersionUID = -4390448679542644509L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "horario_seq", initialValue = 15, allocationSize=100)
    @Column(name = "id_horario", updatable = false, nullable = false)
    private Integer idHorario;



    @Column
    private Integer diasQuePuedeFaltarAnual;

    @Column
    private Date diaHoraEntrada;

    @Column
    private Date diaHoraSalida;

    @Column
    private Boolean cumplioHorario;

    @Column
    private Integer diascumpliohorario;

    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_parametros")
    private Parametro parametro;

    public Horario() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public Integer getDiasQuePuedeFaltarAnual() {
        return diasQuePuedeFaltarAnual;
    }

    public void setDiasQuePuedeFaltarAnual(Integer diasQuePuedeFaltarAnual) {
        this.diasQuePuedeFaltarAnual = diasQuePuedeFaltarAnual;
    }

    public Date getDiaHoraEntrada() {
        return diaHoraEntrada;
    }

    public void setDiaHoraEntrada(Date diaHoraEntrada) {
        this.diaHoraEntrada = diaHoraEntrada;
    }

    public Date getDiaHoraSalida() {
        return diaHoraSalida;
    }

    public void setDiaHoraSalida(Date diaHoraSalida) {
        this.diaHoraSalida = diaHoraSalida;
    }

    public Boolean getCumplioHorario() {
        return cumplioHorario;
    }

    public void setCumplioHorario(Boolean cumplioHorario) {
        this.cumplioHorario = cumplioHorario;
    }

    public Integer getDiascumpliohorario() {
        return diascumpliohorario;
    }

    public void setDiascumpliohorario(Integer diascumpliohorario) {
        this.diascumpliohorario = diascumpliohorario;
    }

    public Parametro getParametro() {
        return parametro;
    }

    public void setParametro(Parametro parametro) {
        this.parametro = parametro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(idHorario, horario.idHorario) && Objects.equals(diasQuePuedeFaltarAnual, horario.diasQuePuedeFaltarAnual) && Objects.equals(diaHoraEntrada, horario.diaHoraEntrada) && Objects.equals(diaHoraSalida, horario.diaHoraSalida) && Objects.equals(cumplioHorario, horario.cumplioHorario) && Objects.equals(diascumpliohorario, horario.diascumpliohorario) && Objects.equals(parametro, horario.parametro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHorario, diasQuePuedeFaltarAnual, diaHoraEntrada, diaHoraSalida, cumplioHorario, diascumpliohorario, parametro);
    }

    @Override
    public String toString() {
        return "Horario{" +
                "idHorario=" + idHorario +
                ", diasQuePuedeFaltarAnual=" + diasQuePuedeFaltarAnual +
                ", diaHoraEntrada=" + diaHoraEntrada +
                ", diaHoraSalida=" + diaHoraSalida +
                ", cumplioHorario=" + cumplioHorario +
                ", diascumpliohorario=" + diascumpliohorario +
                ", parametro=" + parametro +
                '}';
    }
}
