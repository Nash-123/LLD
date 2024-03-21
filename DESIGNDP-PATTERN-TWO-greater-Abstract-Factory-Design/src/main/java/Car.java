// Abstract Layer

public class Car {

  IVehicleFactory carFactory;

  Car(IVehicleFactory factory){
    this.carFactory = factory;
  }

  public void driveCar(){
  
    engine = carFactory.createEngine();
    System.out.println("Mil Gayi Gaddi, Chillz");
    
  }
}
