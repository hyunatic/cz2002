#include "Animal.h"
#include "ChildAnimal.h"

int main_() {
    // Animal a;
    // a.speak();

    // Animal b("name", White);

    cout << endl;

    Mammal Shark("Shark", Blue);
    Shark.speak();
    Shark.eat();

    cout << endl;

    //Dog Husky("Husky", Blue, "Trump");
    //Husky.speak();
    //Husky will print "Woof" since overwrites method from the Mammal Class

    //Husky.move();

    //cout << endl << endl << "Part 3.3" << endl << endl;
    //Animal* animalPtr = new Dog("Lassie", White, "Andy");
    //animalPtr->speak();
    //animalPtr->move();

    //delete animalPtr;

    // the speak() function will only be overridden by the child class if the keyword 'virtual' is applied to the function, thus calling the original based speak() function


    //cout << endl << endl;

    //Dog dogi("Lassie", White, "Andy");
    //Mammal* aniPtr = &dogi;
    //Mammal& aniRef = dogi;
    //Mammal aniVal = dogi;
    //aniPtr->speak();
    //aniRef.speak();
    //aniVal.speak();

    // Output is: Dog goes WOOF!, Dog goes WOOF! , Animal Speaks


    // yes, this is expected
    // the first instance is making a reference to dogi, thus the speak() function of the pointer will call the function speak() of the derived class
    // the second instance is doing the exact same thing, making a pointer to dogi, thus the speak() function from the derived class will be called
    // the 3rd instance, we are declaring the value of aniVal to be mammal, thus the speak function will be of the based class



    cout << endl << endl << "Program exiting ... " << endl;

    return 0;
}