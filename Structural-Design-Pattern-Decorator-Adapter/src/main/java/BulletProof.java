// public class BulletProof extends ScorpioDecorator
public class BulletProof implements ScorpioDecorator {

  Icar scorpio;

  public BulletProof(Icar myScorpio) {
    this.scorpio = myScorpio; // Reference is only copied
  }

  @Override
  public void start() {
    scorpio.start();
  }

  @Override
  public void stop() {
    scorpio.stop();
  }

  public float getWeight() {
    return 300f + scorpio.getWeight();
  }

}