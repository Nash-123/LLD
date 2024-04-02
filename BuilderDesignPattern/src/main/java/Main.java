
// Builder Design Pattern
// Client -> Provided Builder to Director -> Director provides Guidance steps to Builder -> Builder creates final object and provided to client.
// Remove Director if needed then steps performed by Builder
// While creating an object when there are series of steps involved we use the builder design pattern 
// Here we try to hide the process creation of an object 
// while creating aggregate obj or composite object we use this pattern
// When we want to create different types of object which has same construction process .
// Players:- Director -> Director Constructionof object 
//.. Builder:-
// End Final Object:- Builder
// import Models.ICar;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ICarBuilder builder = new ScorpioBuilder();
    ICarBuilder builder2 = new FortunerBuilder();
    Director director = new Director(builder);
    Director director2 = new Director(builder2);
    // guidance Dedo
    // director.carConstruct();

    Collection<Director> lst = new ArrayList<Director>();
    lst.add(director);
    lst.add(director2);

    for (Director b : lst) {
      b.carConstruct(false);

    }

    ICar car = builder.build();
    ICar car2 = builder2.build();

  }

}