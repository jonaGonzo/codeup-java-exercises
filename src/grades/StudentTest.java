package grades;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("Jona");
        s.addGrade(90.0);
        s.addGrade(91.2);
        s.addGrade(96.0);
        s.addGrade(50.0);

        System.out.println(s.getGradeAverage());
    }
}
