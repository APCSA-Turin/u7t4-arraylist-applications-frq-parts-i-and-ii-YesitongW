package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;
public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareStudents(list.get(j), list.get(j + 1)) > 0) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }

    private static int compareStudents(Student s1, Student s2) {
        int lastNameComparison = s1.getLastName().compareTo(s2.getLastName());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }
        int firstNameComparison = s1.getFirstName().compareTo(s2.getFirstName());
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }

        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}

