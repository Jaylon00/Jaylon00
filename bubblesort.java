import java.util.*;
import java.lang.*;

public class bubblesort {
   public static void main(String [] args){
       System.out.print("Ener an integer (>= 1): ");
       Scanner input = new Scanner(System.in);
       int size = input.nextInt();
       input.nextLine();
       input.close();

       int array[] = new int[size];

        //generates random numbers into the array
       int min = 100;
       int max = -100;
       for(int i = 0; i < array.length;i++){
           array[i] = (int)Math.floor(Math.random() *(max - min + 1) + min);
       }//for loop

       //before being sorted 
       System.out.print("The Original Array: ");
       for(int i = 0; i < array.length; i++){
           if(i != array.length - 1){
               System.out.print(" "+array[i]+",");
           }//if
           else{
               System.out.print(" "+ array[i]);
           }//else 
       }//for loop

       //call bubble sort to sort
       BubbleSort(array);

       //shows the sorted array
       System.out.print("\nThe Sorted Array: ");
       for(int i = 0; i < array.length; i++){
           if(i != array.length - 1){
               System.out.print(" "+array[i]+",");
           }//if
           else{
               System.out.print(" "+ array[i]);
           }//else 
       }//for loop

   } 

   public static void BubbleSort(int array[]){
       int holder;
       int n = array.length;   
        for(int i = 0; i < n -1; i++){
            for(int j = 0; j < n-i-1;j++){
                if(array[j] > array[j+1]){
                    holder = array[j];
                    array[j] = array[j+1];
                    array[j+1] = holder;
                }//if statement
            }//inner for loop
        }//outer for loop
   }//BubbleSort Method

}//bubblesort class
