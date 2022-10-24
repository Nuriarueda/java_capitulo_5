public class Ejercicio17 {
    public static void main (String [] args) {
        int numero = 0;
        
        do {
            System.out.print("Introduce un número entero que sea positivo: ");
            numero = Integer.parseInt(System.console().readLine());
            if(numero < 0) {
                System.out.println("El número introducido no es correcto, debe introducir un número positivo.");
            }
        } while (numero < 0);
        int suma = 0;
        for(int i = numero; i < numero + 100; i++) {
            suma += i;
        }
        System.out.println("La suma de los 100 números siguientes a " + numero + " es " + suma);
            
    }
}