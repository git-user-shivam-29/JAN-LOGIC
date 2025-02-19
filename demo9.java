import java.util.Scanner;

public class demo9 {
    public static void main(String[] args) {
        
        // System.out.println("3<9:"+(3<9));
        // System.out.println("3>3:"+(3>3));
        // System.out.println("3>=3:"+(3<9));
        // System.out.println("8<2:"+(8<5));
        // System.out.println("3==3:"+(8==5));
        // System.out.println("3!=9:"+(3!=9));

        // System.out.println("3<9 && 5<9:"+(3<9 && 5<9));
        // System.out.println("3==9 || 5<9:"+(3==9));


        // System.out.println(!true);
        // System.out.println(!false);
        // System.out.println !(6>8);




        Scanner sc = new Scanner(System.in);
        System.out.print("enter number:");
        int n =sc.nextInt();
        System.out.println("n:"+n);
        System.out.println("n²:"+(n*n));
        System.out.println("n²+n²:"+((n*n)+(n*n)));
        
    }
}
