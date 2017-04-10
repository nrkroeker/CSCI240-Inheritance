// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class PharmacyManager extends Employee {

  private double paycheck;

  public double getPaycheck(int hours) {
    paycheck = 50.0 * hours;
    return paycheck;
  }
}
