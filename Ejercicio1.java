import java.util.Random;

/*Cargar un array de manera aleatoria con 10 números enteros del -5 al 5.
Imprimirlo en pantalla y computar cuál es el mayor elemento del vector.*/
public class Ejercicio1 {
    public static void main(String []args){
        int [] nroAleatorios= new int[10];
        int i,mayorPosicion=0,maximo=-9999;
        Random aleatorio = new Random();
        for(i=0;i<10;i++){
            nroAleatorios[i]=aleatorio.nextInt(11)-5;
            System.out.println(nroAleatorios[i]);
        }
        for(i=0;i<10;i++){
                if(nroAleatorios[i]>maximo){
                    mayorPosicion=i;
                    maximo=nroAleatorios[mayorPosicion];
                }
        }
        System.out.println("El mayor elemento del vector es "+nroAleatorios[mayorPosicion]+" y se encuentra en la posicion "+(mayorPosicion+1));
    }
}
