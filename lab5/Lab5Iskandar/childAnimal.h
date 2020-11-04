#include "Animal.h"

class Cat : public Mammal {
public:
	Cat();
	Cat(string n, COLOR c);
	~Cat();
	void move();
	void speak();
	void eat();
};

class Dog : public Mammal {
public:
	Dog();
	Dog(string n, COLOR c, string o);
	~Dog();
	void move();
	void speak();
	void eat();
	void setOwner(string o) { owner = o; };
	string getOwnder() { return owner; };
private:
	string owner;
};

class Lion : public Mammal {
public:
	Lion();
	Lion(string n, COLOR c);
	~Lion();
	void move();
	void speak();
	void eat();
};