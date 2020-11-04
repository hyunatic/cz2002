#include "childAnimal.h"
#include <iostream>

	Dog::Dog() :Mammal() {
		cout << "Constructing dog" << endl;
	}
	Dog::Dog(string name, COLOR color, string i_owner) :Mammal(name, color) {
		owner = i_owner;
		cout <<"Dog is named "<< name << "Color is"<<getColorName() <<"Owner is"<< owner << " Constructor Dog" << endl;
	}
	Dog::~Dog() {
		cout << "Dog destructor" << endl;
	}
	void Dog::speak() const {
		cout << "Dog WOOF " << endl;
	}
	void Dog::move() const {
		cout << "Dog Move" << endl;
	}
	void Dog::eat() const {
		cout << "Dog Eat " << endl;
	}

// Q 4

	Cat::Cat() {
		cout << "Cat constructor" << endl;
	}
	Cat::Cat(string n, COLOR c) :Mammal(n, c) {
		cout << "Name is "<<n <<"Color is"<< getColorName() << " Constructor Cat" << endl;
	}
	Cat::~Cat() {
		cout << " Cat destructor" << endl;
	}
	void Cat::move() const{
		cout << "Cat Move" << endl;
	}
	void Cat::speak() const{
		cout << "Cat Meow " << endl;
	}
	void Cat::eat() const{
		cout << "Cat eat " << endl;
	}


	Lion::Lion() {
		cout << "Lion constructor" << endl;
	}
	Lion::Lion(string n, COLOR c) :Mammal(n, c) {
		cout <<"Name is"<< n<<"Color is"<<getColorName()<<"Lion constructed with mammal inheritance" << endl;
	}
	Lion::~Lion() {
		cout << " Lion destructor" << endl;
	}
	void Lion::move() const {
		cout << "Lion Move" << endl;
	}
	void Lion::speak() const {
		cout << "Lion Roar " << endl;
	}
	void Lion::eat() const {
		cout << "Lion eat " << endl;
	}
