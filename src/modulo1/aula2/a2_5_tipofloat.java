package modulo1.aula2;

public class a2_5_tipofloat {
    // Para trabalhar com casas decimais. Com a metade de bits do double. Tudo o que eu armazenar num float cabe no double
    public static void main(String[] args) {
        float menor_valor = Float.MIN_VALUE; // 1.4E-45
        float maior_valor = Float.MAX_VALUE; // 3.4028235E38
        System.out.println(menor_valor);
        System.out.println(maior_valor);
        float salario = 800.00f; // precisa a colocar o f no final para identificar o float
        System.out.println(salario);
        /*float massa = 5.972E24f;
        System.out.printf(massa);
    }*/
    }
}
