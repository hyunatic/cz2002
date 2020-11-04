#include <iostream>
#include <string>
#include <list>
#include "Animal.h"

using namespace std;

Animal::Animal() : _name("unknown") {
            cout << "constructing Animal object " << _name << endl;
        }

Animal::Animal(string n, COLOR c) {
            _name = n;
            _color = c;
            cout << "Constructor:" << endl << "animal name: " << _name << endl << "animal color: " << getColorName() << endl;
        }

Animal::~Animal() {
    cout << "destructing Animal object " << _name << endl;
}

void Animal::speak() const {
    cout << "Animal Speaks" << endl;
};

// this is unnecessary because the function is pure
void Animal::move() const {};

Mammal::Mammal() {};
Mammal::Mammal(string name, COLOR color) : Animal(name, color) {};
Mammal::~Mammal() {};

void Mammal::eat() const {
    cout << "Mammal Eat" << endl;
};

void Mammal::move() const {
    cout << "Mammal Moved" << endl;
};
