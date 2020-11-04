#include <iostream>
#include <string>
#include <map>

using namespace std;
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
	void setName(string iname) {
		_name = iname;
	}
	void setColor(COLOR icolor)
	{
		_color = icolor;
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

	// mammal class

};