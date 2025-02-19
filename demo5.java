import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary:");
        double salary = sc.nextDouble();

        if (salary > 0) {
            System.out.println("basic salary:" + salary + "Rs");

            double hra = salary * 0.02;
            double da = salary * 0.05;
            double ta = salary * 0.1;

            double grossSalary = salary + hra + da + ta;
            System.out.println("gross salary =" + grossSalary + "Rs");

        } else {
            System.out.println("invalid input:");
        }

    }

}
