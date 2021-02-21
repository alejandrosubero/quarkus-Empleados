package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Direccion")
public class Direccion implements Serializable {

    private static final long serialVersionUID = 598485651567543651L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "direccion_seq", initialValue = 20, allocationSize=100)
    @Column(name = "id_direccion", updatable = false, nullable = false)
    private Integer idDireccion;


    @Column
    private String direccion1;

    @Column
    private String direccion2;

    @Column
    private String codigoDeArea;


    public Direccion() {   }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(Integer idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion1() {
        return direccion1;
    }

    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }

    public String getDireccion2() {
        return direccion2;
    }

    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }

    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public void setCodigoDeArea(String codigoDeArea) {
        this.codigoDeArea = codigoDeArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(idDireccion, direccion.idDireccion) && Objects.equals(direccion1, direccion.direccion1) && Objects.equals(direccion2, direccion.direccion2) && Objects.equals(codigoDeArea, direccion.codigoDeArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDireccion, direccion1, direccion2, codigoDeArea);
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "idDireccion=" + idDireccion +
                ", direccion1='" + direccion1 + '\'' +
                ", direccion2='" + direccion2 + '\'' +
                ", codigoDeArea='" + codigoDeArea + '\'' +
                '}';
    }
}
