public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println("Introduce numeros");
        System.out.println("terminara cuando el la suma sea mayor que 1000 o 0");
        int numIntroducido;
        int suma = 0;
        int numDeElementos = 0;
        do {
            numIntroducido = Integer.parseInt(System.console().readLine());
            suma += numIntroducido;
            numDeElementos++;
        } while (suma <= 10000);
        System.out.println("Ha introducido un total de " + numDeElementos + " números.");
        System.out.println("La suma total es " + suma + ".");
        System.out.println("La media es " + suma / numDeElementos + ".");
    }
}
