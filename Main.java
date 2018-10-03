public class Main {

  public static void main(String[] args) {

    //Write a static main method that creates two objects,
    // one with the default constructor and the other with the
    //constructor with parameters. Give sample data for the parameters.

    VehicleChassis myVc = new VehicleChassis();

    System.out.println(myVc.toString());
    myVc.setChassisType("chazzzzz");
    System.out.println(myVc.toString());
    VehicleChassis myVc1 = new VehicleChassis("chaz");
    System.out.println(myVc1.toString());
  }
}
