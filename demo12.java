import java.util.Scanner;

public class demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter");
        // int num = sc.nextInt();

        // switch (num) {
        // case 1:
        // System.out.println("monday");
        // break;
        // case 2:
        // System.out.println("tusday");
        // break;
        // case 3:
        // System.out.println("wednesday");
        // break;
        // case 4:
        // System.out.println("thuday");
        // break;
        // case 5:
        // System.out.println("friday");
        // break;
        // case 6:
        // System.out.println("satarday");
        // break;
        // case 7:
        // System.out.println("sunday");
        // break;

        // default:
        // System.out.println("invalid input");
        // }
        // System.out.println("bye");

        // System.out.println("enter a:");
        // int a =sc.nextInt();
        // System.out.println("enter b:");
        // int b =sc.nextInt();
        // System.out.println("enter operation:");
        // String op = sc.next();

        // switch (op.charAt(0)) {
        // case '+':
        // System.out.println("addition:"+(a+b));

        // break;
        // case '-':
        // System.out.println("subtraction:"+(-b));

        // break;
        // case '*':
        // System.out.println("multiplication:"+(a*b));

        // break;
        // case '/':
        // if(b==0){
        // System.out.println("can not divide by zero");
        // }else{
        // System.out.println("division:"+(a/b));
        // }
        // break;

        // }

        System.out.println("enter character:");
        String ch = sc.next();

        switch (ch) {
            case "a":
            case "u":
            case "i":
            case "r":
            case "j":
            case "t":
                System.out.println("vowel");

                break;
            case "@":
            case "$":
            case "#":
                System.out.println("specific character");
                break;

            default:
                System.out.println("consonla");
                break;
        }

    }
}
