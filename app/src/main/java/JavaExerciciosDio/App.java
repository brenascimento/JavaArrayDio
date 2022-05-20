package JavaExerciciosDio;

import java.io.InputStream;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Qual programa deseja testar?[1, 2, 3, 4, 5, 6]");
        Scanner mainScan = new Scanner(System.in);

        switch(mainScan.nextInt()){
            case 1:
                LoopNomes.main(args);
                break;
            case 2:
                LoopNotas.main(args);
                break;
            case 3:
                MaiorEMedia.main(args);
                break;
            case 4:
                ParImpar.main(args);
                break;
            case 5:
                Tabuada.main(args);
                break;
            case 6:
                Fatorial.main(args);
                break;
            default:
                System.out.println("Saindo...");
                mainScan.close();
        }
    }
}


class LoopNomes{
    public static void main(String[] args) {

        System.out.println("Bem vindo ao primeiro exercicio: loopNomes");
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        while(true){
            String nome;
            int idade;

            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("Idade: ");
            idade = scan.nextInt();

            System.out.println(mensagem(nome, idade));
            
            if(nome.equals("0") || idade == 0) break;
        }
        
        System.out.println("===================================");
        scan.close();
    }

    static String mensagem(String nome, int idade){
        
        return String.format("%s tem %s anos de idade", nome, idade);
    }

    
}

class LoopNotas{
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Bem vindo a aula 2: Notas dos alunos");
        postNotas(System.in);
        System.out.println("====================================");

    }

    public static void postNotas(InputStream s){
        Scanner scan = new Scanner(s);

        System.out.println("Nota do aluno: ");
        int nota = scan.nextInt();

        while(!verificaNota(nota)){
            System.err.println("As notas precisam estar entre 0 e 10");
            System.out.println("Nota do aluno: ");
            nota = scan.nextInt();
        }

        System.out.println("A nota do Aluno é: " + nota); 
        scan.close();
    }

    // criado para teste
    static boolean verificaNota(int nota){
        // evitando ifs
        return (nota > 0 || nota < 10);
    }
}

class MaiorEMedia{
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Bem vindo a aula 3: Máximo e Média");
        verificaMaiorMedia(System.in);
        System.out.println("====================================");
    }

    static void verificaMaiorMedia(InputStream in){
        System.out.println(" Verifica sem array list  ");


        Scanner scan = new Scanner(in);
        int valor;
        // inicialização para guardar o maior valor
        int maiorValor = 0;
        // variavel para guardar a soma dos números para média
        // média nesse contexto = soma dos valores / 5
        int totalForMedia = 0;
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um valor: ");
            valor = scan.nextInt();
            if(valor > maiorValor){
                maiorValor = valor;
            }
                
            totalForMedia += valor;
        }
        System.out.println("O valor máximo é: " + maiorValor);
        System.out.println("O valor médio é: " + totalForMedia/5);
        scan.close();
    }
}

class ParImpar{
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("Bem vindo a aula 4: Qts Par e Impar?");
        System.out.println("====================================");

        Scanner scan = new Scanner(System.in);
        int n;
        int quantidadePar = 0;
        int quantidadeImpar = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero ");
            n = scan.nextInt();
            if(n % 2 == 0) quantidadePar += 1;
            else quantidadeImpar += 1;
        }

        System.out.println("Quantidade de numeros pares: " + quantidadePar);
        System.out.println("Quantidade de numeros impares: " + quantidadeImpar);

        scan.close();
    }
}


