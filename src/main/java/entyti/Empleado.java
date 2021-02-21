package entyti;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name ="Empleado")
public class Empleado implements Serializable, Comparable <Empleado> {


    private static final long serialVersionUID = 1710473100121966275L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "empleado_seq", initialValue = 9, allocationSize=100)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id;


    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private Integer documento;

    @Column
    private Date fechaNacimiento;

    @Column
    private Integer empleadoNumero;

    @Column
    private  Date fechaIngreso;

    @Column
    private String division;

    @Column
    private String gerente;

    @Column
    private String cargo;

    @Column
    private String seguropoliza;

    @Column
    private String correoEmpresa;

    @Column
    private String numeroExtencionTelefono;

    @Column
    private String numeroTelefonoEmpresa;

    @Column
    private Boolean isActivo;


    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_datosPersonales")
    private DatosPersonales datosPersonales;

    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_equipos")
    private Equipos equipos;

    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_datosMedicos")
    private DatosMedicos datosMedicos;

    @OneToOne( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_horario")
    private Horario horario;


    public Empleado() {  }

    @Override
    public int compareTo(Empleado o) {
        String a=new String(this.getNombre());
        String b=new String(o.getNombre());
        return a.compareTo(b);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEmpleadoNumero() {
        return empleadoNumero;
    }

    public void setEmpleadoNumero(Integer empleadoNumero) {
        this.empleadoNumero = empleadoNumero;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSeguropoliza() {
        return seguropoliza;
    }

    public void setSeguropoliza(String seguropoliza) {
        this.seguropoliza = seguropoliza;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getNumeroExtencionTelefono() {
        return numeroExtencionTelefono;
    }

    public void setNumeroExtencionTelefono(String numeroExtencionTelefono) {
        this.numeroExtencionTelefono = numeroExtencionTelefono;
    }

    public String getNumeroTelefonoEmpresa() {
        return numeroTelefonoEmpresa;
    }

    public void setNumeroTelefonoEmpresa(String numeroTelefonoEmpresa) {
        this.numeroTelefonoEmpresa = numeroTelefonoEmpresa;
    }

    public Boolean getActivo() {
        return isActivo;
    }

    public void setActivo(Boolean activo) {
        isActivo = activo;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public DatosMedicos getDatosMedicos() {
        return datosMedicos;
    }

    public void setDatosMedicos(DatosMedicos datosMedicos) {
        this.datosMedicos = datosMedicos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(id, empleado.id) && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido) && Objects.equals(documento, empleado.documento) && Objects.equals(fechaNacimiento, empleado.fechaNacimiento) && Objects.equals(empleadoNumero, empleado.empleadoNumero) && Objects.equals(fechaIngreso, empleado.fechaIngreso) && Objects.equals(division, empleado.division) && Objects.equals(gerente, empleado.gerente) && Objects.equals(cargo, empleado.cargo) && Objects.equals(seguropoliza, empleado.seguropoliza) && Objects.equals(correoEmpresa, empleado.correoEmpresa) && Objects.equals(numeroExtencionTelefono, empleado.numeroExtencionTelefono) && Objects.equals(numeroTelefonoEmpresa, empleado.numeroTelefonoEmpresa) && Objects.equals(isActivo, empleado.isActivo) && Objects.equals(datosPersonales, empleado.datosPersonales) && Objects.equals(equipos, empleado.equipos) && Objects.equals(datosMedicos, empleado.datosMedicos) && Objects.equals(horario, empleado.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, documento, fechaNacimiento, empleadoNumero, fechaIngreso, division, gerente, cargo, seguropoliza, correoEmpresa, numeroExtencionTelefono, numeroTelefonoEmpresa, isActivo, datosPersonales, equipos, datosMedicos, horario);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", fechaNacimiento=" + fechaNacimiento +
                ", empleadoNumero=" + empleadoNumero +
                ", fechaIngreso=" + fechaIngreso +
                ", division='" + division + '\'' +
                ", gerente='" + gerente + '\'' +
                ", cargo='" + cargo + '\'' +
                ", seguropoliza='" + seguropoliza + '\'' +
                ", correoEmpresa='" + correoEmpresa + '\'' +
                ", numeroExtencionTelefono='" + numeroExtencionTelefono + '\'' +
                ", numeroTelefonoEmpresa='" + numeroTelefonoEmpresa + '\'' +
                ", isActivo=" + isActivo +
                ", datosPersonales=" + datosPersonales +
                ", equipos=" + equipos +
                ", datosMedicos=" + datosMedicos +
                ", horario=" + horario +
                '}';
    }
}
