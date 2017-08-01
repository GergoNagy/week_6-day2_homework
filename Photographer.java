import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Printable> bag;

  public Photographer(String name){
    this.name = name;
    this.bag = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return this.bag.size();
  }

  public void addCamera(Printable camera){
    this.bag.add(camera);
  }

  public void removeCamera(){
    this.bag.clear();
  }

  public String allCameraInfo(){
    for (int i=0 ;i < bag.size() ; i++ ) {
      System.out.println(bag.get(i));
    }
    return bag.printDetails();
  }

}