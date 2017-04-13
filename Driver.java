// Honor Pledge: I pledge that I have neither given nor received any help on this assignment
import java.util.*;
import java.io.*;


public class Driver {
  public Employee [] employees = new Employee[4];
  public int menuInput;
  public int hoursWorked = 0;

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

      if (menuInput == 1) {
        readFile();
        print("\nEmployees loaded from file\n");
        keepGoing = false;
      } else if (menuInput == 2) {
        print("Exiting...");
        keepGoing = false;
      } else {
        print("\nPlease select a valid input.\n");
      }
    }

    keepGoing = true;
    while(keepGoing) {
      print("\n1. Print employee information \n2. Enter hours worked \n3. Calculate paychecks \n4. Exit program \nPlease enter your selection > ");

      Scanner scan = new Scanner(System.in);
      menuInput = scan.nextInt();

      if (menuInput == 1) {
        printInfo();
      } else if (menuInput == 2) {
        submitHours();
      } else if (menuInput == 3) {
        printPaychecks();
      } else if (menuInput == 4) {
        print("Exiting...");
        keepGoing = false;
      } else {
        print("\nPlease select a valid input.\n");
      }
    }
  }

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

			// Check each line and make student option
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

  public void printInfo() {
    for (int i = 0; i < 4; i++) {
      Employee employee = employees[i];
      if(employee.getJobId() == "1") {
        ((PharmacyManager)employee).printEmployee();
      } else if(employee.getJobId() == "2") {
        ((Pharmacist)employee).printEmployee();
      } else if(employee.getJobId() == "3") {
        ((Technician)employee).printEmployee();
      } else if(employee.getJobId() == "1") {
        ((SeniorTechnician)employee).printEmployee();
      }
    }
  }

  public void submitHours() {
    print("\nPlease enter the hours worked > ");

    Scanner scan = new Scanner(System.in);
    hoursWorked = scan.nextInt();

  }

  public void printPaychecks() {
    if (hoursWorked == 0) {
      print("\nYou must enter the hours before calculating paycheck!\n");
    } else {
      for (int i = 0; i < 4; i++) {
        Employee employee = employees[i];
        if(employee.getJobId() == "1") {
          ((PharmacyManager)employee).setPaycheck(hoursWorked);
          ((PharmacyManager)employee).printPaycheck();
        } else if(employee.getJobId() == "2") {
          ((Pharmacist)employee).setPaycheck(hoursWorked);
          ((Pharmacist)employee).printPaycheck();
        } else if(employee.getJobId() == "3") {
          ((Technician)employee).setPaycheck(hoursWorked);
          ((Technician)employee).printPaycheck();
        } else if(employee.getJobId() == "1") {
          ((SeniorTechnician)employee).setPaycheck(hoursWorked);
          ((SeniorTechnician)employee).printPaycheck();
        }
      }
    }
  }
}
