package ExceptionHandling;

import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter the value for the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the value for the second number: ");
        num2 = in.nextInt();
        int divide = 0;

        int[] arr = {1,2,3};
        System.out.println("enter the number strings: ");

        String numString = in.next();
        String nullString =  null;

        try{
            divide =  num1/num2;
            for (int i = 0; i <= 3; i++)
            {
                System.out.println(arr[i]);
            }
            if (nullString.equals("null"))
                System.out.println("it is not null");
            System.out.println(Integer.parseInt(numString));
        }
        catch (ArithmeticException ae){
            System.out.println("can't divide by 0" + ae.getMessage());
        }
        catch (NumberFormatException nfe){
            System.out.println("invalid number or null is stored in the string" + nfe.getMessage());
        }
        catch (NullPointerException npe){
            System.out.println("one value is pointing to null" +  npe.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("exception in the array" + ai.getMessage());
        }

        catch (Exception e){
            System.out.println("exception in the code" + e.getMessage());
        }
        finally {
            System.out.println("exception got handled if existed");
        }

    }
}
