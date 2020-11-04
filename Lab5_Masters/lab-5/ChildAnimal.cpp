#include "ChildAnimal.h"
#include <iostream>


/* ========== Dog ========== */

Dog::Dog() : Mammal() {};
Dog::Dog(string name, COLOR color, string owner) : Mammal(name, color) {
    _owner = owner;
};
Dog::~Dog() {
    cout << "Destructing Dog" << endl;
};

void Dog::speak() const {
    cout << "Dog Woof" << endl;
}

void Dog::move() const {
    cout << "Dog Moved" << endl;
}

void Dog::eat() const {
    cout << "Dog Eat" << endl;
}

/* ========== Cat ========== */

Cat::Cat() {};
Cat::Cat(string name, COLOR color) : Mammal(name, color) {}
Cat::~Cat() {
    cout << "Destructing Cat" << endl;
};

void Cat::speak() const {
    cout << "Cat Meow" << endl;
};

void Cat::move() const {
    cout << "Cat Moved" << endl;
}

void Cat::eat() const {
    cout << "Cat Eat" << endl;
}

/* ========== Lion ========== */

Lion::Lion() : Mammal() {};
Lion::Lion(string name, COLOR color) : Mammal(name, color) {};
Lion::~Lion() {
    cout << "Destructing Lion" << endl;
};

void Lion::speak() const {
    cout << "Lion Roar" << endl;
}

void Lion::move() const {
    cout << "Lion Eoved" << endl;
}

void Lion::eat() const {
    cout << "Lion Eat" << endl;
}
