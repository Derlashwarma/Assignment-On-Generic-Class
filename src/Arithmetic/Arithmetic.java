package Arithmetic;

public class Arithmetic <T>{
    private T number1;
    private T number2;
    public Arithmetic(T number1, T number2) throws Exception {
        if(!(number1 instanceof Number) || !(number2 instanceof Number)){
            throw new Exception("One of the input provided input is not a real number");
        }
        this.number1 = number1;
        this.number2 = number2;
    }
    public double add(){
        return Double.parseDouble(number1.toString()) + Double.parseDouble(number2.toString());
    }
    public double subtract(){
        return Double.parseDouble(number1.toString()) - Double.parseDouble(number2.toString());
    }
    public double multiply(){
        return Double.parseDouble(number1.toString()) * Double.parseDouble(number2.toString());
    }
    public double divide() throws ArithmeticException{
        return Double.parseDouble(number1.toString()) / Double.parseDouble(number2.toString());
    }
    public T getMin(){
        return (Double.parseDouble(number1.toString()) < Double.parseDouble(number2.toString()))?number1:number2;
    }
    public T getMax(){
        return (Double.parseDouble(number1.toString()) > Double.parseDouble(number2.toString()))?number1:number2;
    }
}