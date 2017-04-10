// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {

  public int menuInput;

  public void print(String phrase) {
    System.out.print(phrase);
  }

  public static void main(String [] args) {
    // Instantiate driver and run menu
    Driver driver = new Driver();
    driver.menu();
  }

  public void menu() {
    boolean keepGoing = true;

    while(keepGoing) {
      // Display menu options and recieve user choice
      print("1. Load employees from file \n2. Exit program \nPlease enter your selection > ");

      Scanner scan = new Scanner(System.in);
      menuInput = scan.nextInt();

      if(menuInput == 1) {
        print("Reading file.");
        keepGoing = false;
      } else if (menuInput == 2) {
        print("Exiting...");
        keepGoing = false;
      } else {
        print("Please select a valid input.");
      }
    }


  }

}
