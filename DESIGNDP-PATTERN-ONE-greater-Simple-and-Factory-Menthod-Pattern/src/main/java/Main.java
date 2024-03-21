// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// public class Main {
//   public static void main(String[] args) {

//     // ScorpioN obj1 = new ScorpioN();
//     // obj1.driveCar();

//     // ScorpioClassic obj2 = new ScorpioClassic();
//     // obj2.driveCar();

// Simple Factory:- Not a Good Approach
//     // ScorpioFactory factory = new ScorpioFactory();
//     // Scorpio Manufacture = factory.createScorpio('N');
//     // Manufacture.driveCar();

//     // Simple Factory:- Not a Good Approach
//   }
// }

import java.util.ArrayList;
import java.util.Collection;

public class Main {
  public static void main(String[] args) {

    Collection<Scorpio> ScorpioList = new ArrayList<Scorpio>();
    Scorpio car1 = new ScorpioN();
    Scorpio car2 = new ScorpioClassic();
    ScorpioList.add(car1);
    ScorpioList.add(car2);

    for (Scorpio car : ScorpioList) {
      car.driveCar();
    }

    // Factory Design Pattern
  }
}