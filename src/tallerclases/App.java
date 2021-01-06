package tallerclases;

import java.util.Scanner;
import modelo.CFT;
import modelo.Menu;

public class App {

    public static void main(String[] args) {
        Menu mainMenu = new Menu();
        CFT cft = new CFT();
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            mainMenu.menu();
            System.out.println("Ingrese su opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del estudiante");
                    cft.guardarEstudiante(cft.leerEstudiante());
                    break;
                case 2:
                    System.out.println("Ingrese los datos del profesor ");
                    cft.guardarProfesor(cft.leerProfesor());
                    break;
                case 3:
                    System.out.println("Los datos de los estudiantes guardados son: ");
                    cft.mostrarListaEstudiante();
                    break;
                case 4:
                    System.out.println("Los datos de los profesores guardados son: ");
                    cft.mostrarListaProfesores();
                    break;
                case 5: 
                    System.out.println("Ingrese el código del estudiante que desea borrar");
                    cft.borrarEstudiante(leer.nextInt());
                    break;
                case 6:
                    System.out.println("Ingrese el código del profesor que desea borrar");
                    cft.borrarProfesor(leer.nextInt());
                    break;
                case 7:
                    System.out.println("Ingrese los datos de la carrera a crear");
                    cft.guardarCarreraOnline(cft.agregarCarrera());
                    break;
                case 8: 
                    System.out.println("Las carreras guardadas son: ");
                    cft.mostrarCarrerasOnline();
                    break;
            }

        } while (opcion != 9);

    }
}
