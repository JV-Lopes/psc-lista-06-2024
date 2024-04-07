import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // vetor de 5 números
        int[] numeros = new int[5];
        
        // pede os numeros
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // mostra os numeros
        System.out.println("Os números digitados foram:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
       
        scanner.close();
    }
}
