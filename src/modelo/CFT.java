package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class CFT {

    String nombre;
    ArrayList<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
    ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
    ArrayList<CarreraOnline> listaCarrerasOnline = new ArrayList<CarreraOnline>();

    public CFT() {
    }

    public CFT(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante leerEstudiante() {
        Scanner leer = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();
        System.out.println("Ingrese código de carrera (solo números)");
        estudiante.setCodigoCarrera(leer.nextInt());
        System.out.println("Ingrese código del estudiante (solo números)");
        estudiante.setCodigo(leer.nextInt());
        System.out.println("Ingrese el nombre del estudiante");
        estudiante.setNombre(leer.next());
        System.out.println("Ingrese el apellido del estudiante");
        estudiante.setApellido(leer.next());
        System.out.println("Ingrese el sexo del estudiante");
        estudiante.setSexo(leer.next());
        System.out.println("Ingrese la edad del estudiante");
        estudiante.setEdad(leer.nextInt());
        System.out.println("Ingrese año de ingreso (solo números)");
        estudiante.setAnioIngreso(leer.nextInt());
        return estudiante;
    }

    public void guardarEstudiante(Estudiante estudiante) {
        listaEstudiante.add(estudiante);
    }

    public void mostrarListaEstudiante() {
        for (Estudiante integrante : listaEstudiante) {
            System.out.println("El código de carrera es: " + integrante.getCodigoCarrera());
            System.out.println("El código del estudiante es: " + integrante.getCodigo());
            System.out.println("El nombre completo del estudiante es: " + integrante.getNombre() + " " + integrante.getApellido());
            System.out.println("El estudiante es: " + integrante.getSexo());
            System.out.println("El estudiante tiene " + integrante.getEdad() + " años");
            System.out.println("El año de ingreso es: " + integrante.getAnioIngreso());
        }
    }

    public void borrarEstudiante(int codigo) {
        for (Estudiante integrante : listaEstudiante) {
            if (integrante.getCodigo() == codigo) {
                listaEstudiante.remove(integrante);
                //se utiliza break para evitar que el ciclo siga aun cuando no tiene elementos
                break;
            }
        }

    }

    public Profesor leerProfesor() {
        Scanner leer = new Scanner(System.in);
        Profesor profesor = new Profesor();
        System.out.println("Ingrese código del profesor (solo números)");
        profesor.setCodigoProfesor(leer.nextInt());
        System.out.println("Ingrese el nombre del profesor");
        profesor.setNombre(leer.next());
        System.out.println("Ingrese el apellido del profesor");
        profesor.setApellido(leer.next());
        System.out.println("Ingrese la asignatura que imparte el docente");
        profesor.setAsignaturaImpartida(leer.next());
        System.out.println("Ingrese el tipo de contrato del docente");
        profesor.setTipoContrato(leer.next());
        System.out.println("Ingrese el sexo del profesor");
        profesor.setSexo(leer.next());
        System.out.println("Ingrese la edad del profesor (solo números)");
        profesor.setEdad(leer.nextInt());

        return profesor;
    }

    public void guardarProfesor(Profesor profesor) {
        listaProfesores.add(profesor);
    }

    public void mostrarListaProfesores() {
        for (Profesor integrante : listaProfesores) {
            System.out.println("El código del profesor es: " + integrante.getCodigoProfesor());
            System.out.println("El nombre completo del profesor es: " + integrante.getNombre() + " " + integrante.getApellido());
            System.out.println("La asignatura que imparte es: " + integrante.getAsignaturaImpartida());
            System.out.println("El tipo de contratato del docente es : " + integrante.getTipoContrato());
            System.out.println("El profesor es: " + integrante.getSexo());
            System.out.println("El profesor tiene " + integrante.getEdad() + " años");

        }
    }
    
    public void borrarProfesor(int codigo){
        for(Profesor integrante : listaProfesores){
           if(integrante.getCodigo() == codigo){
               listaProfesores.remove(integrante);
               break;
           } 
        }
    }
    
    public CarreraOnline agregarCarrera(){
        Scanner leer = new Scanner(System.in);
        CarreraOnline carreraOnline = new CarreraOnline();
        System.out.println("Inserte Código de la carrera");
        carreraOnline.setCodigoCarrera(leer.nextInt());
        //limpia el buffer
        leer.nextLine();
        System.out.println("Inserte nombre de la carrera");
        carreraOnline.setNombreCarrera(leer.nextLine());
        System.out.println("Inserte jornada de la carrera (sólo la inicial)");
        carreraOnline.setJornada(leer.next().charAt(0));
        System.out.println("Digite número de semestres (solo números");
        carreraOnline.setNumeroSemestres(leer.nextInt());
        System.out.println("Digite cantidad de horas (sólo números)");
        carreraOnline.setHorasTotales(leer.nextInt());
        System.out.println("Digite número de módulos (Sólo números)");
        carreraOnline.setNumeroModulos(leer.nextInt());
        System.out.println("Ingrese el tipo de plataforma (MS Teams o Zoom)");
        carreraOnline.setPlataformaOnline(leer.next());
        System.out.println("Ingrese correo de soporte (Sólo nombre de usuario)");
        carreraOnline.setCorreoSoporte(leer.next());
        return carreraOnline;
    }
    
    public void guardarCarreraOnline (CarreraOnline carreraOnline){
        listaCarrerasOnline.add(carreraOnline);
    }
    
    public void mostrarCarrerasOnline(){
        for(CarreraOnline carreraOnline : listaCarrerasOnline){
            System.out.println("El código de carrera es: " + carreraOnline.getCodigoCarrera());            
            System.out.println("El nombre de carrera es: " + carreraOnline.getNombreCarrera());            
            System.out.println("La jornada de carrera es: " + carreraOnline.getJornada());            
            System.out.println("El de semestres de la carrera es: " + carreraOnline.getNumeroModulos());            
            System.out.println("La cantidad de horas de la carrera es: " + carreraOnline.getHorasTotales());            
            System.out.println("La cantidad de módulos de la carrera es :" + carreraOnline.getNumeroModulos());            
            System.out.println("La plataforma por la que se impartirá la carrera es : " + carreraOnline.getPlataformaOnline());            
            System.out.println("El correo de soporte de la carrera es: " + carreraOnline.getCorreoSoporte()+ "@soportecft.cl");
        }
    }
}
