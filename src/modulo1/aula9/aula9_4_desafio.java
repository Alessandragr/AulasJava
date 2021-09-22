package modulo1.aula9;

import java.util.Scanner;

public class aula9_4_desafio {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        titulo();
        opcoes();
    }

    ///Título do programa:

    static void titulo() {
        System.out.println("###### Calculator ######");
    }
    //Leitura dos dados:

    static double leitura (String mensagem) {
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
    }
    //Mensagem de erro:

    static void erro() {
        System.out.println("Opção inválida, insira uma nova opção entre 0 e 4: ");
    }
    //Opções de cálculo:

    static void opcoes(){
        double n1=0, n2=0, calculo=0;

        double opcao = leitura("Informe uma opção: \n 1 - para soma; \n 2 - para subtração; \n 3 - para multiplicação; \n 4 - para divisão; \n");
        do {
            erro();
            opcao = leitura("Informe uma opção: \n 1 - para soma; \n 2 - para subtração; \n 3 - para multiplicação; \n 4 - para divisão; \n");
        } while (opcao <1 && opcao >4);

        n1 = leitura("\nInforme o primeiro número: ");
        n2 = leitura("\nInforme o segundo número: ");

        if (opcao==1) {
            calculo = soma(n1,n2);
        }
        else if (opcao==2) {
            calculo = subtracao(n1,n2);
        }
        else if (opcao==3) {
            calculo = multiplicacao(n1,n2);
        }
        else if (opcao==4) {
            calculo = divisao(n1,n2);
        }

        System.out.printf("O resultado é: %.2f", calculo);
    }

    //Operações matemáticas
    static double soma(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    static double subtracao(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    static double multiplicacao(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    static double divisao(double num1, double num2){
        double result = num1/num2;
        return result;
    }
}
