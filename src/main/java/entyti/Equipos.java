package entyti;


import com.sun.istack.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Equipos")
public class Equipos  implements Serializable {

    private static final long serialVersionUID = 5605694055965072058L;


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_empleado_generator")
    @SequenceGenerator(name="sequence_empleado_generator", sequenceName = "equipo_seq", initialValue = 10, allocationSize=100)
    @Column(name = "id_equipos", updatable = false, nullable = false)
    private Integer idEquipos;


    @Column(nullable = true)
    private Boolean telefono;

    @Column(nullable = true)
    private String numerodeSerieTelefono;

    @Column(nullable = true)
    private Boolean laptop;

    @Column(nullable = true)
    private String numerodeSerieLaptop;

    @Column(nullable = true)
    private Boolean cpu;

    @Column(nullable = true)
    private String numerodeserieCpu;

    @Column(nullable = true)
    private Boolean mouse;

    @Column(nullable = true)
    private String numerodeseriemouse;

    @Column(nullable = true)
    private Boolean teclado;

    @Column(nullable = true)
    private String numerodeserieteclado;




    public Equipos() {  }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(Integer idEquipos) {
        this.idEquipos = idEquipos;
    }

    public Boolean getTelefono() {
        return telefono;
    }

    public void setTelefono(Boolean telefono) {
        this.telefono = telefono;
    }

    public String getNumerodeSerieTelefono() {
        return numerodeSerieTelefono;
    }

    public void setNumerodeSerieTelefono(String numerodeSerieTelefono) {
        this.numerodeSerieTelefono = numerodeSerieTelefono;
    }

    public Boolean getLaptop() {
        return laptop;
    }

    public void setLaptop(Boolean laptop) {
        this.laptop = laptop;
    }

    public String getNumerodeSerieLaptop() {
        return numerodeSerieLaptop;
    }

    public void setNumerodeSerieLaptop(String numerodeSerieLaptop) {
        this.numerodeSerieLaptop = numerodeSerieLaptop;
    }

    public Boolean getCpu() {
        return cpu;
    }

    public void setCpu(Boolean cpu) {
        this.cpu = cpu;
    }

    public String getNumerodeserieCpu() {
        return numerodeserieCpu;
    }

    public void setNumerodeserieCpu(String numerodeserieCpu) {
        this.numerodeserieCpu = numerodeserieCpu;
    }

    public Boolean getMouse() {
        return mouse;
    }

    public void setMouse(Boolean mouse) {
        this.mouse = mouse;
    }

    public String getNumerodeseriemouse() {
        return numerodeseriemouse;
    }

    public void setNumerodeseriemouse(String numerodeseriemouse) {
        this.numerodeseriemouse = numerodeseriemouse;
    }

    public Boolean getTeclado() {
        return teclado;
    }

    public void setTeclado(Boolean teclado) {
        this.teclado = teclado;
    }

    public String getNumerodeserieteclado() {
        return numerodeserieteclado;
    }

    public void setNumerodeserieteclado(String numerodeserieteclado) {
        this.numerodeserieteclado = numerodeserieteclado;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipos equipos = (Equipos) o;
        return Objects.equals(idEquipos, equipos.idEquipos) && Objects.equals(telefono, equipos.telefono) && Objects.equals(numerodeSerieTelefono, equipos.numerodeSerieTelefono) && Objects.equals(laptop, equipos.laptop) && Objects.equals(numerodeSerieLaptop, equipos.numerodeSerieLaptop) && Objects.equals(cpu, equipos.cpu) && Objects.equals(numerodeserieCpu, equipos.numerodeserieCpu) && Objects.equals(mouse, equipos.mouse) && Objects.equals(numerodeseriemouse, equipos.numerodeseriemouse) && Objects.equals(teclado, equipos.teclado) && Objects.equals(numerodeserieteclado, equipos.numerodeserieteclado) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEquipos, telefono, numerodeSerieTelefono, laptop, numerodeSerieLaptop, cpu, numerodeserieCpu, mouse, numerodeseriemouse, teclado, numerodeserieteclado);
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "idEquipos=" + idEquipos +
                ", telefono=" + telefono +
                ", numerodeSerieTelefono='" + numerodeSerieTelefono + '\'' +
                ", laptop=" + laptop +
                ", numerodeSerieLaptop='" + numerodeSerieLaptop + '\'' +
                ", cpu=" + cpu +
                ", numerodeserieCpu='" + numerodeserieCpu + '\'' +
                ", mouse=" + mouse +
                ", numerodeseriemouse='" + numerodeseriemouse + '\'' +
                ", teclado=" + teclado +
                ", numerodeserieteclado='" + numerodeserieteclado + '\'' +
                '}';
    }
}
