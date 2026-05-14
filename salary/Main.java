package salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int hour = scn.nextInt();
        float amountHour = scn.nextFloat();

        float salary = hour * amountHour;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

        scn.close();
    }
}