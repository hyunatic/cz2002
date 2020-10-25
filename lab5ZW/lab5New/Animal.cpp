#include <iostream>
#include <string>

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
	virtual void speak()  {
		cout << "Animal speaks " << endl;
	}
	void move() const { }
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
class Mammal : public Animal
{
	// or getter and setter method
	string _name;
	COLOR _color;
public:
	Mammal():Animal() {
		cout << "Constructing Mammal" << endl;
	}
	// only implemeneted dynamic loading 
	// commented out get name and color dynamically from base class animal // it works though
	Mammal(string n, COLOR c):Animal(n,c) {
		//Animal::setName(n); 
		//Animal::setColor(c);
		//_name = Animal::getName();
		//_color = Animal::getColor();
		cout << n << Animal::colorMapper(c) << " Constructor Mammal"<<endl;
	}
	~Mammal() {
		cout << "destructing Mammal object " << endl;
	}
	virtual void eat()  {
		cout << "Mammal eat" << endl;
	}
	virtual void move() {
		cout << "move mammal" << endl;
	}
};
class Dog :public Mammal
{
	string owner;
	string objName;
	COLOR objColor;
public:
	Dog() :Mammal() {
		cout << "Constructing dog" << endl;
	}
	Dog(string name, COLOR color, string i_owner):Mammal(name,color) {
		owner = i_owner;
		//objName = name;
		//objColor = color;
		cout << name << Animal::colorMapper(color) << owner << " Constructor Dog"<< endl;

	}
	~Dog() {
		cout << "Dog destructor" << endl;
	}
	void speak() {
		cout << "Dog WOOF " << endl;
	}
	void move() {
		cout << "Dog Move" << endl;
	}
	void eat() {
		cout << "Dog eat " << endl;
	}
};
// Q 4
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


int main() {
	//3.1 & 3.2
	//Because animal is now an abstract pure class, there are pure functions that have not been implemented
	// hence we cannot instantiate objects from the animal base class, as these objects would have undefined/ unimplemented move() function which would error in some cases.
	//Animal a; //3.1
	//a.speak(); //3.1
	//Animal b("Animal2 is ",Blue); //3.1
	//3.2 
	//Mammal mammal_1("Mammal is ",Blue);
	//mammal_1.speak();
	//dog fuctions are being referenced correctly
	Dog dog_1("JackTerrier ", Green, " ZhenWei");
	dog_1.speak();
	dog_1.move();
	// 3.3
	//3.3 1) Constructors for Animal, Mammal and Dog are called
	// Animal speaks  is called, while move dog is called. 
	// this is because move is not implemented in animal.
	// hence the dog implementation of move is called.
	// as for speaks, because this pointer is initially an
	// Animal class, it calls the animal speak.
	//downcasting
	Animal *animalPtr = new Dog("Lassie", White, "Andy");
	//check if downcasting is ok
	Dog* dog1 = dynamic_cast<Dog*>(animalPtr);
	if (dog1 != NULL) {
		cout << "valid cast" << endl;
	}
	// 1c) when virtual keyword is removed from speak
	// animal speak is called. polymorphic effect is removed
	// this is observed when const is removed .
	// if const is not removed, there is no difference. 
	// both will call the animal speak .
	animalPtr->speak();
	animalPtr->move();
	delete animalPtr;
	//3.3 Part 3
	// with const output is all Animal speak.
	// ///speak class is virtual , it is a virtual function with implementation
	// being a virtual function, subclasses can override it for dynamic
	//binding.
	//Dog dogi("Lassie", White, "Andy");
	//Mammal *aniPtr = &dogi;
	//Mammal &aniRef = dogi;
	//Mammal aniVal = dogi;
	//aniPtr->speak();
	//aniRef.speak();
	//aniVal.speak();	// output currently is all animal speak because speak() is not implemented in mammal
	cout << "Program exiting …. " << endl;
	//4) The array will not work when it is array of animal object.
	// 
	Mammal **zoo= new Mammal*[3];
	zoo[0] = new Dog();
	zoo[1] = new Cat();
	zoo[2] = new Lion();
	int choice = 1;
	do
	{
		cout << "Select the animal to send to Zoo :" << endl;
		cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
		cin >> choice;
		// when there is a new there should be a delete

		switch (choice)
		{
		case 1:
			zoo[0]->move();
			zoo[0]->speak();
			zoo[0]->eat();
			cout << "Sent dog to zoo" << endl;
			break;
		case 2:
			zoo[1]->move();
			zoo[1]->speak();
			zoo[1]->eat();
			cout << "Sent cat to zoo" << endl;
			break;
		case 3:
			zoo[2]->move();
			zoo[2]->speak();
			zoo[2]->eat();
			cout << "Sent lion to zoo" << endl;
			break;
		case 4:
			for (int i = 0; i < 3; i++)
			{
				zoo[i]->move();
				zoo[i]->speak();
				zoo[i]->eat();
			}
			cout << "move all animals" << endl;
			break;
		case 5:
			cout << "Exit" << endl;
			break;
		}
	} while (choice != 5);
	//delete pointer, free memory
	for (int i = 0; i < 3; i++)
	{
		delete zoo[i];
	}
	system("pause");
	return 0;
}