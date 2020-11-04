#ifndef ANIMAL_H
#define ANIMAL_H
#include <iostream>
#include <string>
#include <list>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };
class Animal{
public:
	Animal();
	Animal(string n, COLOR c);
	~Animal();
	virtual void speak() const;
	virtual void move() const = 0;

	void setName(string name);
	void setColor(COLOR color);
	string getName() { return _name; };
	COLOR getColor() { return _color; };

	string getColorArray() { return array_color[_color]; };

private:
	string _name;
	COLOR _color;
	const string array_color[5] = { "Green", "Blue", "White", "Black", "Brown" };
};

class Mammal : public Animal {
public:
	Mammal();
	Mammal(string n, COLOR c);
	~Mammal();
	virtual void eat();
	void move() const;
};

#endif