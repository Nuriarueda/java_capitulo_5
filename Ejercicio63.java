import java.util.Scanner;
public class Ejercicio63 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int alturaP1 = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la altura de la segunda pirámide: ");
        int alturaP2 = Integer.parseInt(s.nextLine());
        int alturaMaxima = Math.max(alturaP1, alturaP2);
        int espaciosP1 = alturaP1 - 1;
        int espaciosP2 = alturaP2 - 1;
        int baseP1 = alturaP1 * 2 - 1;
        int baseP2 = alturaP2 * 2 - 1;
        int asteriscosP1 = 1;
        int asteriscosP2 = 1;
        for (int i = alturaMaxima; i > 0; i--) {
            if (i > alturaP1) {
                for (int j = 0; j <= baseP1; j++) {
                    System.out.print(" ");
                }
            } else {
            for (int j = 0; j < espaciosP1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscosP1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= espaciosP1; j++) {
                System.out.print(" ");
            }
            espaciosP1--;
            asteriscosP1 += 2;
        }
        if (i > alturaP2) {
            for (int j = 0; j < baseP2; j++) {
                System.out.print(" ");
            }
        } else {
            for (int j = 0; j < espaciosP2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < asteriscosP2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= espaciosP1; j++) {
                System.out.print(" ");
            }
            espaciosP2--;
            asteriscosP2 += 2;
        }
        System.out.println();
        s.close();
    }
}
}
