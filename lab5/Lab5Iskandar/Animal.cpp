#include <iostream>
#include "Animal.h"
using namespace std;

Animal::Animal() : _name("unknown") {
	cout << "Constructing Animal Object" << _name << endl;
}
Animal::Animal(string name, COLOR color) {
	_name = name;
	_color = color;
	cout << "Constructor:" << endl << "animal name: " << _name << endl << "animal color: " << _color << endl;
}
Animal::~Animal() {
	cout << "destructing Animal object " << _name << endl;
}
void Animal::speak() const {
	cout << "Animal Speaks" << endl;
};
void Animal::move() const {};

Mammal::Mammal() {
	cout << "Constructing Mammal" << endl;
}
Mammal::Mammal(string n, COLOR c) : Animal(n,c){
	cout << n << getColorArray() << " Constructor Mammal with color" << endl;
};
Mammal::~Mammal() {
	cout << "Destroying Mammal " << endl;
}
void Mammal::eat(){
	cout << "Mammal Eats" << endl;
}
void Mammal::move() const {
	cout << "Mammal Moves" << endl; 
}
