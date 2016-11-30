/**
 * Created by Samson on 06-10-2016.
 */
import java.util.*;
public class CannotDivide {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // promt the user to enter two intger
        System.out.println("Enter two integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try{
            int result = quontient(number1, number2);
            System.out.print(number1 + " / " + number2 + " is " + result);
        } catch (ArithmeticException ex){
            System.out.println("Cannot be divided by zero");
        }

    }

    public static int quontient(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

}