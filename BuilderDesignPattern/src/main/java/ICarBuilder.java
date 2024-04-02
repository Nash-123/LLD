// import Models.ICar;

public interface ICarBuilder {
  public void buildEngine();

  public void buildChassis();

  public void buildTyre();

  public void buildBodyShell();

  // Below method imports the final Builder
  public ICar build();
}