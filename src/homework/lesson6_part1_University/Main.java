package homework.lesson6_part1_University;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        University myUniver = new University("KPI");

        ArrayList<Student> studentByGroup = myUniver.getStudentsByGroup(GroupsList.FICT_2_06);
        System.out.println("Students by group:\n");
        for (int i = 0; i < studentByGroup.size(); i++) {
            System.out.println(studentByGroup.get(i).toString());
        }

        ArrayList<Student> studentByGroupAndCourse = myUniver.getStudentsByFacultyAndCourse(FacultiesList.FEL, CoursesList.FIRST);
        System.out.println("Students by group and course:\n");
        for (int i = 0; i < studentByGroupAndCourse.size(); i++) {
            System.out.println(studentByGroupAndCourse.get(i).toString());
        }

        printFacultiesList();
        printGroupsList();
        printCourcesList();
    }

    public static void printFacultiesList() {
        System.out.println("List of all faculties:");
        for (FacultiesList f : FacultiesList.values()) {
            System.out.println(f);
        }
    }

    public static void printGroupsList() {
        System.out.println("List of all groups:");
        for (GroupsList g : GroupsList.values()) {
            System.out.println(g);
        }
    }

    public static void printCourcesList() {
        System.out.println("List of all courses:");
        for (CoursesList c : CoursesList.values()) {
            System.out.println(c);
        }
    }
}
