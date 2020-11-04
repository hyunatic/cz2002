#include <iostream>
#include <string>
#include <list>
using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };
class Animal
{
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

private:
	string _name;
	COLOR _color;
};