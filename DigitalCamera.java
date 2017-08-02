class DigitalCamera implements Printable {

  public String brand;
  public String type;

  public DigitalCamera(String brand, String type){
    this.brand = brand;
    this.type = type;
  }

  public String printDetails(){
    return "I have a " + this.brand + ", " + this.type;
  }
}