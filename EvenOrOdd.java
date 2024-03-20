// Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.

import java.util.Scanner; //useless


//My Solution:
public class Kata {
    public static String evenOrOdd(int number) {
            
        int numberModulo = number % 2;
        if (numberModulo == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
  
  
}