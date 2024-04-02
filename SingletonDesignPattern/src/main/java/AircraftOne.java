// If there doesnt exist an object just create the object, if it exists then just return.
// Interview QA
// !!! Remember this singeleton method will fail in case of Multi Threads as for ex if 2 threads will be there out of which first thread will tru to get into if statement and then for it one object is created meanwhile a thread 2 is created dur to context switch and for it also another object will be created so , 2 objects will be created it will violate.
// 1. To prevent use Synchronization , which will tell to check over the Active threads going inside and if one thread tries to enter then it puts a lock and prevents the second one to enter
// This is expensive , system calls and interreaction with kernal
// 2. Second way is static Initialization to prevent it(This will create only a single object), impacts performance, dependancy management is also impacted
// 3. lazy initialization:- Initialization on demand

// New concept:- Double Checked Locking (If object aka instance nahi bana hai pehle se then Use lock ) and if object is not created from first then create object , use synchronization and put lock
// C++ -> Link to add lock 
// Java:- 2 Synchronized keywords are used 
// synchronised func(){
//   if (obj == null){
//     sync func() {
//        if (obj == null){
//           obj = new AircraftOne();
//        }
//     }
//   }
//   return obj;
// }
public class AircraftOne {

  private static AircraftOne aircraftInstance = null;

  private AircraftOne() {

  }

  synchronized static AircraftOne getInstance() {
    if (aircraftInstance == null) {
      aircraftInstance = new AircraftOne();
    }
    return aircraftInstance;
  }

}