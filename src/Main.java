
public class Main {
    public static void main(String[] args) {

        String nombre = "Thomas";
        int[] calificaciones = {8,9,10,10,8};
        imprimir("Thomas", calificaciones, getPromedio(calificaciones), getCalificacion(getPromedio(calificaciones)));


    }

    public static double getPromedio(int[] calificaciones) {
        int suma = 0;
        for (int x = 0; x < calificaciones.length; x++) {
            suma = suma + calificaciones[x];
        }
        double  prom = suma / calificaciones.length;
        return prom;
    }

    public static char getCalificacion(double promedio){
        char calif = 'F';

        if (promedio <= 50){
            calif = 'F';
        } else if (promedio >= 51 && promedio <= 60 ) {
            calif = 'E';
        }else if (promedio >= 61 && promedio <= 70){
            calif = 'D';
        }else if (promedio >= 71 && promedio <= 80){
            calif = 'C';
        }else if (promedio >= 81 && promedio <= 90){
            calif = 'B';
        }else if (promedio >= 91 && promedio <= 100){
            calif = 'A';
        }else{
            calif = 'F';
        }

        return calif;
    }

    public static void imprimir(String nombre, int[] calificaciones, double promedio, char calificacion){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Calificación 1: " + calificaciones[0]);
        System.out.println("Calificación 2: " + calificaciones[1]);
        System.out.println("Calificación 3: " + calificaciones[2]);
        System.out.println("Calificación 4: " + calificaciones[3]);
        System.out.println("Calificación 5: " + calificaciones[4]);
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}
