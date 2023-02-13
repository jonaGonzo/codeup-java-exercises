public class StringExercise {
    public static void main(String[] args) {
//        1.
        String edu = "We don't need no education";
        String control =edu.replace("education", "thought control");
        System.out.println(edu);
        System.out.println(control);

        System.out.println("Check \"this\" out!, \"s inside of \"s!\n");

        System.out.println("In windows, the main drive is usually C:\\\n");

        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!\n");

        System.out.println("""
                We don't need no education
                We don't need no thought control
                """);
        System.out.println("""
                Check "this" out!, "s inside of "s!
                """);

        System.out.println("""
                In windows, the main drive is usually C:\\
                """);

        System.out.println("""
                I can do backslashes \\, double backslashes \\\\,
                and the amazing triple backslash \\\\\\!
                """);


//        2.

    }
}
