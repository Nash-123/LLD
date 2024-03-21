import src.main.java.Models.*;

public class ScorpioN extends Scorpio {

  IEngine engine;
  IBodyShell bodyshell;

  @Override
  public void makeScorpio() {
    System.out.println("Scorpio N class me hu");
    this.engine = new ScorpioNEngine();
    this.bodyshell = new ScorpioNBodyShell();
  }

  @Override
  public void driveCar() {
    makeScorpio();
    System.out.println("I am driving a ScorpioN");
  }
}