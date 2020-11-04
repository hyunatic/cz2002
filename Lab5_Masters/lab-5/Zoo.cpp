#include "Animal.h"
#include "ChildAnimal.h"
#include <iostream>

int main() {
    // previousQuestions();
    int choice = 0;

    Mammal* zoo[100];
    int count = 0;

    // this will not work with an array of Animal objects because
    // animal classes do not define any eat function

    // for an array of Animal class to work, we cannot call the .eat() function

    while (choice != 5) {
        cout << "Select the animal to send to Zoo:" << endl << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;

        do {
            if (cin.fail()) {
                cin.clear();
                cin.ignore(80, '\n');
                cout << "Invalid input, please select 1 to 5" << endl;
            }
            cin >> choice;
        } while (cin.fail());

        cout << endl;

        switch (choice) {
        case 1:
            // mammal.push_back(dog);
            zoo[count++] = new Dog();
            cout << "dog added" << endl;
            break;
        case 2:
            // mammal.push_back(cat);
            zoo[count++] = new Cat();
            cout << "cat added" << endl;
            break;
        case 3:
            // mammal.push_back(lion);
            zoo[count++] = new Lion();
            cout << "lion added" << endl;
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
