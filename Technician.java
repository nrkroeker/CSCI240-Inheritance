// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Technician extends Employee {

  private double paycheck;

  public double getPaycheck(int hours) {
    paycheck = 20.0 * hours;
    return paycheck;
  }
}
