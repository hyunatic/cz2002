#include "ZooMain.h"
#include <iostream>
#include <string>
#include <map>
#include "Animal.h"
#include "childAnimal.h"
using namespace std;
int main() {
	// output currently is all animal speak because speak() is not implemented in mammal
	cout << "Program exiting... " << endl;
	//4) The array will not work when it is array of animal object.


	Mammal* zoo[150];
	int count = 0;
	//must remember to delete.
	int choice = 1;
	do
	{
		cout << "Select the animal to send to Zoo :" << endl;
		cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
		cin >> choice;
		// when there is a new there should be a delete
		string name;
		string color;
		string owner;
		std::map<std::string, COLOR> nodeMap;
		//make a hash map to map input string to enum color
		nodeMap["White"] = COLOR::White;
		nodeMap["Green"] = COLOR::Green;
		nodeMap["Black"] = COLOR::Black;
		nodeMap["Brown"] = COLOR::Brown;
		nodeMap["Blue"] = COLOR::Blue;
		enum COLOR finalColor;
		switch (choice)
		{
		case 1:
		{
			cin >> name;
			cin >> color;
			cin >> owner;
			finalColor = nodeMap[color];
			zoo[count++] = new Dog(name,finalColor,owner);
			cout << "added dog" << endl;
			break;
		}
		case 2:
			cin >> name;
			cin >> color;
			finalColor = nodeMap[color];
			zoo[count++] = new Cat(name, finalColor);
			cout << "Sent cat to zoo" << endl;
			break;
		case 3:
			cin >> name;
			cin >> color;
			finalColor = nodeMap[color];
			zoo[count++] = new Lion(name, finalColor);
			cout << "Sent lion to zoo" << endl;
			break;
		case 4:
			for (int i = 0; i < count; i++)
			{
				zoo[i]->move();
				zoo[i]->speak();
				zoo[i]->eat();
				cout << endl;
			}
			cout << "move all animals" << endl;
			break;
		case 5:
			cout << "Exit" << endl;
			//delete pointer, free memory
			for (int i = 0; i < count; i++)
			{
				delete zoo[i];
			}
			break;
		}
	} while (choice != 5);
	

	system("pause");
	return 0;

	// previous part answers 
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
	//Dog dog_1("JackTerrier ", Green, " albert");
//	dog_1.speak();
//	dog_1.move();
	// 3.3
	//3.3 1) Constructors for Animal, Mammal and Dog are called
	// Animal speaks  is called, while move dog is called. 
	// this is because move is not implemented in animal.
	// hence the dog implementation of move is called.
	// as for speaks, because this pointer is initially an
	// Animal class, it calls the animal speak.
	//downcasting
	//Animal *animalPtr = new Dog("Lassie", White, "Andy");
	//check if downcasting is ok
	//Dog* dog1 = dynamic_cast<Dog*>(animalPtr);
	//if (dog1 != NULL) {
//		cout << "valid cast" << endl;
//	}
	// 1c) when virtual keyword is removed from speak
	// animal speak is called. polymorphic effect is removed
	// this is observed when const is removed .
	// if const is not removed, there is no difference. 
	// both will call the animal speak .
//	animalPtr->speak();
	//animalPtr->move();
	//delete animalPtr;
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
	//aniVal.speak();
	// output currently is all animal speak because speak() is not implemented in mammal
	//4) The array will not work when it is array of animal object.
	// 
}