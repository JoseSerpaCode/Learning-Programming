#include <iostream>
#include <string>
#include <stdlib.h>
#include <time.h>

using namespace std;

struct Student {
    string name;
    int score;
};

void sortingStudents(Student students[], int size){
    for (size_t i = 0; i < size; i++) {
        for (size_t j = 0; j < size; j++) {
            if (students[j].score < students[j+1].score) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }            
        }        
    }
    
}

int main() {
    srand(time(NULL));

    Student students[3] {
        {"Juan", rand() % 100 + 1},
        {"Pedro", rand() % 100 + 1},
        {"Maria", rand() % 100 + 1}
    };

    cout << "List of students" << endl;
    for (size_t i = 0; i < 3; i++) {
        cout << "Name: " << students[i].name << "\t Score: " << students[i].score << endl;
    }

    cout << "Sorting students by score" << endl;
    sortingStudents(students, 3);
    for (size_t i = 0; i < 3; i++) {
        cout << "Name: " << students[i].name << "\t Score: " << students[i].score << endl;
    }
    
}