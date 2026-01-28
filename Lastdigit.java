import java.util.Scanner;

public class Lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter digit n ");
        n=sc.nextInt();
        if (n%10==4){
            System.out.println("last digit is 4");

        } else{
            System.out.println("last digit is not 4");
        }
      }
    
}

