import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter you age");
        int age = myScanner.nextInt();

        if (age >= 18) {
            System.out.println("you are adult");
        } else {
            System.out.println("you are a minor");
        }
    }
}
