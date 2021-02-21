package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "conyugue")
public class Conyugue implements Serializable {

    private static final long serialVersionUID = -5973274901662557945L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "conyugue_seq", initialValue = 10, allocationSize=100)
    @Column(name = "id_conyugue", updatable = false, nullable = false)
    private Integer id;

    @Column
    private String correoPersonal;

    @Column
    private String nombreConyuge;

    @Column
    private String apellidoConyuge;

    @Column
    private Integer edadConyuge;

    @Column
    private String DocumentoConyuge;

    @Column
    private String telefocelularConyuge;

    @Column
    private String telefonoFijoConyuge;

    @Column
    private String direcionConyuge;

    public Conyugue() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public String getNombreConyuge() {
        return nombreConyuge;
    }

    public void setNombreConyuge(String nombreConyuge) {
        this.nombreConyuge = nombreConyuge;
    }

    public String getApellidoConyuge() {
        return apellidoConyuge;
    }

    public void setApellidoConyuge(String apellidoConyuge) {
        this.apellidoConyuge = apellidoConyuge;
    }

    public Integer getEdadConyuge() {
        return edadConyuge;
    }

    public void setEdadConyuge(Integer edadConyuge) {
        this.edadConyuge = edadConyuge;
    }

    public String getDocumentoConyuge() {
        return DocumentoConyuge;
    }

    public void setDocumentoConyuge(String documentoConyuge) {
        DocumentoConyuge = documentoConyuge;
    }

    public String getTelefocelularConyuge() {
        return telefocelularConyuge;
    }

    public void setTelefocelularConyuge(String telefocelularConyuge) {
        this.telefocelularConyuge = telefocelularConyuge;
    }

    public String getTelefonoFijoConyuge() {
        return telefonoFijoConyuge;
    }

    public void setTelefonoFijoConyuge(String telefonoFijoConyuge) {
        this.telefonoFijoConyuge = telefonoFijoConyuge;
    }

    public String getDirecionConyuge() {
        return direcionConyuge;
    }

    public void setDirecionConyuge(String direcionConyuge) {
        this.direcionConyuge = direcionConyuge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conyugue conyugue = (Conyugue) o;
        return Objects.equals(id, conyugue.id) && Objects.equals(correoPersonal, conyugue.correoPersonal) && Objects.equals(nombreConyuge, conyugue.nombreConyuge) && Objects.equals(apellidoConyuge, conyugue.apellidoConyuge) && Objects.equals(edadConyuge, conyugue.edadConyuge) && Objects.equals(DocumentoConyuge, conyugue.DocumentoConyuge) && Objects.equals(telefocelularConyuge, conyugue.telefocelularConyuge) && Objects.equals(telefonoFijoConyuge, conyugue.telefonoFijoConyuge) && Objects.equals(direcionConyuge, conyugue.direcionConyuge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, correoPersonal, nombreConyuge, apellidoConyuge, edadConyuge, DocumentoConyuge, telefocelularConyuge, telefonoFijoConyuge, direcionConyuge);
    }

    @Override
    public String toString() {
        return "Conyugue{" +
                "id=" + id +
                ", correoPersonal='" + correoPersonal + '\'' +
                ", nombreConyuge='" + nombreConyuge + '\'' +
                ", apellidoConyuge='" + apellidoConyuge + '\'' +
                ", edadConyuge=" + edadConyuge +
                ", DocumentoConyuge='" + DocumentoConyuge + '\'' +
                ", telefocelularConyuge='" + telefocelularConyuge + '\'' +
                ", telefonoFijoConyuge='" + telefonoFijoConyuge + '\'' +
                ", direcionConyuge='" + direcionConyuge + '\'' +
                '}';
    }
}
