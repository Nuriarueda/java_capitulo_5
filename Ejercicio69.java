import java.util.Scanner;
public class Ejercicio69 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide maya: ");
        int tam = sc.nextInt();


        for (int i=1; i<=tam; i++) {
            for (int j=1; j<=tam-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=3; j++) {
                if (j == 1 || j == 3) {
                    for (int k=1; k<=i; k++) { 
                        System.out.print("*");
                    }
                } else  {
                    if (i%2==0) { 
                        System.out.print("    ");
                    } else {
                        System.out.print("****");
                    }
                }
            }
            System.out.println("");
        }
        sc.close();
    }
}