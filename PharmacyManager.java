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
}
