import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase qualquer:");
        String phrase = scan.nextLine();
        String vowelPhrase = "";

        for(int i = 0; i < phrase.length(); i++) {
            if(phrase.charAt(i) == 'a'|| phrase.charAt(i) == 'e'||  phrase.charAt(i) == 'i'
                    || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u') {
                vowelPhrase += String.valueOf(phrase.charAt(i)).toUpperCase();
            } else {
                vowelPhrase += phrase.charAt(i);
            }
        }

        System.out.println(vowelPhrase);
    }

}
