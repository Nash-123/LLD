public class Director {

  ICarBuilder builder;

  Director(ICarBuilder builder) {
    this.builder = builder;
  }

  public void carConstruct(boolean engineNeeded, boolean chassisNeeded, boolean tyreNeeded, boolean bodyNeeded) {
    if (engineNeeded) {
      builder.buildEngine();
    }
    if (tyreNeeded) {
      builder.buildChassis();
    }
    if (chassisNeeded) {
      builder.buildTyre();
    }
    if (bodyNeeded) {
      builder.buildBodyShell();
    }
  }
}