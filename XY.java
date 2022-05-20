import java.lang.*;
import java.util.*;
import java.io.*;

public class XY{
    public static void main(String [] args){
        XYMethod();
    }

    public static void XYMethod(){
        //count the number of substrings in the string that start with an X and end with a Y.
        int i;
        int j;
        int k;
        int count = 0;
        String word;
        String letters;

        try{
            //user input to set the max length
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of elements in the array: ");
            //storing the input for the max
            int max = input.nextInt();

            //storing the string input
            Scanner input_1 = new Scanner(System.in);
            System.out.println("Enter "+ max + " X's or Y's seperated by the space: ");
            word = input_1.nextLine().toUpperCase();


            //initialize character array and length
            char [] my_array = word.toCharArray();

            String fix_word ="";
            //removes the spaces when typing in the letters
            for(i = 0; i < my_array.length; i++){
                if(my_array[i] != ' '){
                    fix_word = fix_word + my_array[i];
                }   //end of if 
            }//end of for loop

            //new line
            System.out.println();

            //converts from characters to string in order to utilize substrings
            letters = new String(fix_word);
            //goes through the input and counts the number of possible substrings in the array
            for(j = 0; j < max; j++){
                for(k = 0; k <= max - j; k++){
                    String compose = letters.substring(j, j+k);
                    if(compose.startsWith("Y") && compose.endsWith("X")){
                        count++;
                    }//end of if
                }//end of for
            }//end of for

            System.out.println("There are " + count + " substrings that start with Y and end with X");
            input_1.close();
            input.close();
            
            System.out.println("End of Program");
        }//end of try
        catch(Exception error){
            System.out.println("Error encountered: "+ error);
        }//end of catch
    }//end of method
}//end of class