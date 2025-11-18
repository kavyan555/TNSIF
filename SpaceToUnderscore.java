import java.util.Scanner;
public class SpaceToUnderscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String:");
        String name = sc.nextLine();
        String replacename = name.replace(" ","_");
        System.out.println("replaced name"+ replacename);
        sc.close();

    }
    
}
