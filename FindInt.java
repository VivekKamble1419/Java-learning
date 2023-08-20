import java.util.Scanner;

public class FindInt {
    public static void main(String[] args){
        System.out.println("Check entered number is Intiger or not ");

        System.out.println("Enter Input: ");
        Scanner num= new Scanner(System.in);
        System.out.println(num.hasNextInt());
    }
}
