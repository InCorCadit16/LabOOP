package Lab1;

import Lab1.utils.University;
import Lab1.utils.Student;

public class Task2 {

    public static void main(String args[]) {
        var mit = new University("MIT", 1911);
        
        mit.students.add(new Student("Jay S.Bob", 19, 7.9f));
        mit.students.add(new Student("John Sally", 22, 5.5f));
        mit.students.add(new Student("Mike Wazovski", 21, 8.1f));

        var harward = new University("Harward", 1584);

        harward.students.add(new Student("John Doe", 28, 9.6f));
        harward.students.add(new Student("Sammy Hill", 22, 7.4f));
        harward.students.add(new Student("Ion Mamaliga", 18, 11.2f));

        System.out.println(mit);
        System.out.println(harward);
    }
}

