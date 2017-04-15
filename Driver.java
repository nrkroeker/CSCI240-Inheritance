// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {
  // Declare variables
  public Employee [] employees = new Employee[4];
  public char menuInput;
  public String hours;
  public int hoursWorked;

  // Function for easy printing
  public void print(String phrase) {
    System.out.print(phrase);
  }

  // Initialization function
  public static void main(String [] args) {
    // Instantiate driver and run menu
    Driver driver = new Driver();
    driver.menu();
  }

  // Menus setup
  public int menu() {
    boolean keepGoing = true;

    // Menu options
    while(keepGoing) {
      // Display menu options and recieve user choice
      print("\n1. Load employees from file \n2. Exit program \nPlease enter your selection > ");

      Scanner scan = new Scanner(System.in);
      menuInput = scan.next().charAt(0);

      if (menuInput == '1') {
        readFile();
        print("\nEmployees loaded from file\n");
        keepGoing = false;
      } else if (menuInput == '2') {
        print("Exiting...\n");
        return 0;
      } else {
        print("\nPlease select a valid input.\n");
      }
    }

    // Next menu
    keepGoing = true;
    while(keepGoing) {
      print("\n1. Print employee information \n2. Enter hours worked \n3. Calculate paychecks \n4. Exit program \nPlease enter your selection > ");

      Scanner scan = new Scanner(System.in);
      menuInput = scan.next().charAt(0);

      if (menuInput == '1') {
        printInfo();
      } else if (menuInput == '2') {
        submitHours();
      } else if (menuInput == '3') {
        printPaychecks();
      } else if (menuInput == '4') {
        print("Exiting...\n");
        keepGoing = false;
      } else {
        print("\nPlease select a valid input.\n");
      }
    }
    return 0;
  }

  // Function to read the data in from the file
  public void readFile() {
    String line = "";
    String delims = "[,]";
    String [] employeeInfo;
    int num = 0;

		try {
			// Read in the file
			InputStream inputStream = new FileInputStream("employees.txt");

			InputStreamReader reader = new InputStreamReader(inputStream);

			BufferedReader buffer = new BufferedReader(reader);
			buffer.readLine();

			// Check each line and make objects
 			while(line != null) {
				line = buffer.readLine();
        if (line != null) {
          employeeInfo = line.split(delims);

          if (employeeInfo[0].charAt(0) == '1') {
            Employee employee = new PharmacyManager(employeeInfo[1], employeeInfo[2], employeeInfo[3]);
            employees[num] = employee;
          } else if (employeeInfo[0].charAt(0) == '2') {
            Employee employee = new Pharmacist(employeeInfo[1], employeeInfo[2], employeeInfo[3]);
            employees[num] = employee;
          } else if (employeeInfo[0].charAt(0) == '3') {
            Employee employee = new Technician(employeeInfo[1], employeeInfo[2], employeeInfo[3]);
            employees[num] = employee;
          } else if (employeeInfo[0].charAt(0) == '4') {
            Employee employee = new SeniorTechnician(employeeInfo[1], employeeInfo[2], employeeInfo[3]);
            employees[num] = employee;
          } else {
            print("Here's the error");
          }
          num++;
        }
      }

      buffer.close();

      // Check for errors
    } catch (IOException ex) {
    System.err.println(ex);
    }

  }

  // For each object in the array, check the jobId and print the info
  public void printInfo() {
    print("\n");
    for (int i = 0; i < 4; i++) {
      Employee employee = employees[i];
      employee.printEmployee();
    }
  }

  public void submitHours() {
    boolean keepGoing = true;

    // Recieve input of the hours worked
    Scanner scan = new Scanner(System.in);

    while(keepGoing) {
      print("\nPlease enter the hours worked > ");
      hours = scan.nextLine();

      try {
        hoursWorked = Integer.parseInt(hours);
        keepGoing = false;
      }
      catch(NumberFormatException nfe) {
        print("\nPlease enter correct type of input.\n");
      }
    }
  }

  // Check job id and print the paychecks
  public void printPaychecks() {
    if (hoursWorked == 0) {
      print("\nYou must enter the hours before calculating paycheck!\n");
    } else {
      print("\n");
      for (int i = 0; i < 4; i++) {
        Employee employee = employees[i];
        employee.setPaycheck(hoursWorked);
        employee.printPaycheck();
      }
    }
  }
}
