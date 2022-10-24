public class Ejercicio15 {
    public static void main (String[] args) {
        System.out.print("Introduce un numero par la base (tiene que ser un numero real): ");
        int base = Integer.parseInt (System.console().readLine());
        System.out.print ("Introduce el exponente (tiene que ser un numero entero): ");
        int exponente1 = Integer.parseInt (System.console().readLine());

        double potencia;
        int exponente2;

        for (int i = 1; i <= exponente1; i++) {
            potencia = 1;
            exponente2 = i;
            for (int j = 0; j < exponente2; j++) {
                potencia *= base;
            }
            System.out.println(base + "^" + i + " = " + potencia);
        }
    }
}