#include <iostream>
#include <string>
using namespace std;

class Student {
public: // Crucial in C++: members are private by default
    string name;
    int* marks; // Must be a pointer to use 'new' and 'delete'

    // 1. Parameterized Constructor
    Student(string name, int inputMarks) {
        this->name = name;
        this->marks = new int(inputMarks); // Dynamically allocate an integer
        cout << "Parameterized Constructor called" << endl;
    }

    // 2. Destructor
    ~Student() {
        delete marks; // Clean up the dynamically allocated memory
        cout << "Destructor called!" << endl;
    }
};

int main() {
    Student s("Rohit", 100);
    
    // 3. Use '.' operator for normal stack objects, and '*' to get pointer value
    cout << "name: " << s.name << ", marks: " << *(s.marks) << endl;

    return 0; // Standard for main() in C++
}
