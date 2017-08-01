import java.util.*;

public class Photographer {

  private String name;
  private ArrayList<Camera> bag;

  public Photographer(String name){
    this.name = name;
    this.bag = new ArrayList<Camera>();
  }

  public String getName(){
    return this.name;
  }

  public int cameraCount(){
    return this.bag.size();
  }

  public void addCamera(Camera camera){
    this.bag.add(camera);
  }
}