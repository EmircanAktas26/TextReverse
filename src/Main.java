import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the text to be written in reverse :");
        original = inp.nextLine();
        int length = original.length();

        for (int i = length - 1; i >=0; i--){
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Original text :" + original + "\n" +
        "Reverse text :" + reverse);

    }
}