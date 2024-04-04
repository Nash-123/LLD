public class Scorpio implements Icar {
  @Override
  public void start() {
    System.out.println("Scorpio Is starting");
  }

  @Override
  public void stop() {
    System.out.println("Scorpio is stopped");
  }

  @Override
  public float getWeight() {
    return baseWeight;
  }
}