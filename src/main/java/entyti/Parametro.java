package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Parametro")
public class Parametro implements Serializable {

    private static final long serialVersionUID = 5639212927691026356L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "parametro_seq", initialValue = 10, allocationSize=100)
    @Column(name = "id_parametro", updatable = false, nullable = false)
    private Integer idparametro;


    @Column(name = "tipo_horario")
    private String tipoDeHorario;

    @Column(name = "tipo_parametro")
    private String tipoParametro;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "valor")
    private String valor;

    @Column(name = "clave")
    private String clave;

    @Column(name = "hora_entrada")
    private Date horaEntrada;

    @Column(name = "hora_salida")
    private Date horaSalida;


    public Parametro() {   }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdparametro() {
        return idparametro;
    }

    public void setIdparametro(Integer idparametro) {
        this.idparametro = idparametro;
    }

    public String getTipoDeHorario() {
        return tipoDeHorario;
    }

    public void setTipoDeHorario(String tipoDeHorario) {
        this.tipoDeHorario = tipoDeHorario;
    }

    public String getTipoParametro() {
        return tipoParametro;
    }

    public void setTipoParametro(String tipoParametro) {
        this.tipoParametro = tipoParametro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parametro parametro = (Parametro) o;
        return Objects.equals(idparametro, parametro.idparametro) && Objects.equals(tipoDeHorario, parametro.tipoDeHorario) && Objects.equals(tipoParametro, parametro.tipoParametro) && Objects.equals(descripcion, parametro.descripcion) && Objects.equals(valor, parametro.valor) && Objects.equals(clave, parametro.clave) && Objects.equals(horaEntrada, parametro.horaEntrada) && Objects.equals(horaSalida, parametro.horaSalida);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idparametro, tipoDeHorario, tipoParametro, descripcion, valor, clave, horaEntrada, horaSalida);
    }

    @Override
    public String toString() {
        return "Parametro{" +
                "idparametro=" + idparametro +
                ", tipoDeHorario='" + tipoDeHorario + '\'' +
                ", tipoParametro='" + tipoParametro + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", valor='" + valor + '\'' +
                ", clave='" + clave + '\'' +
                ", horaEntrada=" + horaEntrada +
                ", horaSalida=" + horaSalida +
                '}';
    }
}
