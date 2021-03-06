// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class SeniorTechnician extends Employee {

  // Constructors
  SeniorTechnician() {
    super.setPayRate(25.0);
    super.setJobId("4");
    super.setJobTitle("Senior Technician");
    super.setJobDescription("Manages the technicians and develops plans for new medications.\t");
  }

  SeniorTechnician(String employeeIdIn, String firstNameIn, String lastNameIn) {
    super.setPayRate(25.0);
    super.setJobId("4");
    super.setJobTitle("Senior Technician");
    super.setJobDescription("Manages the technicians and develops plans for new medications.");
    super.setEmployeeId(employeeIdIn);
    super.setFirstName(firstNameIn);
    super.setLastName(lastNameIn);
  }

}
