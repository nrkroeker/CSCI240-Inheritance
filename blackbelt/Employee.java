// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Employee {

	private String firstName;
	private String lastName;
	private String jobId;
	private String employeeId;
	private double payRate;

	Employee() {

	}

	// Getters and setters
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

	public void printEmployee() {
		System.out.println("ID: " + getEmployeeId() + "\tName: " + getFirstName() + " " + getLastName() + "\tRate: " + getPayRate());
	}
}
