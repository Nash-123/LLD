// Multi Threading safety Achieved here using initializtion on demand
public class SingletonLazyInitialization {

  private SingletonLazyInitialization() {
    System.out.println("Instance Created");
  } // Private ctor

  private static class Holder { // Nested class for Lazy

    // Final use to not change instance value, INSTANCE in caps as final is used ,
    // Object INSTANCE initialized inside the nested class
    private static final SingletonLazyInitialization INSTANCE = new SingletonLazyInitialization();
  }

  // above obj wont work untill this line is called. Early initializtion not done
  // here
  public static SingletonLazyInitialization getInstance() {
    return Holder.INSTANCE;
  }

  public static void main(String[] args) {

    Thread t1 = new Thread(() -> {
      SingletonLazyInitialization.getInstance();
    });

    Thread t2 = new Thread(() -> {
      SingletonLazyInitialization.getInstance();
    });

    t1.start();
    t2.start();

  }

}
