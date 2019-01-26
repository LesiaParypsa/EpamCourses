package homework.lesson6_part1_University;

import java.time.LocalDate;
import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<Student> students;

    public University(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
        students = new ArrayList<>();
        students.add(new Student("Parypsa", "Lesia", "Serhiivna",
                LocalDate.of(1988, 12, 31), "Kyiv", "9379992", "1", FacultiesList.FICT,
                CoursesList.FIRST, GroupsList.FBT_3_08));
        students.add(new Student("Gibaev", "Oleg", "Lovovich",
                LocalDate.of(1956, 11, 24), "Lviv", "9379993", "2", FacultiesList.FMM,
                CoursesList.FOURTH, GroupsList.FICT_2_06));
    }



    public ArrayList<Student> getStudentsByFaculty(FacultiesList faculty) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFaculty() == faculty) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentsByFacultyAndCourse(FacultiesList faculty, CoursesList course) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFaculty() == faculty && students.get(i).getCourse() == course) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentsByGroup(GroupsList group) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup() == group) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    public ArrayList<Student> getStudentYoungerThanYear(int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getDateOfBirth().getYear() > year) {
                result.add(students.get(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < students.size(); i++) {
            str += students.get(i).toString();
        }

        return nameOfUniversity + "\n\n" + str;
    }
}
