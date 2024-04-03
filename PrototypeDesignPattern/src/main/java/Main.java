// Prototype Pattern:- How to create an new Object using an Existing Object or by copying an existing object
// This will be used to reduce the resources usage.
// This has no relation with no of classes , Only to be used when there are complex objects being created and having interaction and take a lot of resources then only use.
// Client -> prototype -> Clone -> Client -> Customization -> Setters use ->> Setters again present in -> Prototype
// Car Prototype -> 1. Fortuner Prototype 2. Scorpio Prototype -> Fortuner C class , Fortuner S class . 3. Scorpio -> Scorpio N, Scorpio Classic ....
// Below code is a clear example of shallow copy being done , as because here if we creaye a Scorpio engine = new ScorpioEngine() ,
// If the Scorpio N engine uses the same ScorpioEngine then it's shallow copy 
// It will be deep copy only when the Scorpio N engine will replace the Scorpio engine and replace with it's own engine.
// Circular Reference means :- There's one attribute object of Scorpio that will depend on Fortuner again one attribute object of Fortuner will depend on Scorpio and this goes on in a circular pattern...

  public static void main(String[] args) {

    // Create the prototype 
    IScorpioPrototype prototype = new Scorpio();

    // Create the Scorpio classic Engine 
    IScorpioPrototype scorpioClassic = prototype.clone();
    scorpioClassic.setEngine(new ScorpioClassicEngine());

    // Create the scorpio N engine 
    IScorpioPrototype scorpioN = prototype.clone();
    scorpioN.setEngine(new ScorpioNEngine());
    
  }
