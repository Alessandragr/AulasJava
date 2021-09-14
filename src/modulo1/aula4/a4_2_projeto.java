package modulo1.aula4;

import java.util.Scanner;

public class a4_2_projeto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("###### Cadastro ######");
        System.out.println("Olá, digite a sua idade: ");
        int idade = scan.nextInt();
        if (idade>=18) {
            System.out.println("Digite o seu nome: ");
            String nome = scan.next();
            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scan.next();
            System.out.printf("%s %s você possui %d anos e por isso seu cadastro foi realizado com sucesso!!", nome, sobrenome, idade);
        } else {
            int calculo = 18-idade;
            System.out.printf("Você não possui idade suficiente para realizar cadastro! Volte em %d anos!", calculo);
        }
    }
}
