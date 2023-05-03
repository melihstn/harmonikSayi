import java.util.Scanner;


public class harmonikHaraket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("bir değer giriniz: ");
        number = input.nextInt();

        double result =0.0;
        for(double i = 1; i <= number; i++ ){

            result += (1/i);


        }
        System.out.print(result);


    }
}
