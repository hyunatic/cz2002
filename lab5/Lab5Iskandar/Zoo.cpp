#include "Animal.h"
#include "ChildAnimal.h"
#include <iostream>

int main() {
    int option = 0;

    Mammal* zoo[100];
    int count = 0;

    // this will not work with an array of Animal objects because
    // Pointers cannot use the . operator unless we deference the pointer
    // animal class does not have eat function

    // Animal class will work, if don't call the eat() function

    while (option != 5) {
        cout << "Select the animal to send to Zoo:" << endl << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;

        do {
            if (cin.fail()) {
                cin.clear();
                cin.ignore(80, '\n');
                cout << "Invalid input, please select 1 to 5" << endl;
            }
            cin >> option;
        } while (cin.fail());

        cout << endl;

        switch (option) {
        case 1:
            zoo[count++] = new Dog();
            cout << "Dog added" << endl;
            break;
        case 2:
            zoo[count++] = new Cat();
            cout << "Dog added" << endl;
            break;
        case 3:
            zoo[count++] = new Lion();
            cout << "Lion added" << endl;
            break;
        case 4:
            for (int i = 0; i < count; i++) {
                zoo[i]->move();
                zoo[i]->speak();
                zoo[i]->eat();
                cout << endl;
            }
            break;
        case 5:
            cout << endl << "Exiting Program" << endl << endl;
            break;
        default:
            cout << "   !! Alert !!   " << endl << "Please enter a number from 1 to 5" << endl;
            break;
        }
    }

    return 0;
}
