package modulo1.aula2;

public class a2_1_tipointeiro {
    // Não aceita decimal, string com aspas duplas;
    //Aceita negativos, positivos numéricos, mais os códigos da tabela ASC;
    public static void main(String args[]) { // tem que ter um método para executar algo que é dado por public static

        int numero1 = 'A'; //Se colocar uma vogal entre aspas simples 'A' ou 'a' referente a tabela ASCII. Ele converte diretamente o caractere para um valor numérico baseado no código da tabela ASCII
        int menor_valor = Integer.MIN_VALUE;
        int maior_valor = Integer.MAX_VALUE;
        System.out.println(numero1); //ALT + numero converte em uma letra


    }
}
