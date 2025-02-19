import java.util.Scanner;

public class demo16 {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter even number");
        // int n = Sc.nextInt();

        // while (n % 2 == 0) {
        // System.out.println("number:" + n);
        // System.out.println("enter a even number");
        // n = Sc.nextInt();

        // }
        // System.out.println("opps! its not an even number");

        System.out.print("to unlock enter password");
        int pass = Sc.nextInt();
        int count = 1;

        while (pass != 1234) {
            count++;

            if (count == 5) {
                System.out.println("your device is locked for 1 day");
                break;

            }
            System.out.println("wrong passkey:" + pass);
            System.out.println("please try agin");
            pass = Sc.nextInt();

        }
        if (count < 5) {
            System.out.println("device is unlock");

        }
    }
}
