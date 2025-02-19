import java.util.Scanner;

public class demo13 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        // System.out.println("enter a number");
        // int num = Sc.nextInt();

        // switch (num) {
        // case 1 -> System.out.println("one");
        // case 2 -> System.out.println("two");
        // case 3 -> {
        // System.out.println("three");
        // System.out.println("3three");
        // }

        // default -> System.out.println("invalid input");

        // }

        // System.out.println("enter a ssc marks:");
        // double ssc = Sc.nextInt();

        // if(ssc >= 35){
        // System.out.println("enter a hs marks:");
        // double hsc = Sc.nextInt();
        // if(hsc >= 35){
        // System.out.println("eligible for placement");
        // }else{
        // System.out.println("not eligible for placement ");
        // }

        // }else{
        // System.out.println("notnot eligible for placement" );
        // }

        // System.out.println("enter a username");
        // String username = Sc.next();
        // System.out.println("enter a password");
        // String password = Sc.next();

        // if ("admin".equals(username)) {
        //     if ("1234".equals(password)) {
        //         System.out.println("login successful!");
        //     } else {
        //         System.out.println("incorect password");
        //     }
        // } else {
        //     System.out.println("incorect username");
        // }

        System.out.println("enter a:");
        int a = Sc.nextInt();

        String ans = ( a % 2 == 0) ? "even": "odd";
        System.out.println("number is"+ ans);

    }
}
