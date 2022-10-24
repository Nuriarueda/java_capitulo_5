public class Ejercicio12 {
    public static void main (String [] args) {
        System.out.println("Este prgrama te mostrara la serie de Fibonacci a partir del numero introducido");
        System.out.print("Por favor introduce un numero: ");
        int a = Integer.parseInt(System.console().readLine());
        switch (a) {
            case 1:
                System.out.print("0");
                break;
            case 2:
                System.out.print("0 1");
                break;
            default:
                System.out.print("0 1");
                int f1 = 0;
                int f2 = 1;
                int aux;
                while(a > 2) {
                    aux = f1;
                    f1 = f2;
                    f2 = aux + f2;
                    System.out.print(" " + f2);
                    a--;
                }
        }
        System.out.println();    
    }
}