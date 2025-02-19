import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the if candidate:");
        double sales = sc.nextDouble();

        if (sales <=50000){
            System.out.println("tax:"+(sales * 2 / 100)+"Rs");
        }
        else if( sales > 50000 && sales <= 100000){
            System.out.println("tax:"+(sales * 5 / 100)+"Rs");
        }
        else if( sales > 100000 && sales <= 500000){
            System.out.println("tax:"+(sales * 7 / 100)+"Rs");
        }
        else{
            System.out.println("tax:"+(sales * 10 / 100)+"Rs");
        }
        
    }
    
}
