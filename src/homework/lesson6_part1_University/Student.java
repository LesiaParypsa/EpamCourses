package homework.lesson6_part1_University;

import java.time.LocalDate;

public class Student extends Person {
    private String studentId;
    private FacultiesList faculty;
    private CoursesList course;
    private GroupsList group;

    public Student(String firstName, String secondName, String patronymic,
                   LocalDate dateOfBirth, String address, String phoneNumber,
                   String studentId, FacultiesList faculty, CoursesList course, GroupsList group) {
        super(firstName, secondName, patronymic, dateOfBirth, address, phoneNumber);
        this.studentId = studentId;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public FacultiesList getFaculty() {
        return this.faculty;
    }

    public GroupsList getGroup() {
        return this.group;
    }

    public CoursesList getCourse() {
        return  this.course;
    }

    @Override
    public String toString() {
        return super.toString() + "Student id: " + studentId + "\nFaculty: " + faculty +
                "\nCourse: " + course + "\nGroup: " + group + "\n\n";
    }
}
