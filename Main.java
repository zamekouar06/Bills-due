import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    // This scanner is to recive the input from the user which will be "how many bills are due?"

    System.out.println("How many bills are due today?");
    //This print statement is to ask the user the amount of bills to start off the code
    int numBills = scan.nextInt();
    //Recives the count of bills

    int count = 1;
    //To have a stopping point in the base case
    double total = 0;
    //To eventually have the total amount of money of all your bills

    System.out.println("your total bills are, " + pay(numBills, count, total));
    //The final print statemnet to give you everything this code does 

  }

  public static double pay(int numBills, int count, double total) {
    //The begining of the pay method
    Scanner scan = new Scanner(System.in);
    //Recives input which will be the next amounts of the coming bills
    if (count <= numBills) {
      //base case for the stopping point 
      System.out.println("How much is the next bill?");
      //This print statement gathers all the total cost of the bills
      double billCost = scan.nextDouble();
      //revices the input of the Print statement 
      total = total + billCost;
      //Changing the total varible 
      System.out.println("your " + count + "st bill is $" + billCost);
      //print statemnet makes the following costs make a lot more sense 
      count++;
      //add 1 to each count
      return pay(numBills, count, total);
      //finally returning all three parameters from the code
    }else{
      return total;
      //returning total to finish off the code 
    }
  }
}