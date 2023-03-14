import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma String de até 40 caracteres:");
        String phrase = scan.nextLine();

        if (phrase.equals("") || phrase.length() > 40) {
            System.out.println("String inválida!");
        } else {
            for (int i = phrase.length(); i < 40; i++) {
                phrase += "_";
            }
            System.out.println(phrase);
        }
    }

}
