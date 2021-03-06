package ec.edu.epn.paciente;

public interface Tratamiento {

    public abstract String registrarTratamiento(String id, String procedimiento, String prescripcion);

    public abstract Boolean existeTratamiento(String id, String fecha);

    public abstract String actualizarTratamiento(String id, String nuevoProcedimiento, String fecha);

    public abstract String actualizarPrescripcionTratamiento(String id, String nuevoPrescripcion, String fecha);

}
