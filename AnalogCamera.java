public class AnalogCamera implements Printable {

  protected String brand;
  protected String type;

  public AnalogCamera(String brand, String type){
    this.brand = brand;
    this.type = type;
  }

  public String printDetails(String brand, String type){
    return "I have a " + this.brand + ", " + this.type;
  }
}