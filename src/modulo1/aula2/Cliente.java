package modulo1.aula2;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t #### Cadastro de produtos ####");
        System.out.println("\tBem-vindo digite as informações do cliente: ");
        System.out.printf("\tDigite o nome do cliente: ");
        String nome = sc.next();
        System.out.printf("\tDigite a idade do cliente: ");
        short idade = sc.nextShort();
            System.out.printf("\t O produto cliente %5 de idade %d coi cadastrado com sucesso", nome, idade); //printf consegue imprimir uma string formatada
        }
    }
