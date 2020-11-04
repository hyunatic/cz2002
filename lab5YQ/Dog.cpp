#include "Mammal.cpp"
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
	void speak() const{
		cout << "Dog WOOF " << endl;
	}
	void move(){
		cout << "Dog Move" << endl;
	}
	void eat() const{
		cout << "Dog eat " << endl;
	}
};