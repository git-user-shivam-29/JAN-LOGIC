import java.util.Scanner;

public class demo3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the if condidate");
            int marks = sc.nextInt();

            if(marks <=100 && marks > 90){
                System.out.println("grade:0");
                }
                else if( marks <=90 && marks >80){
                    System.out.println("grade A+");
                }
                else if( marks <=80 && marks>70){
                    System.out.println("grade A");
                }
                else if( marks <=70 && marks>50){
                    System.out.println("grade B");
                }
                else if( marks <=50 && marks>35){
                    System.out.println("grade c");
                }
               else{
                System.out.println("falled");
               }
        }
    
        
    }
    
