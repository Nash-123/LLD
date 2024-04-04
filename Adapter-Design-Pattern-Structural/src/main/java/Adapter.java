public class Adapter implements ICar {

  HotAirBaloon baloon;

  public Adapter(HotAirBaloon _baloon) {
    this.baloon = _baloon;
  }

  @Override
  public void start() {
    String gasToBeUsed = baloon.getGasUsed(); // parameter present in HotAIrBaloon is somehow taken by adapter class
    baloon.start(gasToBeUsed); // Parameter is now passed and somehow used
  }

}