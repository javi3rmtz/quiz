import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = 0;
        int modulo = 0;
        scanner.nextInt(numero);
        
       

        if (esnumero(numero)) {
            System.out.println(" es un número perfecto." + numero);
        } else {
            System.out.println(" no es un número perfecto." + numero);
        }

         
    }
}