
package modelo;

//clase heredera o clase hija
public class CarreraOnline extends Carrera{
    
    int numeroModulos;
    String plataformaOnline;
    String CorreoSoporte;

    public CarreraOnline() {
    }

    //súper constructor
    public CarreraOnline(int codigoCarrera, String nombreCarrera, char jornada, int numeroSemestres, int horasTotales) {
        super(codigoCarrera, nombreCarrera, jornada, numeroSemestres, horasTotales);
    }
    
    
    public CarreraOnline(int numeroModulos, String plataformaOnline, String CorreoSoporte) {
        this.numeroModulos = numeroModulos;
        this.plataformaOnline = plataformaOnline;
        this.CorreoSoporte = CorreoSoporte;
    }

    public int getNumeroModulos() {
        return numeroModulos;
    }

    public void setNumeroModulos(int numeroModulos) {
        this.numeroModulos = numeroModulos;
    }

    public String getPlataformaOnline() {
        return plataformaOnline;
    }

    public void setPlataformaOnline(String plataformaOnline) {
        this.plataformaOnline = plataformaOnline;
    }

    public String getCorreoSoporte() {
        return CorreoSoporte;
    }

    public void setCorreoSoporte(String CorreoSoporte) {
        this.CorreoSoporte = CorreoSoporte;
    }
    
    
}
