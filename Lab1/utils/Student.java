package Lab1.utils;

public class Student {
    public String fullName;
    public int age;
    public float avgMark;

    public Student(String fullName, int age, float avgMark) {
        this.fullName = fullName;
        this.age = age;
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + "\n Age: " + age + "\n Average Mark: " + avgMark;
    }
}
