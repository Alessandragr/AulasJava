package modulo1.aula4;

import java.util.Scanner;

public class a4_4_1_projetoSwitchCaseWhile {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("###### Cadastro de Filmes, Séries e Documentários");
            System.out.println("\tPara filmes digite 1");
            System.out.println("\tPara séries digite 2");
            System.out.println("\tPara documentários digite 3");
            System.out.println("\tPara sair digite 0");
            System.out.println("\tInsira o código: ");

            int opcao = scan.nextInt();

            while (opcao != 1 && opcao != 2 && opcao != 3) {

                System.out.println("Código inválido! Insira um código válido: ");
                opcao = scan.nextInt();
            }
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite o nome do filme: ");
                    String nome = scan.next();
                    System.out.println("Digite o gênero do filme: ");
                    String genero = scan.next();
                    System.out.println("Digite a descrição do filme: ");
                    String descricao = scan.next();
                    System.out.println("Digite o ano de lançamento do filme: ");
                    int ano = scan.nextInt();
                    System.out.printf("O filme %s foi cadastrado com sucesso!", nome);
                    break;
                case 2:
                    System.out.println("Digite o nome da série: ");
                    String nome2 = scan.next();
                    System.out.println("Digite a produtora da série: ");
                    String produtora = scan.next();
                    System.out.println("Digite o ano de lançamento da série: ");
                    int ano2 = scan.nextInt();
                    System.out.printf("A série %s foi cadastrada com sucesso!", nome2);
                    break;
                case 3:
                    System.out.println("Digite o nome do documentário: ");
                    String nome3 = scan.next();
                    System.out.println("Digite o tema do documentário: ");
                    String tema = scan.next();
                    System.out.println("Digite o ano de lançamento do documentário: ");
                    int ano3 = scan.nextInt();
                    System.out.printf("O documentário %s foi cadastrado com sucesso!", nome3);
                    break;
            }

        }
    }

