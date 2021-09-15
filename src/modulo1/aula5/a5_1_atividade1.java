package modulo1.aula5;

import java.util.Scanner;

public class a5_1_atividade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("###### Bem-vindo(a) ao (On)Registre! ######");
        System.out.println("\tPara cadastro de clientes digite 1");
        System.out.println("\tPara listar clientes cadastrados digite 2");
        System.out.println("\tPara sair do programa digite 0");
        System.out.println("Insira o código: ");

        int codigo = scan.nextInt();
        short cliente=0;
        String nome="", sobrenome="", rg="", cpf="";

        while (codigo!=1 && codigo!=2 && codigo!=0) {
            System.out.println("Digite um código válido!");
            codigo = scan.nextInt();
        }
        switch (codigo) {
            case 0:
                break;
            case 1:
                System.out.println("Digite o seu nome: ");
                nome = scan.next();
                    while(nome.length()>3) {
                        System.out.println("Quantidade de caracteres inválidos! Digite novamente o seu nome: ");
                        nome = scan.next();
                }
                System.out.println("Digite o seu sobrenome: ");
                 sobrenome = scan.next();
                    while(sobrenome.length()>3) {
                    System.out.println("Quantidade de caracteres inválidos! Digite novamente o seu sobrenome: ");
                    sobrenome = scan.next();
                }
                System.out.println("Digite o seu RG: ");
                rg = scan.next();
                    while (rg.length()<4) {
                    System.out.println("Quantidade de caracteres inválidos! Digite novamente o seu RG: ");
                    rg = scan.next();
                }
                System.out.println("Digite o seu CPF: ");
                cpf = scan.next();
                    while (cpf.length()!=11) {
                    System.out.println("Quantidade de caracteres inválidos! Digite novamente o seu CPF: ");
                    cpf = scan.next();
                }
                System.out.println("Os dados foram cadastrados com sucesso!");
                    cliente++;
                    break;

            case 2:
                if (cliente==0) {
                System.out.println("Não existem clientes cadastrados!");
            } else{
                System.out.println("Lista de clientes cadastrada:  ");
                System.out.printf("Nome: %s \nSobrenome: %s \nRG: %s \nCPF: %s", nome, sobrenome, rg, cpf);
            }
                    break;

        }

    }
}
