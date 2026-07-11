package Day_13;
import java.util.*;
public class exceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        try {
            int num = sc.nextInt();
            System.out.println(num * num);
        }
        catch(Exception e){

        }
        System.out.println("Program ended");
    }
}