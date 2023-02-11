import java.util.Scanner;

public class GPAGenerator {
    public static void main(String[] args) {
        System.out.println("How many courses you had this semester: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();

        double[] numberOfCourse = new double[response];
        double sum = 0;

        for (int i = 0; i < numberOfCourse.length ; i++) {
            System.out.println("Enter your average for the course " + (i+1) + ": ");
            numberOfCourse[i] = scanner.nextDouble();

        }

        for (int i = 0; i < numberOfCourse.length; i++) {
            sum = sum + numberOfCourse[i];
        }

        double average = sum/numberOfCourse.length;

        if (average > 90){
            System.out.println("You have A");
        } else if (90>= average && average > 80 ) {
            System.out.println("You have B");            
        } else if (80>= average && average > 70) {
            System.out.println("You have C");
        } else if (70 >= average && average > 60) {
            System.out.println("You have D");
        } else if (average < 60) {
            System.out.println("You have failed");
        } else {
            System.out.println("Please Try Again");
        }

//        System.out.println("Your average is " + average);


    }
}
