package JavaExerciciosDio;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Bem vindo a exercicio 5: Gerador de Tabuada");
        System.out.println("====================================");


        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número entre 0 e 10: ");
        int numero = scan.nextInt();
        while(numero < 1 || numero > 10){
            System.err.println("Numeros entre 0 a 10!! ");
            numero = scan.nextInt();
        }

        System.out.println("Tabuada do número " + numero);
        for(int i = 1; i <= 10; i++){
            System.out.println( String.format("%s X %s = %s", 
                numero, i, numero*i)
            );
        }

        scan.close();
    }
}
