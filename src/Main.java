import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite aqui a palavra ou frase que deseja inverter:");
        String word = sc.nextLine();
        char[] letters = word.toCharArray();

        StringBuilder reversedWord = new StringBuilder();
        for (int i = letters.length - 1; i >= 0; i--) {
            reversedWord.append(letters[i]);
        }

        System.out.println(reversedWord.toString());
        sc.close();

    }
}
