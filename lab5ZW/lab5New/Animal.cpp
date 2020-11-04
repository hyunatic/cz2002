# pragma once
#include <iostream>
#include <map>
#include "Animal.h"
using namespace std;



// Animal Constructors
Animal::Animal() : _name("unknown") {
	cout << "constructing base Animal object " << _name << endl;
}
Animal::Animal(string n, COLOR c): _name(n), _color(c) {
	cout << _name << getColorName() <<" Constructor Animal"<< endl;
}
Animal::~Animal() {

	cout << "Destructuring Animal object " << _name << endl;
}
// Animal Functions
void Animal::speak() const {
	cout << "Animal speaks " << endl;
}
//no need to implement move() since it is pure virtual
//Mammal Constructors
Mammal::Mammal() {
	cout << "construct Mammal object " << endl;

}
// inherit from animal
Mammal::Mammal(string n, COLOR c) :Animal(n, c) {
	cout << n  << " Constructor Mammal" << endl;
}
Mammal::~Mammal() {
	cout << "destructing Mammal object " << endl;
}
void Mammal::eat() const {
	cout << "Mammal eat" << endl;
}
void Mammal::move() const {
	cout << "move mammal" << endl;
}
