// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Employee {

	private String firstName;
	private String lastName;
	private String jobId;
	private String employeeId;
	private double payRate;
	private double paycheck;

	// Additional employee informationn
	private String jobTitle;
	private String jobDescription;

	// Enables setting individual hours worked
	private int hoursWorked;

	Employee() {

	}

//====================================================================//

	// Getters

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getJobId() {
		return jobId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public double getPayRate() {
		return payRate;
	}

	public double getPaycheck() {
		return paycheck;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	//====================================================================//

	// Setters

	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	public void setLastName(String newLastName) {
		lastName = newLastName;
	}

	public void setJobId(String newJobId) {
		jobId = newJobId;
	}

	public void setEmployeeId(String newEmployeeId) {
		employeeId = newEmployeeId;
	}

	public void setPayRate(double newPayRate) {
		payRate = newPayRate;
	}

	public void setPaycheck() {
    paycheck = payRate * hoursWorked;
  }

	public void setJobTitle(String newJobTitle) {
		jobTitle = newJobTitle;
	}

	public void setJobDescription(String newJobDescription) {
		jobDescription = newJobDescription;
	}

	public void setHoursWorked(int newHoursWorked) {
		hoursWorked = newHoursWorked;
	}

	//====================================================================//

	public void printEmployee() {
		System.out.printf("ID: " + employeeId + "\tTitle: " + jobTitle + "\tJob Description: " + jobDescription + "\tName: " + firstName + " " + lastName + "\tRate: " + payRate + "\n");
	}

	public void printPaycheck() {
		System.out.printf("ID: " + employeeId + "\tCheck Amount: $" + paycheck + "\n");
	}
}
