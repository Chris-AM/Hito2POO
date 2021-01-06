
package modelo;

public class Profesor extends Persona {
    
    int codigoProfesor;
    String asignaturaImpartida;
    String tipoContrato;

    public Profesor(){}
    
    public Profesor(int codigo,String nombre,String apellido,String sexo, int edad) {
        super(codigo,nombre, apellido, sexo, edad);
    }

    public Profesor(int codigoProfesor, String asignaturaImpartida, String tipoContrato) {
        this.codigoProfesor = codigoProfesor;
        this.asignaturaImpartida = asignaturaImpartida;
        this.tipoContrato = tipoContrato;
    }

    public int getCodigoProfesor() {
        return codigoProfesor;
    }

    public void setCodigoProfesor(int codigoProfesor) {
        this.codigoProfesor = codigoProfesor;
    }

    public String getAsignaturaImpartida() {
        return asignaturaImpartida;
    }

    public void setAsignaturaImpartida(String asignaturaImpartida) {
        this.asignaturaImpartida = asignaturaImpartida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
}
