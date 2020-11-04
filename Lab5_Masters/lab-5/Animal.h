#ifndef ANIMAL_H
#define ANIMAL_H
#include <string>

using namespace std;

enum COLOR { Green, Blue, White, Black, Brown };

class Animal {
public:
    Animal();
    Animal(string n, COLOR c);
    ~Animal();

    virtual void speak() const;

    virtual void move() const = 0;

    string getName() { return _name; };
    COLOR getColor() { return _color; };

    void setName(string name) { _name = name; };
    void setColor(COLOR color) { _color = color; };

    string getColorName() { return _colorConvert[_color];  };

private:
    string _name;
    COLOR _color;
    const string _colorConvert[5] = { "Green", "Blue", "White", "Black", "Brown" };;
};

class Mammal : public Animal {
public:
    Mammal();
    Mammal(string name, COLOR color);

    ~Mammal();

    virtual void eat() const;

    void move() const;
};

#endif