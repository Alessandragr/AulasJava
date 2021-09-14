package modulo1.aula2;

public class a2_2_tipobyte { // a classe é um esqueleto a qual não executa nada
    // o método executa algo. É uma função dentro da classe
    // Um procedimento executa algo e não tem retorno já uma função tem retorno.
    // Quando tem uma função e um procedimento dentro de uma classe ambos são métodos.
    // Vai de -128 a 127
    //Declarando funções
    public static void main(String args[]) {
        // Método, nome, argumentos
        //Encapsulamento de dados: public é acessível fora da classe. Private é para ser executado dentro da classe, só métodos dela, só ela mesma tenha o controle.
        //Tudo que está estatic já está carregado dentro da memória para uso.
        // Por defaut o método da classe é privado.
    }
    void execute() {
        // ela pode executar uma linha ou várias
        // void executa no terminal e não retorna nada. Qualquer coisa diferente de void tem que ter um return e retornar esse dado.
        int retorno = soma();
        // Quando tem um void não consegue retornar o executa e salvar em uma variável;
    }
    int soma () {
        // é um método e retorna um inteiro. Qualquer coisa diferente de void tem que ter um return e retornar esse dado.
        return 10;
        // Retornar por métodos cada método tem a sua responsabilidade. Porque se um método faz várias coisas se der um erro não vai ser fácil encontrar
    }


} // em uma classe só tem um método com o mesmo nome.
    // O return o método executa algo e retorna o valor e pode ser salvo o valor; O print pega o resultado e joga diretamente no...
    // public static void main(String args[]) pode ser adicionado em cima ou em embaixo.
/*
    public static void main(String args[]) {
        System.out.println(soma(10,15));
        private static int soma(int n1, int n2) {
            int resultado = n1 + n2;
            return resultado;
        }
    }

    // ---------------------------------------------------------------
    public static void main()*/
