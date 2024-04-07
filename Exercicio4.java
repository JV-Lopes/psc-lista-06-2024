import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        
                char[] caracteres = new char[10];
                
                int consoantes = 0;
                
                System.out.println("Digite 10 caracteres:");
                for (int i = 0; i < 10; i++) {
                    System.out.print("Caractere " + (i+1) + ": ");
                    caracteres[i] = scanner.next().charAt(0);
                    
                    if (Character.isLetter(caracteres[i]) && !isVogal(caracteres[i])) {
                        consoantes++;
                    }
                }
                
                System.out.println("\nConsoantes:");
                for (int i = 0; i < 10; i++) {
                    if (Character.isLetter(caracteres[i]) && !isVogal(caracteres[i])) {
                        System.out.println(caracteres[i]);
                    }
                }
                
                System.out.println("\nTotal de consoantes: " + consoantes);
                
                scanner.close();
            }
            
            // verifica se o caractere é uma vogal
            public static boolean isVogal(char c) {
                char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
                for (char vogal : vogais) {
                    if (c == vogal) {
                        return true;
                    }
                }
                return false;
        
    }
}
