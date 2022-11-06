public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero: ");
        int numeroint = Integer.parseInt(System.console().readLine());
        int numero = numeroint;
        int volteado = 0;
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
        } 
        System.out.println("Si le damos la vuelta al " + numeroint + " obtenemos el " + volteado);
    }
}