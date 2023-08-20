import java.util.Scanner;

public class Kilometerstomiles {
    public static void main(String[] args){
        System.out.println("Program for convert kilometers to minles");

        Scanner convert =new Scanner(System.in);
        System.out.println("Enter Number of kilometers: ");
        float a=convert.nextFloat();

        float miles=a*0.621371f;

        System.out.println(a + "Kilometers is equal to " + miles +" miles.");

      }
}

