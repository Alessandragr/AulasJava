package modulo1.aula7;

import java.util.Scanner;

public class a7_2_desafiofor {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome="", sobrenome="";

        System.out.println("#### Armazena Nome ####");
        System.out.println("Informe seu nome: ");
        nome = scan.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = scan.next();

        for (int i=1; i <=10; i++) {
            System.out.printf("\nSeu nome completo é: %s %s", nome, sobrenome);
        }
    }
}
