package com.ankit.tdd;

public class FizzBuzz {

    //if number is divisible by 3, print Fizz
    //if number is divisible by 5 print Buzz
    //if number in divisible by 3 and 5  print FizzBuzz
    //if number is not divisible by 3 and 5 print number
    public static String compute(int i){
        StringBuilder result= new StringBuilder();
        if(i%3==0){
            result.append("Fizz");
        }
        if(i%5 == 0){
            result.append("Buzz");
        }
        if(result.isEmpty()){
            result.append(i);
        }
        return result.toString();
    }
//    public static String compute(int i) {
//        if((i%3==0) && (i%5==0)){
//            return "FizzBuzz";
//        }
//        if(i % 3 == 0){
//            return "Fizz";
//        }
//        else if (i % 5 == 0) {
//            return "Buzz";
//        }
//        else {
//            //return String.valueOf(i);
//            return Integer.toString(i);
//        }
//    }
}
