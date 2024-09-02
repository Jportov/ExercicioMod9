import java.util.Scanner;

public class ConversaoVariavel {
    public static void main(String[] args) {
        // Criando um scanner para leitura de dados do console
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor inteiro do console
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Convertendo o valor inteiro para o tipo Wrapper Integer
        Integer numeroWrapper = Integer.valueOf(numeroInteiro);

        // Imprimindo o valor original e o valor convertido
        System.out.println("Número inteiro (primitivo): " + numeroInteiro);
        System.out.println("Número convertido para Integer (Wrapper): " + numeroWrapper);

        // Fechando o scanner
        scanner.close();
    }
}


