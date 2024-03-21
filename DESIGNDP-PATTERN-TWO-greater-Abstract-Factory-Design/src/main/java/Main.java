// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.*;
public class Main {
  public static void main(String[] args) {

    IVehicleFactory  factory1 = new DefenderFactory();
    IVehicleFactory  factory2 = new ScorpioFactory();
    Car car1 = new Car(factory1);
    Car car2 = new Car(factory2);

    Collection<Car> list = new ArrayList<Car>();
    list.add(car1);
    list.add(car2);

    for(Car c :  list){
      c.driveCar();
    } 
  }
}

// Abstract Factory Design Pattern
