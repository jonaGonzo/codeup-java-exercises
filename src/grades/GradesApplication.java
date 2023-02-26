package grades;

import java.util.*;

public class GradesApplication {

    public static Map<String, Student> createStudents(){

        Map<String, Student> students = new HashMap<>();

        Student gameLord66 = new Student("John");
        gameLord66.addGrade(50.0);
        gameLord66.addGrade(75.5);
        gameLord66.addGrade(100.0);

        Student cheeseBrains01 = new Student("James");
        cheeseBrains01.addGrade(75.0);
        cheeseBrains01.addGrade(75.5);
        cheeseBrains01.addGrade(90.0);

        Student third_playa = new Student("Jona");
        third_playa.addGrade(65.0);
        third_playa.addGrade(75.5);
        third_playa.addGrade(90.0);

        Student CREAM_candy44 = new Student("Jake");
        CREAM_candy44.addGrade(75.0);
        CREAM_candy44.addGrade(85.5);
        CREAM_candy44.addGrade(90.0);

        students.put("gameLord66", gameLord66);
        students.put("cheeseBrains01", cheeseBrains01);
        students.put("third_playa", third_playa);
        students.put("CREAM_candy44", CREAM_candy44);
        return students;
    }

    public static void displayUserNames(List<String> usernames){
        String outputOfUserNames = "";
        for (String username : usernames) {
            outputOfUserNames += String.format("|%s| ", username);
        }
        System.out.printf("""
                Here are the GitHub usernames of our students:
                
                %s
                
                """,outputOfUserNames);

    }

    public static void displayUser(Student student, String username){
        System.out.printf("""
                Name: %s - GitHub Username: %s
                Current Average: %f
                """, student.getName(), username, student.getGradeAverage());
    }

    public static void main(String[] args) {
        System.out.println("Welcome!\n");
        Map<String, Student> students = createStudents();
        Scanner scan = new Scanner(System.in);

        List<String> usernames = new ArrayList<String>(students.keySet());
        displayUserNames(usernames);

        System.out.println("What student would you like to see more information on?\n");
        String username = scan.nextLine();
        Student student = students.get(username);
        displayUser(student, username);

    }
}
