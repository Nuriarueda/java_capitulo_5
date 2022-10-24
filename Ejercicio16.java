public class Ejercicio16 {
    public static void main (String [] args) {
        System.out.println("Este programa te dice si un numero es primo o no");
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());

        boolean primo = true;
        for (int i=2; i<numero; i++) {
            if ((numero % i) == 0) {
                primo = false;
            }
        }
        if (primo) {
            System.out.print ("El número introducido es primo");
        } else { 
            System.out.print ("El número introducido no es primo");
        }

    }
}