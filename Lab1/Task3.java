package Lab1;

import Lab1.utils.Student;
import Lab1.utils.University;

public class Task3 {
    
    public static void main(String args[]) {
        var mit = new University("MIT", 1911);
        
        mit.students.add(new Student("Jay S.Bob", 19, 7.9f));
        mit.students.add(new Student("John Sally", 22, 5.5f));
        mit.students.add(new Student("Mike Wazovski", 21, 8.1f));

        var harward = new University("Harward", 1584);

        harward.students.add(new Student("John Doe", 28, 9.6f));
        harward.students.add(new Student("Sammy Hill", 22, 7.4f));
        harward.students.add(new Student("Ion Mamaliga", 18, 11.2f));

        var utm = new University("UTM", 1948);

        utm.students.add(new Student("Ion Gandrabura", 21, 9.4f));
        utm.students.add(new Student("Marian Bejenari", 19, 8.5f));
        utm.students.add(new Student("Oleg Suprun", 22, 9.0f));

        var sumOfAllMarks = mit.sumOfMarks() + harward.sumOfMarks() + utm.sumOfMarks();
        var sumOfStudents = mit.students.size() + harward.students.size() + utm.students.size();
        System.out.println("Avg mark for all universities: " + sumOfAllMarks / sumOfStudents );
    }
    
}
