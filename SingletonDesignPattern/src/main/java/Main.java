// Singleton -> Enforce -> Single Object Creation(Application Lifetime)
// Used in Thread Pools
// Used for Concurrency Control and Remove Inconsistency in a thread pool
// Make the constructor of the class as Private and then you cant create an object like abc a = new abc();
// Will have to use the static keyword in a getter method to call a method in a class without creating an object
// Fighter Jet -> Aircraft One
// Static is a class Property
// Realtime Example:- Suppose in an Ecommerce website we want to return/replace a product then we have it's product ID and using that we share to another service through an API call which gives product details, for making that API call we'll need a client that is where Singleton Pattern comes to play.

public class Main {
  public static void main(String[] args) {

  }

}

// How to create Singleton:-
// Create a Reference
// Make Constructor private so that it cant be used by child class
// make a getter method with static keyword so that it's a class property and
// not object's property and object creation wont be needed.
