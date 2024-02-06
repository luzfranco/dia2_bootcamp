import java.util.Scanner;

/*Hacer una función que, dada una palabra (String) o frase, diga si la misma es palíndrome o
no. Una palabra/frase palíndrome es aquella que se lee igual tanto de atrás para adelante,
como de adelante para atrás. Ejemplos de palíndromes: "MADAM", "RACECAR", "AMORE,
ROMA", "BORROW OR ROB", "WAS IT A CAR OR A CAT I SAW?".*/
public class Ejercicio3 {
    public static void main(String []args){
        Scanner entrada= new Scanner(System.in);
        String respuesta;
        System.out.println("Ingrese una palabra o frase: ");
        respuesta=entrada.nextLine();
        palindroma(respuesta);
    }
    private static void palindroma(String  palabra){
        int longPalabra,i;
        longPalabra=palabra.length();
        for(i=0;i<longPalabra/2;i++){
            if (palabra.charAt(i) != palabra.charAt(longPalabra - i - 1)) {
                System.out.println( "La palabra"+ palabra  +" no es palindroma");
                System.exit(0);
            }
        }
        System.out.println("La palabra "+ palabra  +" es palindroma");
    }



}
