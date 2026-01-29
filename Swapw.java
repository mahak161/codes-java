import java.util.Scanner;

public class Swapw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int a,b;
        System.out.println("enter a");
        a=sc.nextInt();
        System.err.println("enter b");
        b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("enter value of a  "+a);
        System.out.println("enter value of b"+b);


        
    }
    
}


