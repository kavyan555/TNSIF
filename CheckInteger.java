import java.util.Scanner;
public class CheckInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        double num = sc.nextDouble();
        int intPart = (int) num;
        boolean isInteger = (num==intPart);
        System.out.println("Is Integer? "+ isInteger);
        sc.close();

    }
    
}
