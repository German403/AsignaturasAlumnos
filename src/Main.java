//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.JOptionPane;
public class Main {

    public static void menu(){
        System.out.println("""
                menu
                *********************
                1- Mostrar asignaturas de todos los alumnos
                2- 
                """);

    }

    public static int conversion(String opcion){
        return Integer.parseInt(opcion);
    }

    public static void motrarAsignaturasTodosAlumnos(String [] Alumnos, String [][] Asignaturas){
        for (int i = 0; i < 3; i++) {
            System.out.println("\nAlumno: "+Alumnos[i]+"\n__________");
            for (int j = 0; j < Asignaturas[i].length; j++) {
                System.out.println(Asignaturas[i][j]);

            }
        }
    }

    public static void mostrarAlumno(String [] Alumnos, String [][] Asignaturas){
        String nombreAlumno = JOptionPane.showInputDialog("Introduce el nombre del alumno");
        nombreAlumno = nombreAlumno.toLowerCase();
        for (int i = 0; i < 3; i++) {
            if(Alumnos[i].equals((nombreAlumno))){
                System.out.println("\nAlumno: "+Alumnos[i]+"\n__________");
                for (int j = 0; j < Asignaturas[i].length; j++) {
                    System.out.println(Asignaturas[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void repetidores(String [] Alumnos, String [][] Asignaturas) {
        for (int i = 0; i < 3; i++) {
            if (Asignaturas[i].length < 5) {
                System.out.println("\nAlumno: " + Alumnos[i] + "\n__________");
                for (int j = 0; j < Asignaturas[i].length; j++) {
                    System.out.println(Asignaturas[i][j]);
                }
                System.out.println();
            }
        }
    }

    public static void opciones(String [] Alumnos, String [][] Asignaturas, String opcion){
        switch (conversion(opcion)){
            case 1:
                motrarAsignaturasTodosAlumnos(Alumnos, Asignaturas);
                break;
            case 2:
                mostrarAlumno(Alumnos, Asignaturas);
                break;
            case 3:
                repetidores(Alumnos, Asignaturas);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El programa se esta cerrando", "Saliendo del programa", 3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Error: Opcion no valida", "Error", 2);
        }

    }

    public static void main(String[] args) {

        String opcion;
        String [] Alumnos = {"Jaime Torres", "Sara Gonzalez", "Pepe Gomez"};
        String [][] Asignaturas = {{"Programacion", "Bases de datos", "Sistemas informaticos", "Lenguaje de marcas", "Entornos de desarrollo", "FOL"},
                                    {"Programacion", "Bases de datos", "Sistemas informaticos", "Lenguaje de marcas", "Entornos de desarrollo"},
                                    {"Programacion", "Bases de datos"}
        };
        do {
            menu();
            opcion = JOptionPane.showInputDialog("Selecciona una opcion");
            opciones(Alumnos, Asignaturas, opcion);
        }while(conversion(opcion) != 4);

            
        }
    }