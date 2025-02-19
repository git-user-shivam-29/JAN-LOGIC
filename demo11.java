import java.util.Scanner;

public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter a yearly Income");
        // int num =sc.nextInt();
        // if (num==1) {
        //     System.out.println("monday");
        // }
        // else if (num==2) {
        //     System.out.println("tusday");
        // }
        // else if (num==3) {
        //     System.out.println("wedsday");
        // }
        // else if (num==4) {
        //     System.out.println("thusday");
        // }
        // else if (num==5) {
        //     System.out.println("friday");
        // }
        // else if (num==6) {
        //     System.out.println("saterday");
        // }
        // else if (num==7) {
        //     System.out.println("sunday");
        // }
        // else{
        //     System.out.println("invalid input");
        // }



        // double annualIncome = sc.nextDouble();

        // if(annualIncome < 500000){
        //     System.out.println("no tax");
        // }
        // else if (annualIncome>=500000 && annualIncome<=1000000) {
        //     double tax = (annualIncome)*0.02;
        //     System.out.println("tax amout:"+tax);
        // }
        // else if (annualIncome>=1000000 && annualIncome<=2000000) {
        //     double tax = (annualIncome)*0.05;
        //     System.out.println("tax amout:"+tax);
        // }
        // else{
        //     double tax =(annualIncome)*0.07;
        //     System.out.println("tax amoute:"+tax);
        // }


        Scanner Sc = new Scanner(System.in);
        System.out.println("enter x:");
        int x = sc.nextInt();
        System.out.println("enter y:");
        int y = sc.nextInt();

        if(x>0 && y>0){
            System.out.println("the point lie in the frist quadrant");
        }
        else if (x<0 && y>0) {
            System.out.println("the point lie in the second quadrant");
        }
        else if (x<0 && y<0) {
            System.out.println("the point lie in the thrid quadrant");
        }
        else if (x>0 && y<0) {
            System.out.println("the point lie in the four quadrant");
        }
        else if (x==0 && y==0) {
            System.out.println("the point are origin");
        }
        else if (x == 0) {
            System.out.println("the point lie on y-axise");
        }
        else if (y == 0) {
            System.out.println("the point lie on x-axise");
        }

    }
}
