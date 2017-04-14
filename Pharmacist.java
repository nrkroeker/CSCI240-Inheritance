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

}
