#ifndef CHILD_ANIMAL_H
#define CHIDL_ANIMAL_H

#include "Animal.h"


/* ========== Dog ========== */

class Dog : public Mammal {
private:
    string _owner;

public:
    Dog();
    Dog(string name, COLOR color, string owner);

    ~Dog();

    void speak() const;
    void move() const;
    void eat() const;

    string getOwner() { return _owner; };

    void setOwner(string owner) { _owner = owner; };

};

/* ========== Cat ========== */

class Cat : public Mammal {
private:

public:
    Cat();
    Cat(string name, COLOR color);

    ~Cat();

    void speak() const;
    void move() const;
    void eat() const;

};

/* ========== Lion ========== */

class Lion : public Mammal {
private:

public:
    Lion();
    Lion(string name, COLOR color);

    ~Lion();

    void speak() const;
    void move() const;
    void eat() const;

};

#endif
