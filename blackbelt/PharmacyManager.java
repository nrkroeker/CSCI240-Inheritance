// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class PharmacyManager extends Employee {

  // Constructors
  PharmacyManager() {
    super.setPayRate(50.0);
    super.setJobId("1");
    super.setJobTitle("Pharmacy Manager");
    super.setJobDescription("Manages the pharmacists and makes the schedule.\t");
  }

  PharmacyManager(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(50.0);
    super.setJobId("1");
    super.setJobTitle("Pharmacy Manager");
    super.setJobDescription("Manages the pharmacists and makes the schedule.");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

}
