package calificaciones;
import java.util.Scanner;

public class Calificaciones {
    String nombre = "";
    int[] calif = new int[5];
    
    public float promedioCal(){
        float promedio = 0;
        int suma=0;

        for (int i=0; i<calif.length;i++){
            suma +=calif[i];
        }

        promedio = (suma/calif.length);
        System.out.println("Promedio final es: "+promedio);
        return promedio;

    }

    public char calificacion(float pPromedio){
        char nota=' ';

        if(pPromedio>90)
            nota = 'A';
        else if (pPromedio>80)
            nota = 'B';
        else if (pPromedio>70)
            nota = 'C';
        else if (pPromedio>60)
            nota = 'D';
        else if (pPromedio>50)
            nota = 'E';
        else nota = 'F';
        System.out.println("Calificacion: "+ nota);
        return nota;

    }
    
    public void setNombre(String pNombre){
        nombre=pNombre;
    }

    public void setCalificaciones(){
        try (Scanner s = new Scanner (System.in)) {
            System.out.print("Calificacion 1: ");
            calif[0]=s.nextInt();

            System.out.print("Calificacion 2: ");
            calif[1]=s.nextInt();

            System.out.print("Calificacion 3: ");
            calif[2]=s.nextInt();

            System.out.print("Calificacion 4: ");
            calif[3]=s.nextInt();

            System.out.print("Calificacion 5: ");
            calif[4]=s.nextInt();
        }
        
    }
}
