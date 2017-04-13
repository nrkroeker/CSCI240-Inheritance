// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class PharmacyManager extends Employee {

  private double paycheck;
  private double payRate;

  // Constructors
  PharmacyManager() {
    payRate = 50.0;
    super.setJobId("1");
  }

  PharmacyManager(String employeeIdIn, String firstNameIn, String lastNameIn) {
    payRate = 50.0;
    super.setJobId("1");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

  public void setPaycheck(int hours) {
    paycheck = payRate * hours;
  }

  public double getPaycheck() {
    return paycheck;
  }

  public double getPayRate() {
    return payRate;
  }

  public void printEmployee() {
    System.out.println("\nID: " + super.getEmployeeId() + "\tName: " + super.getFirstName() + " " + super.getLastName() + "\tRate: " + getPayRate());
  }

  public void printPaycheck() {
    System.out.println("\nID: " + super.getEmployeeId() + "\tCheck Amount: $" + getPaycheck());
  }
}
