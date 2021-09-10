package modulo1.aula1;

import java.util.Scanner;

public class a1_console {

    public static void main (String args[]) { //armazena o método para executar para a gente
        System.out.println("Olá"); //print ln quebra a linha
        System.out.print("Olá mundo!"); //print sem o ln não quebra a linha
        Scanner scanner = new Scanner(System.in);

        //String nome = scanner.next(); vai ler a próxima entrada do terminal
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("O nome e sobrenome digitado foi: " + nome + " " + sobrenome);
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
    }
}
