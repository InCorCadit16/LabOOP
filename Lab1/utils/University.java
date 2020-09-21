package lab1.utils;

import java.util.ArrayList;

public class University {
    public ArrayList<Student> students;
    public final String name;
    public final int foundationYear;

    public University(String name, int foundationYear) {
        this.foundationYear = foundationYear;
        this.name = name;
        this.students = new ArrayList<Student>();
    }

    public double calculateAverageMark() {
        var sum = sumOfMarks();

        return sum / students.size();
    }

    public double sumOfMarks() {
        var sum = 0;
        for (var student : students) {
            sum += student.avgMark;
        }

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder
            .append("\nName: ")
            .append(name)
            .append("\n")
            .append("Foundation year: ")
            .append(foundationYear)
            .append("\n")
            .append("Number of students: ")
            .append(students.size())
            .append("\n");

        return builder.toString();
    }
}
