public class Ejercicio8 {
    public static void main (String [] args) {
        System.out.print ("Que numero quieres saber la tabla de multiplicar: ");
        int numero = Integer.parseInt(System.console().readLine());
        for ( int i = 0; i <= 10; i ++) {
            System.out.println (numero + " x " + i + " = " + numero*i);
        }
    }
}