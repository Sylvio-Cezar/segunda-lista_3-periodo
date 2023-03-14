import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um CPF: ");
        String cpf = scan.nextLine();

        cpf = cpf.replaceAll("\\D", ""); // Remove todos os caracteres não numéricos

        if (cpf.length() != 11) {
            System.out.println("CPF inválido!");
        } else {
            int[] numbers = new int[11];
            for (int i = 0; i < 11; i++) {
                numbers[i] = Integer.parseInt(cpf.substring(i, i + 1));
            }

            // Verifica o primeiro dígito verificador
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += numbers[i] * (10 - i);
            }
            int rest = sum % 11;
            int digit1 = rest < 2 ? 0 : 11 - rest;

            // Verifica o segundo dígito verificador
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += numbers[i] * (11 - i);
            }
            rest = sum % 11;
            int digit2 = rest < 2 ? 0 : 11 - rest;

            // Verifica se os dígitos verificadores são válidos
            if (numbers[9] == digit1 && numbers[10] == digit2) {
                System.out.println("CPF válido!");
            } else {
                System.out.println("CPF inválido!");
            }
        }
    }
}
