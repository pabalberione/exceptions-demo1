package ejercicio3;

public class Calculator {
    public double divide(double numerator, double denominator) throws DivisionByZeroException{
        if(denominator == 0){
            throw new DivisionByZeroException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}
