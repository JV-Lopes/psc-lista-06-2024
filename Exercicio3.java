import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         // array de notas
         double[] notas = new double[4];
         
         // pede as notas e guarda
         System.out.println("Digite as 4 notas:");
         for (int i = 0; i < 4; i++) {
             System.out.print("Nota " + (i+1) + ": ");
             notas[i] = scanner.nextDouble();
         }
         
         // mostra as notas
         System.out.println("\nNotas digitadas:");
         for (int i = 0; i < 4; i++) {
             System.out.println("Nota " + (i+1) + ": " + notas[i]);
         }
         
         // calcula a média
         double soma = 0;
         for (double nota : notas) {
             soma += nota;
         }
         double media = soma / 4;
         
         // mostra a média
         System.out.println("\nMédia: " + media);
         
         scanner.close();
    }
}
