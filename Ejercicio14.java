public class Ejercicio14 {
    public static void main (String [] args) {
        System.out.println ("Este programa te hace la potencia de un numero");
        System.out.print ("Introduce la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print ("Introduce la exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());

        double potencia = 1;
        if (exponente == 0) {
                potencia = 1;
        }
        
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        
        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }
            potencia = 1/potencia;
        }
        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}