// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Technician extends Employee {

  private double paycheck;

  // Constructors
  Technician() {
    super.setPayRate(20.0);
    super.setJobId("3");
  }

  Technician(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(20.0);
    super.setJobId("3");
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

  // Print paycheck
  public void printPaycheck() {
    System.out.println("z1ID: " + super.getEmployeeId() + "\tCheck Amount: $" + getPaycheck());
  }

}
