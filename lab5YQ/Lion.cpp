#include "Mammal.cpp"
class Lion :public Mammal
{
public:
	Lion() {
		cout << "Lion constructor" << endl;
	}
	Lion(string n, COLOR c) :Mammal(n, c) {

	}
	~Lion() {
		cout << " Lion destructor" << endl;
	}
	void move() {
		cout << " Lion Move" << endl;
	}
	void speak() {
		cout << "Lion Roar " << endl;
	}
	void eat() {
		cout << "Lion eat " << endl;
	}
};