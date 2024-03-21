import src.main.java.Models.*;

public class ScorpioClassic extends Scorpio {

  IEngine engine;
  IBodyShell bodyShell;

  @Override
  public void makeScorpio() {
    System.out.println("Scorpio classic Class me hu");
    this.engine = new ScorpioClassicEngine();
    this.bodyShell = new ScorpioClassicBodyShell();
  }

  @Override
  public void driveCar() {
    makeScorpio();
    System.out.println("I am driving a Scorpio Classic");
  }
}