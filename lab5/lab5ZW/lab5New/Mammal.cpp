#include "Animal.cpp"
class Mammal: public Animal
{
	// or getter and setter method
	string _name;
	string _color;
public:
	Mammal() {
	}
	//only implemeneted dynamic loading 
	// get name and color dynamically from base class animal
	Mammal(string n, COLOR c) :Animal(n, c) {
		_name = n;
		_color = c;
		cout << _name << _color << endl;
	}
	~Mammal() {
		cout << "destructing Mammal object " <<  endl;
	}
	void eat() const {
		cout << "Mammal eat" << endl;
	}
	// or getter and setter method
	string getName() {
		return _name;
	}
	void setName(string name) {
		_name= name;
	}
};


