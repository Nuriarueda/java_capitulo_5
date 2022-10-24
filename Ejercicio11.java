public class Ejercicio11 {
    public static void main (String [] args) {
        System.out.print ("Introduce el numero del que quieras saber e cuadrado y el cubo: ");
        int numintroducido = Integer.parseInt(System.console().readLine());

        for (int i = numintroducido; i < numintroducido + 5; i++ ) {
            System.out.printf ("%4d %6d %8d\n", i, i * i, i * i * i);
        }
    }
}