package GeradorDeSenha;
import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Importa o Scanner
        System.out.print("Digite a quantidade de caracteres da senha: "); // Pede ao usuário para dizer a quantidade de caracteres da senha
        int senhaLenght = scanner.nextInt(); // Armazena o valor do usuário
        String key = generateRandomKey(senhaLenght); // Retorna o SenhaLenght do método generateRandomKey
        System.out.print("Senha Gerada: " + key); // Exibe a senha gerada na tela
    }

    private static String generateRandomKey(int senhaLenght) {
        String caracteresSenha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz01234567890!@#%$*(){}[]|:;<>,/~^+-"; // Carateres da senha
        SecureRandom random = new SecureRandom(); // Importa o SecureRandom
        StringBuilder sb = new StringBuilder(); // Importa o StringBuilder

        // Laço de Repetição enquanto não chegar na quantidade de caracteres desejadas
        for(int i = 0; i < senhaLenght; i++){
            int index = random.nextInt(caracteresSenha.length()); // Gera a senha
            sb.append(caracteresSenha.charAt(index)); // Adiciona os caracteres a variável index
        }
        return sb.toString(); // Retorna a senha
    }
}
