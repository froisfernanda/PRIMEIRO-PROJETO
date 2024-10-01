public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2010;
        boolean incluidoNoPlano = true;
        double notaFilme = 9.0;

        String tipoPlano = "plus";
        if (anoDeLancamento >= 2010) {
            System.out.println("Lancamento que os clientes estao curtindo!");
        } else {
            System.out.println("Filme de desenho infantil que vale a pena assistir!");
        }

        if (!incluidoNoPlano && !tipoPlano.equals("Plus")) {
            System.out.println("Deve pagar o Plus!");
        } else {
            System.out.println("Filme liberado com o plano incluindo!");
        }

    }

}
