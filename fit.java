import java.util.*;
import java.io.*;
public class fit{
    public static void main(String [] args){
     try{
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers are in the array: ");
        int size = input.nextInt();
        double array [] = new double[size];
        System.out.println("Enter the members of the array(All between 0 and 1): ");
        double total = 0;
        double numbers = 0;
        //populates the array with the numbers
        for(int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();

            total = numbers + array[i];
            //prints out the sets that are totaled to 1 or that subsets that are less that 1
            if(total < 1.0){
                numbers = total;
                System.out.print(array[i] + " ");
            }
            else if(total >= 1.0){
                System.out.println();
                System.out.print(array[i]+ " ");
                total = 0;
                numbers = array[i];
            }
        }
        input.close();
     }
     catch(Exception e){
         System.out.println(e);
     }   
    }
}