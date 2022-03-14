package excecoes;

public class PraticaExcecoes {
    public static void main(String[] args) {


         int a = 0;
         int b = 300;

        try {
            double razao = b / a;
            System.out.println("a razão é de " + razao);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
}
