import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite ddados sobre seu filme favorito e guarde conosco");
        System.out.println("Digite o nome do filme: ");
        String nomeDoFilme = leitura.nextLine();
        System.out.println("Digite a nota que você daria para o filme: ");
        double notaDoFilme = leitura.nextDouble();
        System.out.println("Digite o ano de lançamento do filme: ");
        int anoDeLancamento = leitura.nextInt();

        System.out.printf("""
                
                o nome do seu filme escolhido é: %s 
                
                a nota que você deu para o filme é: %.2f
                
                o ano de lançamento foi em: %d
                
                """, nomeDoFilme, notaDoFilme, anoDeLancamento);
    }
}
