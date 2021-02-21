package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "Datos_Personales")
public class DatosPersonales implements Serializable {

    private static final long serialVersionUID = -1054966437051118352L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "datos_seq", initialValue = 8, allocationSize=100)
    @Column(name = "iddatospersonales", updatable = false, nullable = false)
    private Integer idDatosPersonales;


    @Column(name = "CORREO_PERSONAL", updatable = true, nullable = true)
    private String correoPersonal;

    @Column(name = "CORREO_ALTERNATIVO", updatable = true, nullable = true)
    private String correoAlternativo;

    @Column(name = "TELEFONO_CELULAR", updatable = true, nullable = true)
    private String telefocelular;

    @Column(name = "TELEFONO_FIJO", updatable = true, nullable = true)
    private String telefonoFijo;

    @Column(name = "CASADO", updatable = true, nullable = true)
    private Boolean casado;

    @Column(name = "TIENE_HIJOS", updatable = true, nullable = true)
    private Boolean tienehijos;

    @Column(name = "Numero_hijos", updatable = true, nullable = true)
    private Integer numeroHijos;


    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_Conyugue")
    private Conyugue conyugue;


    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_direccion")
    private Direccion direccion;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_HIJOS")
    private List<Hijo> hijo = new ArrayList<Hijo>();


    public DatosPersonales() {   }

    public Integer getIdDatosPersonales() {
        return idDatosPersonales;
    }

    public void setIdDatosPersonales(Integer idDatosPersonales) {
        this.idDatosPersonales = idDatosPersonales;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getCorreoAlternativo() {
        return correoAlternativo;
    }

    public void setCorreoAlternativo(String correoAlternativo) {
        this.correoAlternativo = correoAlternativo;
    }

    public String getTelefocelular() {
        return telefocelular;
    }

    public void setTelefocelular(String telefocelular) {
        this.telefocelular = telefocelular;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Boolean getCasado() {
        return casado;
    }

    public void setCasado(Boolean casado) {
        this.casado = casado;
    }

    public Boolean getTienehijos() {
        return tienehijos;
    }

    public void setTienehijos(Boolean tienehijos) {
        this.tienehijos = tienehijos;
    }

    public Integer getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(Integer numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public Conyugue getConyugue() {
        return conyugue;
    }

    public void setConyugue(Conyugue conyugue) {
        this.conyugue = conyugue;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Hijo> getHijo() {
        return hijo;
    }

    public void setHijo(List<Hijo> hijo) {
        this.hijo = hijo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatosPersonales that = (DatosPersonales) o;
        return Objects.equals(idDatosPersonales, that.idDatosPersonales) && Objects.equals(correoPersonal, that.correoPersonal) && Objects.equals(correoAlternativo, that.correoAlternativo) && Objects.equals(telefocelular, that.telefocelular) && Objects.equals(telefonoFijo, that.telefonoFijo) && Objects.equals(casado, that.casado) && Objects.equals(tienehijos, that.tienehijos) && Objects.equals(numeroHijos, that.numeroHijos) && Objects.equals(conyugue, that.conyugue) && Objects.equals(direccion, that.direccion) && Objects.equals(hijo, that.hijo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDatosPersonales, correoPersonal, correoAlternativo, telefocelular, telefonoFijo, casado, tienehijos, numeroHijos, conyugue, direccion, hijo);
    }

    @Override
    public String toString() {
        return "DatosPersonales{" +
                "idDatosPersonales=" + idDatosPersonales +
                ", correoPersonal='" + correoPersonal + '\'' +
                ", correoAlternativo='" + correoAlternativo + '\'' +
                ", telefocelular='" + telefocelular + '\'' +
                ", telefonoFijo='" + telefonoFijo + '\'' +
                ", casado=" + casado +
                ", tienehijos=" + tienehijos +
                ", numeroHijos=" + numeroHijos +
                ", conyugue=" + conyugue +
                ", direccion=" + direccion +
                ", hijo=" + hijo +
                '}';
    }
}



//    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
//    @JoinTable(name="datos_de_hijos",
//            joinColumns = @JoinColumn(name= "datos_personales_id", referencedColumnName="idDatosPersonales"),
//            inverseJoinColumns = @JoinColumn(name= "hijos_id"))
//    private List<Hijo> hijo = new ArrayList<>();