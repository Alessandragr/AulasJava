package modulo1.aula7;

public class a7_4_desafiofor {
    public static void main(String[] args) {
        for (int i = 2; i <= 150; i++) {
            if( ePrimo(i) )
                System.out.println(i + " é primo.");
        }
    }

    private static boolean ePrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }
}