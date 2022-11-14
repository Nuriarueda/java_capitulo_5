import java.util.Scanner;
public class Ejercicio69 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide maya: ");
        int alturaIntroducida = Integer.parseInt(s.nextLine());
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = alturaIntroducida - 1;
        
        while (planta <= alturaIntroducida) {
            for (int i = 1; i <= espacios; i++) {
                System.out.print(' ');
            }
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }
            System.out.print(planta % 2 == 1 ? "****" : " ");
            for (int i = 0; i <= longitudDeLinea / 2; i++) {
                System.out.print('*');
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
        s.close();
    }
}