import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        // int a = 13;
        // int b = 20;

        // while (a < b) {

        // System.out.println("shivam ");

        // a = a + 1;
        // a++;
        // }

        // int i = 1;
        // while (i <= 10) {
        // System.out.println(i);
        // i++;

        // }

        // System.out.println("enter a number");
        // int i = 1;
        // int n = Sc.nextInt();

        // while (i <= 10) {
        // System.out.println(n + " x " + i + ":" + n * i);
        // i++;

        // }

        System.out.println("enter the number");
        int num = Sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= num) {
            sum += i;
            System.out.println(sum);
            i++;

        }
        System.out.println("sum:" + sum);

    }
}
