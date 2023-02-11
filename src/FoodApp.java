import java.util.Scanner;

public class FoodApp {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Hello welcome to the food app");
        System.out.println("please create a password: ");
        String password = scanner.next();
        System.out.println("Your password is: " + password);
        System.out.println();
        System.out.println("Please enter your password: ");
        String password2 = scanner.next();

        while (!password2.equals(password)) {
            System.out.println("This ia not the right password please try again");
            password2 = scanner.next();
        }
        System.out.println("Access granted");
        System.out.println();
        System.out.println("Are you hungry Yes or No? : ");

        String answer = scanner.next();

        if (answer.equals("yes")){
            System.out.println("Choose what you want to eat between: chips, fish or pizza");
            String answer1 = scanner.next();

            while (!answer1.equals("chips")&& !answer1.equals("fish") && !answer1.equals("pizza")) {
                System.out.println("Sorry we do not have this. What would you like between chips, fish and pizza");
                answer1 = scanner.next();
            }

            System.out.println("Do you want something to drink? :");
            String answer2 = scanner.next();

            while (!answer2.equals("yes") && !answer2.equals("no")){
                System.out.println("wrong option try again");
                answer2 = scanner.next();
            }
            if (answer2.equals("yes")){
                System.out.println("What would you like to drink coke or juice? :");
                String answer3 = scanner.next();

                while (!answer3.equals("coke") && !answer3.equals("juice")){
                    System.out.println("Sorry we don't have it, what will you like between coke and juice ");
                    answer3 = scanner.next();
                }
                System.out.println("Great you have ordered " + answer1 + " and " + answer3);
                System.out.println("please confirm your password");
                password = scanner.next();

                while (!password.equals(password2)) {
                    System.out.println("This ia not the right password please try again");
                    password = scanner.next();
                }
                System.out.println("Thank you your order is on it's way ");
            } else {
                System.out.println("Your have ordered " + answer1);

                System.out.println("Please confirm your password ");
                password = scanner.next();

                while (!password.equals(password2)) {
                    System.out.println("This is not the right password please try again");
                    password = scanner.next();
                }
            }
        } else {
            System.out.println("Alright have a good day");
        }
    }
}
