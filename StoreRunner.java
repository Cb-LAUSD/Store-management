import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {
//calls
      serviceCharge regular = new serviceCharge("basic: ", 30.00);
        System.out.println(regular);
tutoringCharge tutoring = new tutoringCharge("math tutoring: ", 30.00, 3, 60.00);
    System.out.println(tutoring);
        homeworkCharge hw = new homeworkCharge("Homework: ", 30.00, 5, 15.00);
        System.out.println(hw);
    
  }
}