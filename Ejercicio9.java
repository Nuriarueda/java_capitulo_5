public class Ejercicio9 {
    public static void main (String [] args) {
        int numdigitos = 1, n, numintroducido;

        System.out.print ("Introduzca un numero y le diremos cuantos digitos tiene: ");
        numintroducido = Integer.parseInt(System.console().readLine());

        n = numintroducido;
        while ( n > 10) {
            n/=10;
            numdigitos ++;
        }
        System.out.print ("Has introducido: " + numdigitos);
    }
}