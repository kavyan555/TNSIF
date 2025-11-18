import java.util.Scanner;
public class StringToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a String");
        String name = sc.nextLine();
        String lowername = name.toLowerCase();
        System.out.println("converted string"+ lowername);

    }
    
}
