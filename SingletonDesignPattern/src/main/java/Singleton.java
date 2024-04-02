// import java.awt.image.PixelInterleavedSampleModel;
// MultiThreading usage
public class Singleton {

  private static Singleton instance;

  private Singleton() {
    System.out.println("I'm inside the constructor");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public static void main(String[] args) {

    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance(); // Tried creating object twice but only created once which is correct but in
                                            // case of thread it's creating 2 objects which is violationg

    // Thread t1 = new Thread( () -> {
    // Singleton.getInstance();
    // } );

    // Thread t2 = new Thread( () -> {
    // Singleton.getInstance();
    // } );

    // t1.start();
    // t2.start();

  }
}
