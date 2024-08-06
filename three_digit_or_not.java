package conditional;
import java.util.Scanner;
public class three_digit_or_not {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        if(n>99 && n<1000){
            System.out.println("This intger is a three digit number");

        }
        else{
            System.out.println("This intger is not a three digit number");
        }

    }
}
