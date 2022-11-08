import java.util.Scanner;
public class Ejercicio37 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número entero que quiera pasar a sistema de 'palotes'");
        int num = sc.nextInt();
        System.out.printf("El número %d en sistema de 'palotes' es: ", num);
        sc.close();
        long volteado = 0;
        while (num > 0) {
            volteado = (volteado * 10) + (num % 10);
            num /= 10;
        }
        for (int j=0; volteado>0; j++) {
            for (int i = 0; i<volteado%10; i++) {
                System.out.print("|");
            }
            volteado /= 10;
            if (volteado>0) {
                System.out.print(" - ");
            }
        }
    }
}
