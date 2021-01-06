
package modelo;

//clase Padre o súper clase
public class Carrera {
    
    int codigoCarrera;
    String nombreCarrera;
    char jornada;
    int numeroSemestres;
    int horasTotales;

    //constructor Vacío
    public Carrera() {
    }

    //constructor sobreCargado
    public Carrera(int codigoCarrera, String nombreCarrera, char jornada, int numeroSemestres, int horasTotales) {
        this.codigoCarrera = codigoCarrera;
        this.nombreCarrera = nombreCarrera;
        this.jornada = jornada;
        this.numeroSemestres = numeroSemestres;
        this.horasTotales = horasTotales;
    }

    
    public int getCodigoCarrera() {
        return codigoCarrera;
    }
    
    
    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public char getJornada() {
        return jornada;
    }

    public void setJornada(char jornada) {
        this.jornada = jornada;
    }

    public int getNumeroSemestres() {
        return numeroSemestres;
    }

    public void setNumeroSemestres(int numeroSemestres) {
        this.numeroSemestres = numeroSemestres;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }
    
    
}
