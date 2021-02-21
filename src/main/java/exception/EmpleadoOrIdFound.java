package exception;

public class EmpleadoOrIdFound extends Exception {

    public  static final long serialVersionUID = -5162166239226031504L;


    public EmpleadoOrIdFound() {
        super ("Id no encontrado");
    }

    public EmpleadoOrIdFound(String message) {
        super(message);
    }

}
