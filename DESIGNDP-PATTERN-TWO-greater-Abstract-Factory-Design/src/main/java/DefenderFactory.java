public class DefenderFactory implements IVehicleFactory{
  public IEngine createEngine(){
    System.out.println("Defender ka Engine bana raha hu");
    return new DefenderEngine();
  }
}