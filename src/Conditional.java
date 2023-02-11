import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        System.out.println("Do you want a car YES or NO");
        Scanner scanner = new Scanner(System.in);
        String ans1 = scanner.next();

        if (ans1.equals("yes")){
            System.out.println("what is your favourite colour between red-blue-yellow");
            String ans2 = scanner.next();

            if (ans2.equals("red")){
                System.out.println("We have it in stock would you like to see it YES or NO");
                String ans3 =scanner.next();

                if (ans3.equals("yes")){
                    System.out.println("Great! Let's Check the car");
                }
                else {
                    System.out.println("No worries we will check something else");
                }
            }
            else if (ans2.equals("blue")) {
                System.out.println("We can order it");
            }
            else {
                System.out.println("We don't have it in stock");
            }
        }
        else {
            System.out.println("No worries have a good day");
        }
    }
}
