package gr.spinellis.school;


/**
 * @has 1..* AssignedTo 1..* Instructor
 * @assoc 1..* - 1..* Course
 * @assoc 0..* - "0..1 chairperson" Instructor
 */
class Department {
    Name name;
    void addInstructor() {}
    void removeInstructor() {}
    void getInstructor() {}
    void getAllInstructors() {}
}