package modulo1.aula4;

import java.sql.SQLOutput;

public class a4_1_estruturaDecisao {
    public static void main(String[] args) {
        /*O que for determinado como condicional vai ser executado ou não. Ele testa se é verdadeiro ou falso*/
        boolean verdade = true;
        boolean falso = false;
        //Como fazer conversão em Java - Teste:
//        boolean ve = 1;
//        boolean fa = 2;
//        boolean vdd = 5>0;
        //Não reconhece conversões diretas.
        // int sa = (int)10.0;
        if (verdade) { //Não compara inteiro ou outro tipo de variável com booleano. Só pode ser inserido uma expressão que retorna booleano.
            //Bloco de código.
            System.out.println("É verdade");
        } else { //Senão
            System.out.println("É falso");
        }
    }
}
/* if () {
} else if () {
} else {
}
 */