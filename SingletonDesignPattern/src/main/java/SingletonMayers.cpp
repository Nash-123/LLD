#include<iostream>
using namespace std;
class Singleton {

  private:
   Singleton(){
     cout << "Creating Object" << endl;
   }

   public:
     static Singleton& getInstance(){
        static Singleton instance; // Creating object using stack, will automatically get destroyed and instantiated on completion of utility
       return instance;
     }

   // I want no one can Copy using copy constructor it and it cant be intantiated, remove equal to operator also
   Singleton(Singleton const&) = delete;
   Singleton &operator = Singleton const& = delete;
   
}


int main(){
  Singleton &s1 = Singleton::getInstance();
  cout << &s1 << endl;
  Singleton &s2 = Singleton::getInstance();
  cout << &s2 << endl;


  return 0;
}