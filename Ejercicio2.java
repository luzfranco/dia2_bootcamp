import java.util.Random;
/*Cargar un array de manera aleatoria con 100 números enteros del -30 al 30. Imprimirlo en
pantalla y computar cuál es el elemento que más veces se repite, y cuáles son los números
que no están presentes (si es que hay alguno).*/
public class Ejercicio2 {
    public static void main(String []args) {
        int[] nroAleatorios = new int[100];
        int[] totalRepeticion = new int[100];
        int usar[]= new int [61];
        int i, j, posicionRepetido = 0, masRepetido = -9999,nroComparar,indicador=0;
        Random aleatorio = new Random();

        //generar nros
        for (i = 0; i < 100; i++) {
            nroAleatorios[i] = aleatorio.nextInt(61) - 30;
            System.out.println(nroAleatorios[i]);
        }
        //cuanto se repite cada nro
        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                if (nroAleatorios[i] == nroAleatorios[j]) {
                    totalRepeticion[i] += 1;
                }
            }
        }
        //comparar que nro se repitio más veces
        for (i = 0; i < 100; i++) {
            if (totalRepeticion[i] > masRepetido) {
                posicionRepetido = i;
                masRepetido = totalRepeticion[posicionRepetido];
            }
        }
        if (masRepetido == 1) {
            System.out.println("Ningún elemento se repite");
        } else {
            System.out.println("El elemento que más veces se repite es " + nroAleatorios[posicionRepetido] + " un total de " + masRepetido + " veces");
        }
        //carga de todos los numeros en un array
        nroComparar=-30;
        for(i=0;i<61;i++){
            usar[i]=nroComparar;
            nroComparar++;
        }
        //comparacion de numeros no presentes
       /*System.out.println("Números que no están presentes");
        for(j=0;j<61;j++){
            i=0;
           do{
               if(usar[j]==nroAleatorios[i]){
                   indicador=1;
                   break;
               }else{
                   indicador=0;
               }
               i++;
           }while(i<100 && indicador!=1);
           if (indicador==0){
               System.out.println(usar[j]);
           }
        }*/
        System.out.println("Números que no están presentes:");
        for (i = 0; i < 61; i++) {
            indicador = 0;
            for (j = 0; j < 100; j++) {
                if (usar[i] == nroAleatorios[j]) {
                    indicador = 1;
                    break;
                }
            }
            if (indicador == 0) {
                System.out.println(usar[i]);
            }
        }

    }
}
