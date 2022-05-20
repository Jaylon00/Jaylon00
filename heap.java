import java.util.*;
//Efficiency is O(N)
public class heap {
    public static void main(String [] args){
        CheckHeap();
    }//main method

    public static void CheckHeap(){

        Scanner input = new Scanner(System.in);
        //user input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        //size of the array from the user input
        int size = input.nextInt();
        //initialize array to store the size 
        int[] array = new int[size];
        //heap root
        int root = array.length/2;

        System.out.println("Enter the elements of the array: ");
        //gets the user's integers that they had put in without worrying about space
        for(int i = 0; i < root; i++){
            array[i] = input.nextInt();
            //heap identifiers
            int left_side = i * 2;
            int right_side = i * 2 + 1;

            //checks if the array is a heap or not by going through the left and right sides while in the root
            if(array[left_side] > array[i] || array[right_side] > array[i]){
                System.out.println("The array is not a heap");
                System.exit(0);   
            }

            System.out.println("The array is a heap");
            System.exit(0);

        }

        input.close();
    }

}//end of class
