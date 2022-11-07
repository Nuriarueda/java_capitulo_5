import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura del árbol: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        int espaciosPorDelante = alturaIntroducida - 3;
        int espaciosInternos = 0;
        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        int altura = 2;
        while (altura < alturaIntroducida - 1) {
            for (int i = 1; i <= espaciosPorDelante; i++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int i = 1; i < espaciosInternos; i++) {
                System.out.print(" ");
            }
            if (altura > 2) {
                System.out.print("#");
            }
            System.out.println();
            altura++;
            espaciosPorDelante--;
            espaciosInternos += 2;
        } 
        for (int i = 1; i < altura * 2 - 2; i++) {
            System.out.print("#");
        }
        System.out.println();
        espaciosPorDelante = alturaIntroducida - 3;
        for (int i = 1; i <= espaciosPorDelante; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
        s.close();
    }
}