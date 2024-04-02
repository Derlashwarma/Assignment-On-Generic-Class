package Arithmetic;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Arithmetic> numbers = new ArrayList<>();
        Arithmetic number= new Arithmetic<>(10,2.34);
        numbers.add(number);
        Arithmetic number2 = new Arithmetic<>(23,44);
        numbers.add(number2);
        for(Arithmetic nums: numbers){
            System.out.println(nums.add());
            System.out.println(nums.subtract());
            System.out.println(nums.multiply());
            System.out.println(nums.divide());
            System.out.println(nums.getMax());
            System.out.println(nums.getMin());
        }
    }
}
