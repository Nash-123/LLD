// This is Decorator Pattern
// Focuses on Structure of classes , Doesnt focus on Objects Creation aka Creational design Pattern
// We can add a new Functionality without modifying the entire system
// Client want Bullet proof Scorpio 
// Client -> Scorpio (Implements ICar) 
// Client -> Provides Scorpio to BPDecorator (Implements IDecorator)
// Now BPDecorator bullet proofs it and provides it back to client.
// When to a Class having all essential Features I want to add Non Essential Features like bullet Proof or etc, then we use Decorator.
// Focuses on Adding Functionalities, Properties and  Behaviours to our existing class.
// Provides an Alterative to Subclassing
public class Main {
  public static void main(String[] args) {

    Icar scorpio = new Scorpio();
    Icar bulletProofScorpio = new BulletProof(scorpio);
    float totalWeight = bulletProofScorpio.getWeight();
    System.out.println("Total weight of Scorpio is " + totalWeight);

  }

}