import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("""   
                vamos iniciar o processo de criação de conta;
                Digite abaixo seus credenciais;
                """);
        System.out.println("Nome completo:");
        String nome = leitura.nextLine();
        System.out.println("""
                qual tipo deseja começar:
                poupança 1;
                corrente 2;
                """);

        int numeroEscolhido = leitura.nextInt();
        String conta;

        if (numeroEscolhido == 1) {
            conta = "poupança";
        } else {
            conta = "corrente";
        }

        System.out.println("""
                qual valor deseja transferir inicialmente para sua conta:
                """);
        double saldoDaConta = leitura.nextDouble();

        String infoConta = String.format("""
                *****************************
                                
                esses são os dados do cliente
                                
                nome do cliente:            %s;
                tipo da conta:              %s;
                saldo da conta:             %.2f;
                                
                *****************************
                """, nome, conta, saldoDaConta);

        System.out.println(infoConta);

        String menu = """
        Bem vindo! O que deseja fazer agora?
                                    
        1- consultar saldo
        2- receber dinheiro
        3- transferir valor
        4- mostrar meus dados
        5- finalizar sessão
        
        """;


    }
}

