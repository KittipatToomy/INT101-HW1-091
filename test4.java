import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        System.out.println("1 Student = 500 Baht per hour.\n2 Student = 450 Baht per hour.\n3 Student = 400 Baht per hour.\n4 Student = 350 Baht per hour.\n5 or more student = 300 Baht per hour.");
        Scanner sn = new Scanner(System.in);
            System.out.println("Enter numer of student: ");
            int numberStudent = sn.nextInt();
            if (numberStudent < 1) {
                System.out.println("Error please try again");
            } else if (numberStudent == 1) {
                System.out.println("500 Baht\nInsert your money: ");
                double change = sn.nextDouble();
                double yourChange = change - 500;
                System.out.println("Your change: " + yourChange + "Baht");
            } else if (numberStudent == 2) {
                System.out.println("450 Baht\nInsert your money: ");
                double change = sn.nextDouble();
                double yourChange = change - 450;
                System.out.println("Your change: " + yourChange + "Baht");
            } else if (numberStudent == 3) {
                System.out.println("400 Baht\nInsert your money: ");
                double change = sn.nextDouble();
                double yourChange = change - 400;
                System.out.println("Your change: " + yourChange + "Baht");
            } else if (numberStudent == 4) {
                System.out.println("350 Baht\nInsert your money: ");
                double change = sn.nextDouble();
                double yourChange = change - 350;
                System.out.println("Your change: " + yourChange + "Baht");
            } else {
                System.out.println("300 Baht\nInsert your money: ");
                double change = sn.nextDouble();
                double yourChange = change - 300;
                System.out.println("Your change: " + yourChange + "Baht");
            }
    }
}
