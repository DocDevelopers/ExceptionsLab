/**
 * Created by Doc on 2/21/16.
 */
public class Calculator {
    public static void main(String[] args) {

    }
    public static int add(int int1, int int2){
        return int1 + int2;
    }

    public static int subtract(int int1, int int2){
        return  int1 - int2;
    }

    public static int multiply(int int1, int int2){
        return int1 *int2;
    }

    public static double divide(int int1, int int2) throws DivisionByZeroException{
        if(int2 == 0)
            throw new DivisionByZeroException("Cannot divide by zero!");

        return int1/int2;
    }
}
