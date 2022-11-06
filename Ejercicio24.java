public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.println("este programa hace una piramide con numeros");
        System.out.print("Introduce la altura de la pirámide:");
        int alturaint = Integer.parseInt(System.console().readLine());
        int altura = 1;
        int i = 0;
        int espacios = alturaint - 1;
        while (altura <= alturaint) {
            for (i = 1; i <= espacios; i++) {
                System.out.print(" ");
                }
            for (i = 1; i < altura; i++) {
                System.out.print(i);
            }
            for (i = altura; i > 0; i--) {
                System.out.print(i);
            }
            System.out.println();
            altura++;
            espacios--;
        }             
    }
}
    
