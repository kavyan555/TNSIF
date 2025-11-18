import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = "Dear <|name|>,thanks a lot";
        String filledLetter = letter.replace("<|name|>","tabbu");
        System.out.println("replaced name:" + filledLetter);

    }

    
}
