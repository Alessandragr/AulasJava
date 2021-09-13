package modulo1.aula3;

import java.util.Scanner;

public class Projeto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\t #### Auto Cadastro #### ");
        System.out.println("\t Bem-vindo(a) digite as informações do produto: ");
        System.out.println("\tDigite o nome do produto: ");
        String nome = scan.nextLine();
        System.out.println("\tDigite a descrição do produto: ");
        String descricao = scan.nextLine();
        System.out.println("\tDigite a categoria do produto: ");
        String categoria = scan.nextLine();
        System.out.println("\tDigite o valor do produto: ");
        double valor = scan.nextDouble();

        System.out.printf("\tO produto foi cadastrado com sucesso!");
    }
}
