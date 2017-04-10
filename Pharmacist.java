// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

public class Pharmacist extends Employee {

  private double paycheck;

  Pharmacist() {

  }

  public double getPaycheck(int hours) {
    paycheck = 40.0 * hours;
    return paycheck;
  }

}
