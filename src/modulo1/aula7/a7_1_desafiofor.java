package modulo1.aula7;

import java.util.Scanner;

public class a7_1_desafiofor {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome="", sobrenome="";
        int i=1;

        System.out.println("#### Armazena Nome ####");
        System.out.println("Informe seu nome: ");
        nome = scan.next();
        System.out.println("Informe seu sobrenome: ");
        sobrenome = scan.next();

        while (i<=10) {
            System.out.printf("\nSeu nome completo é: %s %s", nome, sobrenome);
            i++;
        }
    }

}
