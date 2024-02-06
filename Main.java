//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*Declara dos variables numéricas (con el valor que desees), muestra por consola la
suma, resta, multiplicación, división y módulo (resto de la división).
*/
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       int nroUno=12;
       int nroDos=2;
       int resta, suma, multi, div, mod;
       resta=nroUno-nroDos;
       suma=nroUno+nroDos;
       multi=nroUno*nroDos;
       div=nroUno/nroDos;
       mod=nroUno%nroDos;
        System.out.println("El primer numero es: " + nroUno);
        System.out.println("El segundo numero es: " + nroDos);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicación: "+multi);
        System.out.println("Division: "+ div);
        System.out.println("Resto: "+mod);
    }
}