// import Models.Scorpio;
// import Models.ICar;

public class ScorpioBuilder implements ICarBuilder {

  Scorpio s1;

  @Override
  public void buildEngine() {
    // s1.engine = new ScorpioEngine();
    System.out.println("Scorpio ENgine getting Inserted");
  }

  @Override
  public void buildChassis() {
    // s1.tyre = new ScorpioTyre();
    System.out.println("Scorpio Chassis getting Inserted");
  }

  @Override
  public void buildTyre() {
    // s1.chassis = new ScorpioChassis();
    System.out.println("Scorpio Tyre getting Inserted");
  }

  @Override
  public void buildBodyShell() {
    //s1.body = new ScorpioBody();
    System.out.println("Scorpio BodyShell getting Inserted");
  }

  @Override
  public ICar build() {
    System.out.println("Scorpio is ready, take away....");
    return s1;
  }

}