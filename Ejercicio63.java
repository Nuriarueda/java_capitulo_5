import java.util.Scanner;

public class Ejercicio63 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la altura de la primera pirámide: ");
    int height1 = sc.nextInt();

    System.out.print("Introduzca la altura de la segunda pirámide: ");
    int height2 = sc.nextInt();

    int maxheight = Math.max(height1, height2);
    int space1 = height1 - 1;
    int space2 = height2 - 1;
    int base1 = height1 * 2 - 1;
    int base2 = height2 * 2 - 1;
    int write1 = 1;
    int write2 = 1;

    for (int i = maxheight; i > 0; i--) {
      
      if (i > height1) {
        for (int j = 0; j <= base1; j++) {
          System.out.print(" ");
        }
      } else {
        for (int j = 0; j < space1; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j < write1; j++) {
          System.out.print("*");
        }

        for (int j = 0; j <= space1; j++) {
          System.out.print(" ");
        }

        space1--;
        write1 += 2;
      }
      
      if (i > height2) {
        for (int j = 0; j < base2; j++) {
          System.out.print(" ");
        }
      } else {

        for (int j = 0; j < space2; j++) {
          System.out.print(" ");
        }

        for (int j = 0; j < write2; j++) {
          System.out.print("*");
        }

        for (int j = 0; j <= space2; j++) {
          System.out.print(" ");
        }

        space2--;
        write2 += 2;
      }
      System.out.println();
    }
    sc.close();
  }    
}