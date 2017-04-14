// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class PharmacyManager extends Employee {

  // Constructors
  PharmacyManager() {
    super.setPayRate(50.0);
    super.setJobId("1");
  }

  PharmacyManager(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(50.0);
    super.setJobId("1");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

}
