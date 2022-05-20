import java.lang.*;
import java.util.*;

class Anagram{
    //Definition: word or phrase or name that is formed by rearranging the letters of another, such as cinema which can form the word iceman
    public static void main(String [] args){
        word("restful","fluster");
    }

    public static void word(String x, String y){
        //Display the first word
        String word_1 = x;
        System.out.println("First String: "+ word_1);

        //Display the second word
        String word_2 = y;
        System.out.println("Second String: "+ word_2);

        //if the two words are not the same length
            //display that they are not anagrams
        if(word_1.length() != word_2.length()){
            //Display if they are not
            System.out.println("\nThe two string are not anagrams");
        }//end of if
        else{
            //Need to go through the words utilizing an array of characters.
            char arr_1 [] = word_1.toLowerCase().toCharArray();
            char arr_2 [] = word_2.toLowerCase().toCharArray();
            
            //sort out the words and check if both are equal to another, terms of having the same letters
            Arrays.sort(arr_1);
            Arrays.sort(arr_2);
            boolean result = Arrays.equals(arr_1, arr_2);
            
            //Display that they are
            if(result){
                System.out.println("\nThe two strings are anagrams");
            }//end of if
            
        }//end of else

    }//end of mode
}//end of class