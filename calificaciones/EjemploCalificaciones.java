package calificaciones;
import java.util.Scanner;

public class EjemploCalificaciones {
    String nombre ="";
    int[] calif= new int[5];

    public static void main(String[] args) {

        String capturaNombre="";
        float promedioResult = 0;
        char califNota= ' ';

        Calificaciones pCalculoCalif = new Calificaciones();
        System.out.print("CALIFICACIONES UNIVERDAD TECMILENIO\n");

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Nombre del Alumno: ");
            capturaNombre = s.next();
            pCalculoCalif.setNombre(capturaNombre);

            pCalculoCalif.setCalificaciones();            
            promedioResult = pCalculoCalif.promedioCal();
            califNota = pCalculoCalif.calificacion(promedioResult);
        }
        
    }
    
}
