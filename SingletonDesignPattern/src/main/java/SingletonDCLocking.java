// Singleton Double Check Locking
// Object will be created on

public class SingletonDCLocking {

  private volatile static SingletonDCLocking instance; // Used volatile here to protect the thread

  private SingletonDCLocking() 
  System.out.println("Object is created");

  }

  synchronized public static SingletonDCLocking getInstance() {
    if (instance == null) {
      synchronized (SingletonDCLocking.class) {
        if (instance == null) {
          instance = new SingletonDCLocking();
        }
      }
    }
    return instance;
  }

  public static void main(String[] args) {

    Thread t1 = new Thread(() -> {
      SingletonDCLocking.getInstance();
    });

    Thread t2 = new Thread(() -> {
      SingletonDCLocking.getInstance();
    });

    t1.start();
    t2.start();

  }

}
