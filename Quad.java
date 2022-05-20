import java.util.*;
public class Quad {
    public static void main(String [] args){
        //declare array size
        double array[] = new double[3];
        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients for the parabola ax^2+bx+c:");
        //get numbers that go into the array size
        for(int i = 0; i < array.length;i++){
            array[i] =  input.nextInt();
        }
       //put numbers into the algorithm
        Vertex(array);
        input.close();
    }

    public static void Vertex(double array[]){
        double x = array[2];
        double next = 0;
        double step = 1;
        //
        if(array[0] < 0){
            while (step > 0.01){
                if(quad_der(array, x) == 0){
                    step = 0;
                    next = x;
                    break;
                }
                //function increasing, go left
                else if(quad_der(array, x) > 0){
                    next = x + step;
                }
                //functinon decreaing go right
                else if(quad_der(array, x) < 0){
                    next = x - step;
                }
                //cut step size for the next iteration
                if((quad_der(array, x) > 0) && (quad_der(array, next) < 0) || (quad_der(array, x) < 0) && (quad_der(array, next) > 0)){
                    step = step / 2.0;
                }
    
                x = next;
            }
        }else{
            //this does the opposite to take negative "a" value into consideration
            while (step > 0.01){
                if(quad_der(array, x) == 0){
                    step = 0;
                    next = x;
                    break;
                }
                else if(quad_der(array, x) > 0){
                    next = x - step;
                }
                else if(quad_der(array, x) < 0){
                    next = x + step;
                }
    
                if((quad_der(array, x) > 0) && (quad_der(array, next) < 0) || (quad_der(array, x) < 0) && (quad_der(array, next) > 0)){
                    step = step / 2.0;
                }
    
                x = next;
            }
        }
        System.out.println("The vertex of theparabola is approximately: \n"+"("+next +" , "+ quadratic(array, next)+")");
    }
    //quadratic function
    public static double quadratic(double array[], double x){
        double a = array[0];
        double b = array[1];
        double c = array[2];

        return a*Math.pow(x, 2) + b*x + c;
    }
    //the derivative of quadratic function
    public static double quad_der(double array[], double x){
        double a = array[0];
        double b = array[1];

        return 2*a*x + b;
    }
}
