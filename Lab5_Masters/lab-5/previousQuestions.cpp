#include "Animal.h"
#include "ChildAnimal.h"
#include <iostream>

int main_() {
    // Animal a;
    // a.speak();

    // Animal b("name", White);

    cout << endl;

    Mammal whale("Whale", Blue);
    whale.speak();
    whale.eat();

    cout << endl;

    Dog dog("Dog", Blue, "Biden");
    dog.speak();
    // the speak function is binded at compile time, which is why this specific function prints "Woof" and not the base definition

    dog.move();

    cout << endl << endl << "Part 3.3" << endl << endl;
    Animal *animalPtr = new Dog("Lassie", White, "Andy");
    animalPtr->speak();
    animalPtr->move();

    delete animalPtr;

    // Without the virtual keyword, the speak() function in the derived class will not override, thus calling the original based speak() function


    cout << endl << endl;

    Dog dogi("Lassie", White, "Andy");
    Mammal* aniPtr = &dogi;
    Mammal& aniRef = dogi;
    Mammal aniVal = dogi;
    aniPtr->speak();
    aniRef.speak();
    aniVal.speak();

    // output is:
    // Woof
    // Woof
    // Animal speaks

    // yes, this is expected
    // the first instance is making a reference to dogi, thus the speak() function of the pointer will call the function speak() of the derived class
    // the second instance is doing the exact same thing, making a pointer to dogi, thus the speak() function from the derived class will be called
    // the 3rd instance, we are declaring the value of aniVal to be mammal, thus the speak function will be of the based class





    cout << endl << endl << "Program exiting ... " << endl;

    return 0;
}