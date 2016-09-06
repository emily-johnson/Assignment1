//Lecture 3 example - 9.6.16
//Emily Johnson

import java.util.Scanner;

public class TempConvert{
  public static void main(String[] args){
    System.out.println("Please enter a temp in C");
    Scanner input = new Scanner (System.in);
    float temp = input.nextFloat();
    temp = temp * 9 / 5 + 32;
    System.out.println("Temperature in F is " + temp);
  }
} 