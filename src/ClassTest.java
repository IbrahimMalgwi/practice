import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the test");

        System.out.println("Question 1: what is 2+2 in letters");
        String answer1 = scanner.next();
        while (!answer1.equals("four")){
            System.out.println("You had the wrong answer try again, what is 2+2 in letters");
            answer1 = scanner.next();;
        }
        System.out.println("Great you have the right answer");

        System.out.println();

        System.out.println("Question 2: What is the capital of Nigeria");
        String answer2 = scanner.next();
        while (!answer2.equals("Abuja")){
            System.out.println("You had the wrong answer try again: what is the capital of Nigeria");
            answer2 = scanner.next();
        }
        System.out.println("Great you have the right answer");
        System.out.println();
        System.out.println("You have passed the test");
    }
}
