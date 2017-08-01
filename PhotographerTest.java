import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

  @Before
  public void before(){
    photographer = new Photographer("Greg");
    camera = new Camera();
  }

  @Test
  public void getName(){
    assertEquals("Greg", photographer.getName());
  }

  @Test
  public void canCamera(){
    photographer.addCamera(camera);
    assertEquals(1, photographer.cameraCount());
  }
}