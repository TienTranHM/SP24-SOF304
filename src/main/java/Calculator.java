public class Calculator {

    public int Add(int a, int b){
            return a+b;

    }

    public double Divide(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Cannot be divided by 0");
        }
        return a/b;
    }
}
