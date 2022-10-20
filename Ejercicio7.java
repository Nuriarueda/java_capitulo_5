public class Ejercicio7 {
    public static void main (String[] args) {
        int intentos = 4;
        int numerointroducido;
        boolean acertado = false;

        do {
            System.out.print ("Introduzca la contraseña de la caja fuerte: ");
            numerointroducido = Integer.parseInt(System.console().readLine());

            if (numerointroducido == 1234) {
                acertado = true;
            } else { 
                System.out.println ("Contraseña incorrecta");
            }
            intentos --;

        } while ((intentos > 0) && (!acertado));
        if (acertado) {
            System.out.print ("Caja fuerte abierta con exito");
        } else {
            System.out.print ("Lo siento, ya no tienes mas intentos");
        }
    }
}