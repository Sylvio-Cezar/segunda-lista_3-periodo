import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma data qualquer no formato dd/MM/yyyy:");
        String date = scan.next();

        String month = getMonths(date);
        String day = getDays(date);

        if (Pattern.matches("\\d{2}/\\d{2}/\\d{4}", date) && Integer.parseInt(date.substring(3,5)) <= 12
                && Integer.parseInt(date.substring(0, 2)) <= 31) {
            System.out.println(day + " de " + month + " de " + date.substring(6, 10));
        } else {
            System.out.println("A data " + date + " não está no formato correto.");
        }
    }

    private static String getMonths(String date) {
        int month = Integer.parseInt(date.substring(3,5));
        return switch (month) {
            case 1 -> "janeiro";
            case 2 -> "fevereiro";
            case 3 -> "março";
            case 4 -> "abril";
            case 5 -> "maio";
            case 6 -> "junho";
            case 7 -> "julho";
            case 8 -> "agosto";
            case 9 -> "setembro";
            case 10 -> "outubro";
            case 11 -> "novembro";
            case 12 -> "dezembro";
            default -> "";
        };
    }

    private static String getDays(String date) {
        int day = Integer.parseInt(date.substring(0, 2));
        return switch (day) {
            case 1 -> "Primeiro";
            case 2 -> "Dois";
            case 3 -> "Três";
            case 4 -> "Quatro";
            case 5 -> "Cinco";
            case 6 -> "Seis";
            case 7 -> "Sete";
            case 8 -> "Oito";
            case 9 -> "Nove";
            case 10 -> "Dez";
            case 11 -> "Onze";
            case 12 -> "Doze";
            case 13 -> "Treze";
            case 14 -> "Quatorze";
            case 15 -> "Quinze";
            case 16 -> "Dezesseis";
            case 17 -> "Dezessete";
            case 18 -> "Dezoito";
            case 19 -> "Dezenove";
            case 20 -> "Vinte";
            case 21 -> "Vinte e um";
            case 22 -> "Vinte e dois";
            case 23 -> "Vinte e três";
            case 24 -> "Vinte e quatro";
            case 25 -> "Vinte e cinco";
            case 26 -> "Vinte e seis";
            case 27 -> "Vinte e sete";
            case 28 -> "Vinte e oito";
            case 29 -> "Vinte e nove";
            case 30 -> "Trinta";
            case 31 -> "Trinta e um";
            default -> "";
        };
    }
}
