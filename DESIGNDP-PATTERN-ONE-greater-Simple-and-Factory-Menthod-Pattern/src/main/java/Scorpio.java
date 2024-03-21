import src.main.java.Models.*;

public class Scorpio {

  IEngine engine;
  IBodyShell bodyShell;

  public void makeScorpio() {
    System.out.println("Scorpio Class me hu");
    this.engine = new ScorpioEngine();
    this.bodyShell = new ScorpioShell();
  }

  public void driveCar() {
    makeScorpio();
    System.out.println("I am inside a Scorpio Parent class");
  }
}