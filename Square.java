import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        float side,perimetre,Area;
        System.out.println("enter area");
        Area=sc.nextFloat();
        side = (float) Math.sqrt(Area);

        perimetre=(4)*(side);
        System.out.println(side);
        System.out.println(perimetre);

        
    }
    
}

