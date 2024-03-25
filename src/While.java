import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int contador = 0;
        while (nota != -1){
            System.out.printf("Digite uma nota para o filme %d ou digite '-1' para encerrar: ",contador);
            nota = leitura.nextDouble();
            if (nota != -1){
                media += nota;
                contador++;
            }
        }

        if (nota != -1 ) {
            media = (media /contador);
            System.out.println(media);
        }else{
            return;
        }


    }
}

