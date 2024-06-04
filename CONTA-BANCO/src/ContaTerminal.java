import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Precisei utilizar o try-with-resources para garantir que o scanner será fechado. 
        //Uma vez que da forma mostrada no vídeo, não estava dando certo. 
        //Tive que recorrer a ajuda externa
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Por favor, digite o nome do cliente! (Ex: Jálisson Feliciano Vieira da Silva)");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Por favor, digite o número da sua Agência! (Ex: 0067-1)");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da sua Conta! (Ex: 1234)");
            int numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Status: Depósito pendente! Por favor, realize um depósito para ativar a sua conta. Qual o valor será depositado?");
            Double saldo = scanner.nextDouble();

            System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
            agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque!");
            

        }
}
}
