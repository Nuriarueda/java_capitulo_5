public class Ejercicio45 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca la posición dentro del número: ");
        long posicion = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca el nuevo dígito: ");
        long digito = Long.parseLong(System.console().readLine());
        long numero = numeroIntroducido;
        int longitud = 0;
        do {
            numero /= 10;
            longitud++;
        } while (numero > 0);
        long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
        parteIzquierda = parteIzquierda * 10 + digito;
        long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion));
        numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion)) + parteDerecha;
        System.out.print("El número resultante es " + numero);
    }
}