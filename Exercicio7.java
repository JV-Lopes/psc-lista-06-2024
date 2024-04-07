import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         // vetor de 5 números inteiros
         int[] numeros = new int[5];
         
         // pede os números e armazena no vetor
         System.out.println("Digite 5 números inteiros:");
         for (int i = 0; i < 5; i++) {
             System.out.print("Número " + (i+1) + ": ");
             numeros[i] = scanner.nextInt();
         }
         
         // soma e multiplica os números
         int soma = 0;
         int multiplicacao = 1;
         for (int i = 0; i < 5; i++) {
             soma += numeros[i];
             multiplicacao *= numeros[i];
         }
         
         // mostra os números, a soma e a multiplicação
         System.out.println("\nNúmeros digitados:");
         for (int i = 0; i < 5; i++) {
             System.out.println("Número " + (i+1) + ": " + numeros[i]);
         }
         System.out.println("\nSoma: " + soma);
         System.out.println("Multiplicação: " + multiplicacao);
         
         scanner.close();
    }
}
