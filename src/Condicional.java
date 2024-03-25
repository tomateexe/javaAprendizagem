public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = false;
        String tipoDePlano = "plus";
        double notaDoFilme = 8.1;
        int anosDeDiferenca = 2022 - anoDeLancamento;

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        }else if (anoDeLancamento < 2022) {
            System.out.println(String.format("Este é um lançamento antigo, de %d ano(s) atrás", anosDeDiferenca));
        }

        if (incluidoNoPlano && tipoDePlano.equals("plus")) {
            System.out.println("Você faz parte do plano premium");
        } else {
            System.out.println("Você não pode assistir! Compre a assinatura premium para poder assistir");
        }
    }
}