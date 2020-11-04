# pragma once
#include <iostream>
#include <map>
#include "Animal.h"
using namespace std;
<<<<<<< HEAD:lab5/lab5ZW/lab5New/Animal.cpp
enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
public:
	Animal() : _name("unknown") {
		cout << "constructing base Animal object " << _name << endl;
	}
	Animal(string n, COLOR c): _name(n), _color(c) {
		cout << _name << colorMapper(_color) <<" Constructor Animal"<< endl;
	}
	~Animal() {

		cout << "destructing Animal object " << _name << endl;
	}

	//allow dynamic binding / polymorphism ( Overrriding is allowed ) 
	// not sure if can remove const or not please check
	virtual void speak() const {
		cout << "Animal speaks " << endl;
	}
	void setName(string name) {
		_name = name;
	}
	void setColor(COLOR color)
	{
		_color = color;
	}
	string getName() {
		return _name;
	}
	COLOR getColor() {
		return _color;
	}
	// makes animal an abstract class. hence the other functions must have implementation.
	virtual void move() = 0;
	string colorMapper(COLOR color) {
		switch (color)
		{
		case Green:
			return "Green";
			break;

		case Blue:
			return "Blue";
			break;

		case White:
			return "White";
			break;

		case Black:
			return "Black";
			break;

		case Brown:
			return "Brown";
			break;
		}
	}

private:
	string _name;
	COLOR _color;
=======
>>>>>>> 03a1d5cda2f05105e8f4f00bfef29ee5bf6c5aa2:lab5ZW/lab5New/Animal.cpp



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
