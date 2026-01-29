import java.util.Scanner;

public class Swap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int a,b,temp;
        System.out.println("enter a");
        a=sc.nextInt();
        System.err.println("enter b");
        b = sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("enter value of a"+a);
        System.out.println("enter value of b"+b);


        
    }
    
}

