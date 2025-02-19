import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a day (monday to sunday):");
        String day = sc.next();

        switch (day) {
            case "monady":
            System.out.println(1);
            break;

            case "tusday":
            System.out.println(2);
            break;

            case "wednesday":
            System.out.println(3);

            case "thursday":
            System.out.println(4);
            break;

            case "friday":
            System.out.println(5);
            break;

            case "saturday":
            System.out.println(6);
            break;

            case "sunday":
            System.out.println(7);
            break;

           default:
           System.out.println("-->invalid day");
            
        }
    }
    
}
