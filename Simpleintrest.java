import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        float SI;
        System.out.println("enter digit p ");
        p=sc.nextInt();
        System.out.println("enter digit r ");
        r=sc.nextInt();
        System.out.println("enter digit t ");
        t=sc.nextInt();
        SI=(p*r*t/100.0f);
        System.out.println(SI);  
      }
    
}



