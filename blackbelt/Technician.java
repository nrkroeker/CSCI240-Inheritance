// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Technician extends Employee {

  // Constructors
  Technician() {
    super.setPayRate(20.0);
    super.setJobId("3");
    super.setJobTitle("Technician");
    super.setJobDescription("Creates the various medications.\t");
  }

  Technician(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(20.0);
    super.setJobId("3");
    super.setJobTitle("Technician");
    super.setJobDescription("Creates the various medications.");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

}
