#include "ChildAnimal.h"

Cat::Cat() {
	cout << "Constructing Cat" << endl;
}
Cat::Cat(string n, COLOR c) {
	cout << n << Animal::getColorArray() << " Cat with Color" << endl;
};
Cat::~Cat(){
	cout << "Destroying Cat " << endl;
}
void Cat::eat() {
	cout << "Cat Eat fish" << endl;
}
void Cat::move() {
	cout << "Cat Moves" << endl;
}
void Cat::speak() {
	cout << "Cat Meow" << endl;
}

Dog::Dog() {
	cout << "Constructing Cat" << endl;
}
Dog::Dog(string n, COLOR c, string o) {
	cout << n << Animal::getColorArray() << " Dog with Color and owner" << endl;
}
Dog::~Dog() {
	cout << "Destroying Dog " << endl;
}
void Dog::eat() {
	cout << "Cat Eat food" << endl;
}
void Dog::move() {
	cout << "Dog JUMP JUMP" << endl;
}
void Dog::speak() {
	cout << "Dog goes WOOF!" << endl;
}

Lion::Lion() {
	cout << "Constructing Lion" << endl;
}
Lion::Lion(string n, COLOR c) {
	cout << n << Animal::getColorArray() << " Lion with Color" << endl;
};
Lion::~Lion() {
	cout << "Destroying Lion " << endl;
}
void Lion::eat() {
	cout << "Lion Eat Deer" << endl;
}
void Lion::move() {
	cout << "Lion Chases" << endl;
}
void Lion::speak() {
	cout << "Lion Roar!" << endl;
}
