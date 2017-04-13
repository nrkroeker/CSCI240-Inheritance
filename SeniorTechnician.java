// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class SeniorTechnician extends Employee {

  private double paycheck;
  private double payRate;

  // Constructors
  SeniorTechnician() {
    payRate = 25.0;
    super.setJobId("4");
  }

  SeniorTechnician(String employeeIdIn, String firstNameIn, String lastNameIn) {
    payRate = 25.0;
    super.setJobId("4");
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
