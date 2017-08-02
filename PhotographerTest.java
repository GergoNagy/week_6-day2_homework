import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before(){
    photographer = new Photographer("Greg");
    digitalCamera = new DigitalCamera("Nikon", "D7100");
    analogCamera = new AnalogCamera("Canon", "700D");
  }

  @Test
  public void getName(){
    assertEquals("Greg", photographer.getName());
  }

  @Test
  public void canCamera(){
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    assertEquals(2, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(digitalCamera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrint(){
    photographer.addCamera(digitalCamera);
    assertEquals("I have a Nikon, D7100", photographer.allCameraInfo());
  }

}
