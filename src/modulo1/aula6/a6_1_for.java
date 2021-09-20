package modulo1.aula6;

import java.util.Scanner;

public class a6_1_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" #### Cadastro ####");


        for(int cont =0; cont <4; cont++) {
            System.out.println("\nInsira seu nome: ");
            String nome = scan.nextLine();
            System.out.println("Insira seu sobrenome: ");
            String sobrenome = scan.nextLine();
            System.out.printf("Foi cadastrado o nome: %s e o sobrenome: %s \t", nome, sobrenome);
        }

    }
}
