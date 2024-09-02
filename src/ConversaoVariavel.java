import java.util.Scanner;

public class ConversaoVariavel {
    public static void main(String[] args) {
        // Criando um scanner para leitura de dados do console
        Scanner scanner = new Scanner(System.in);

        // Lendo um valor inteiro do console
        System.out.print("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();

        // Convertendo o valor inteiro para double
        double numeroConvertido = (double) numeroInteiro;

        // Imprimindo o valor original e o valor convertido
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número convertido para double: " + numeroConvertido);

        // Fechando o scanner
        scanner.close();
    }
}
