// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Pharmacist extends Employee {

  private double paycheck;

  // Constructors
  Pharmacist() {
    super.setPayRate(40.0);
    super.setJobId("2");
  }

  Pharmacist(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(40.0);
    super.setJobId("2");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

  // Getters and setters
  public void setPaycheck(int hours) {
    paycheck = super.getPayRate() * hours;
  }

  public double getPaycheck() {
    return paycheck;
  }

  // Functions to print employee info
  public void printEmployee() {
    System.out.println("\nID: " + super.getEmployeeId() + "\tName: " + super.getFirstName() + " " + super.getLastName() + "\tRate: " + super.getPayRate());
  }

  public void printPaycheck() {
    System.out.println("\nID: " + super.getEmployeeId() + "\tCheck Amount: $" + getPaycheck());
  }
}
