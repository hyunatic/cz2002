#include "Mammal.cpp"
class Cat:public Mammal
{
public:
	Cat() {
		cout << "Cat constructor" << endl;
	}
	Cat(string n, COLOR c) :Mammal(n, c) {

	}
	~Cat() {
		cout << " Cat destructor" << endl;
	}
	void move() {
		cout << " Cat Move" << endl;
	}
	void speak() {
		cout << "Cat Meow " << endl;
	}
	void eat() {
		cout << "Cat eat " << endl;
	}
};