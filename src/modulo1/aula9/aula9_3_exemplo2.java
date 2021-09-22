package modulo1.aula9;

public class aula9_3_exemplo2 {
    public static void main(String[] args) {
        //Chama o método imprimir_nome e passa dois argumentos tipo string.
        imprimir_nome("Alessandra", "Ribeiro");
        String nc = retorna_nome_completo("Alessandra", "Ribeiro");

    }

    static void imprimir_nome(String nome, String sobrenome) {
        System.out.printf("%s %s", nome, sobrenome);
    }

    static String retorna_nome_completo(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

}

