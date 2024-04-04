// If there are two Incompatble Interface classes and you want to make connection between those then use the Adapter pattern.
// //   public void start(String gas) { // Has one parameter gas and it's //somehwo implemented by Adapter
//   System.out.println("Hot Air balloon is starting");
// }
// Ex:- Icar is compatable with Alto, Fortuner, Scorpio but not with Hot Air Baloon.
// The communication between Icar and Hot Air baloon will be done by Adapter.
// Icar can make a request to get some methods from Adapter and Adapter will get it from Hot Air baloon, Hot air baloon won't have any clue about the adapter.
// Middle man example to resolve issue of property between 2 people.
// Best examples is conversion of XML to JSON format using Adapter

public class Main {
  public static void main(String[] args) {
    HotAirBaloon hotAirbaloon = new HotAirBaloon();
    Adapter adapter = new Adapter(hotAirbaloon);
    adapter.start();
  }

}