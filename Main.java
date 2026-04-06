import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int randomNumber = (int) (Math.random() * 100);
        int guessedNumber = 0;

        do {
            System.out.println("Enter the number you have guessed : ");
            guessedNumber = sc.nextInt();

            if (guessedNumber == randomNumber) {
                System.out.println("Correct! You have guessed the right number!");
            } else if (guessedNumber > randomNumber) {
                System.out.println("Incorrect! The number you have guessed is larger than the random number!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Incorrect! The number you have guessed is smaller than the random number!");
            } else {
                System.out.println("Invalid!");
            }
        } while (guessedNumber != randomNumber);

        System.out.println("The random number was : " + randomNumber);
    }
}