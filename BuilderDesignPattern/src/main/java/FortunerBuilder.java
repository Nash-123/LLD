// import Models.ICar;
// import Models.Fortuner;

public class FortunerBuilder implements ICarBuilder {

  Fortuner s2;

  @Override
  public void buildEngine() {
    System.out.println("Fortuner ENgine getting Inserted");
  }

  @Override
  public void buildChassis() {
    System.out.println("Fortuner Chassis getting Inserted");
  }

  @Override
  public void buildTyre() {
    System.out.println("Fortuner Tyre getting Inserted");
  }

  @Override
  public void buildBodyShell() {
    System.out.println("Fortuner BodyShell getting Inserted");
  }

  @Override
  public ICar build() {
    System.out.println("Fortuner is ready, take away...");
    return s2;
  }

}