import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite uma nota para o filme %d: ", i);
            nota += leitura.nextDouble();
        }
        double media = (nota /3);
        System.out.println(media);
    }
}
