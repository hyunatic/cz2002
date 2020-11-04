#include "Mammal.h";

Mammal::Mammal() {
	cout << "Constructing Mammal" << endl;
};
Mammal(string n, COLOR c) {
	cout << n << Animal::colorMapper(c) << " Constructor Mammal" << endl;
}