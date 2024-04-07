import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];

        int[] par = new int[20]; // máximo 20 pares
        int[] impar = new int[20]; // máximo 20 ímpares

        // índices para acompanhar a posição atual nos vetores par e ímpar
        int indicePar = 0;
        int indiceImpar = 0;

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                par[indicePar] = numeros[i];
                indicePar++;
            } else {
                impar[indiceImpar] = numeros[i];
                indiceImpar++;
            }
        }

        System.out.println("\nNúmeros inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros pares:");
        for (int i = 0; i < indicePar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        scanner.close();
    }
}
