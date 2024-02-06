/*Dada una cadena de caracteres (String) de longitud desconocida que tiene solamente dígitos,
crear un array de N elementos (donde N es el tamaño de la cadena) que tenga cada uno de los
valores numéricos de los dígitos.*/
public class Ejercicio4 {
    public static void main(String[] args){
        String cadena="123456";
        int i;
        int longCadena=cadena.length();
        int [] arrayCadena= new int[longCadena];
        for(i=0;i<longCadena;i++){
            arrayCadena[i]=Character.getNumericValue(cadena.charAt(i));
        }
        System.out.println("Cadena: "+cadena);
        System.out.println("Array:");
        for (i=0;i<longCadena;i++){
            System.out.println(arrayCadena[i]);
        }
    }
}
