package JavaExerciciosDio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // usando função recursiva

        System.out.println("====================================");
        System.out.println("Bem vindo a exercicio 6: Fatorial");
        System.out.println("====================================");
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite um número fatorial: ");
        int n = scan.nextInt();
        System.out.print(String.format("Resultado do fatorial !%s: ", n));
        fatorial(n);
        scan.close();
    }

    // usando função recursiva
    static void fatorial(int n){
        
    }
}
