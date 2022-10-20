public class Ejercicio10 {
    public static void main ( String [] args){
        double notas = 0;
        double numintroducido = 0;
        double suma = 0;

        System.out.println("Introduca tus notas para realizar tu media:");
        System.out.println("Cuando hayas terminado introduce un numero negativo");

        notas = Integer.parseInt(System.console().readLine());
        while (numintroducido >= 0) {
            numintroducido = Double.parseDouble(System.console().readLine());
            notas++;
            suma +=numintroducido;
        }
        System.out.print ("La media de las notas que has introducido son: " + (suma - numintroducido)/(notas - 1));
        

    }
}