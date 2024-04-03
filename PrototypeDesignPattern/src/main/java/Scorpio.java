public class Scorpio implements IScorpioPrototype, Cloneable {
  // Default Engine
  ScorpioEngine engine = new ScorpioEngine();

  @Override
  public void start() {
    System.out.println("Scorpio has started");
  }

  // you can only clone and return the prototype
  @Override
  public IScorpioPrototype clone() {
    // return new Scorpio();
    // try { // Shallow Copy
    // (Scorpio) super.clone();
    // } catch (CloneNotSupportedException e) {
    // throw new AssertionError();
    // }

  }

  @Override
  public void setEngine(ScorpioEngine _engine) {
    this.engine = _engine;
  }

}

// // Deep Copy Implementation

// public class Scorpio implements IScorpioPrototype, Cloneable {
//   // Default Engine
//   ScorpioEngine engine;

//   // Default Engine is inserted
//   public Scorpio() {
//     this.engine = new ScorpioEngine();
//   }

//   private Scorpio(ScorpioEngine engine) {
//     // Deep Copy - copy Constructor
//     this.engine = new ScorpioEngine(engine);
//   }

//   @Override
//   public void start() {
//     System.out.println("Scorpio has started");
//   }

//   // you can only clone and return the prototype
//   @Override
//   public IScorpioPrototype clone() {

//     IScorpioPrototype clonedScorpio = new Scorpio(this.engine); // Here this.engine is returning a different reference
//                                                                 // as ScorpioEngine instead of returning Scorpio , it's
//                                                                 // basically getting replaced . Henceforth it's Deep
//                                                                 // copy.
//     return clonedScorpio;

//   }

//   @Override
//   public void setEngine(ScorpioEngine _engine) {
//     this.engine = _engine;
//   }

// }