public class ScorpioFactory implements IVehicleFactory {
    public IEngine createEngine(){ // IEngine here is reference 
      System.out.println("Scorpio ka Engine Bana raha hu");
      return new ScorpioEngine(); // Implementation 
    }
  
}