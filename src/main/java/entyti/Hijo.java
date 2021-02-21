package entyti;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "Hijos")
public class Hijo implements Serializable {

    private static final long serialVersionUID = 6894275503070665L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "hijo_seq", initialValue = 19, allocationSize=100)
    @Column(name = "idhijo", updatable = false, nullable = false)
    private Integer id;


    @Column(name = "NOMBRE", updatable = true, nullable = true)
    private String nombreHijo;

    @Column(name = "APELLIDOS", updatable = true, nullable = true)
    private String ApellidoSHijo;

    @Column(name = "NACIMIENTO_FECHA", updatable = true, nullable = true)
    private String fechaNacimiento;

    @Column(name = "DOCUMENTO_IDENTIDAD", updatable = true, nullable = true)
    private String DocumentoHijo;

    @Column(name = "DIRECCION", updatable = true, nullable = true)
    private String direcion;


    public Hijo() { }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public String getApellidoSHijo() {
        return ApellidoSHijo;
    }

    public void setApellidoSHijo(String apellidoSHijo) {
        ApellidoSHijo = apellidoSHijo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDocumentoHijo() {
        return DocumentoHijo;
    }

    public void setDocumentoHijo(String documentoHijo) {
        DocumentoHijo = documentoHijo;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hijo hijo = (Hijo) o;
        return Objects.equals(id, hijo.id) && Objects.equals(nombreHijo, hijo.nombreHijo) && Objects.equals(ApellidoSHijo, hijo.ApellidoSHijo) && Objects.equals(fechaNacimiento, hijo.fechaNacimiento) && Objects.equals(DocumentoHijo, hijo.DocumentoHijo) && Objects.equals(direcion, hijo.direcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreHijo, ApellidoSHijo, fechaNacimiento, DocumentoHijo, direcion);
    }

    @Override
    public String toString() {
        return "Hijo{" +
                "id=" + id +
                ", nombreHijo='" + nombreHijo + '\'' +
                ", ApellidoSHijo='" + ApellidoSHijo + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", DocumentoHijo='" + DocumentoHijo + '\'' +
                ", direcion='" + direcion + '\'' +
                '}';
    }
}
