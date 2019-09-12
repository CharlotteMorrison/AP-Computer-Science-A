// in this example we will be examining the java.util.Random built in class and methods
import java.util.Random;
import java.util.Scanner;

public class RandomNumber{
// instantiate and/or declare class variables
// variables should be private unless you have a compeling reason for them to be public
private int intNumber;
private double doubleNumber;

// I will instantiate the random number class and the scanner classes-since they are stored in class variables above, all the methods below can utilize them.
Random random = new Random();

// create a constructor
// the constructor is used each time you create a new object 
// it sets up the object by getting the class variables set and running any other initial commands
// the constructor is always set to public visibility and has no return type
public RandomNumber(){
  // here I am just setting the randoms to 0, this is a trivial example
  intNumber = 0; 
  doubleNumber = 0.0;
}

// next, set up a method to get a random integer number.
// this will be a public method because I want to be able to call it from the Main or any other class
public void getRandomInt(int maxValue){
  intNumber = random.nextInt(maxValue);
  System.out.println("A random int is: " + intNumber);
}

// then, set up a random generator that gets double
public void getRandomDouble(){
  doubleNumber = random.nextDouble();
  System.out.println("A random double is: " + doubleNumber);
}

}