/*Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.*/
public class Ejercicio7 {
    public static void main(String []args){
        int i,nro;
        for(i=1;i<=100;i++){
            nro=i;
            if((nro%2==0)&&(nro%3==0)){
                System.out.println(nro);
            }
        }
    }
}
