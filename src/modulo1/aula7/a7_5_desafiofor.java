package modulo1.aula7;

public class a7_5_desafiofor {
    public static void main(String[] args) {
        float valor=5000, total=0;
        System.out.println("#### Rendimento ####");

        for (int i=1; i<=24; i++) {
            valor+=valor*0.02;
            System.out.printf("\nO valor do mês %d é: %.2f", i, valor);
        }
    }

}
