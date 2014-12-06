package gr.spinellis.school;

/**
 * @has 1..* Member * Student
 * @composed 1..* Has 1..* Department
 */
class School {
    Name name;
    String address;
    Number phone;
    void addStudent() {}
    void removeStudent() {}
    void getStudent() {}
    void getAllStudents() {}
    void addDepartment() {}
    void removeDepartment() {}
    void getDepartment() {}
    void getAllDepartments() {}
}
