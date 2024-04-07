import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         // vetor de 10 números
         double[] numeros = new double[10];
         
         // pede os números
         System.out.println("Digite 10 números reais:");
         for (int i = 0; i < 10; i++) {
             System.out.print("Número " + (i+1) + ": ");
             numeros[i] = scanner.nextDouble();
         }
         
         // mostra os números
         System.out.println("Os números na ordem inversa são:");
         for (int i = 9; i >= 0; i--) {
             System.out.println(numeros[i]);
         }
         
         scanner.close();
    }
}
