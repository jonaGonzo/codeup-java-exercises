import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Jona");
        persons[1] = new Person("Action");
        persons[2] = new Person("Nando");

        for(Person person : persons){
            System.out.println(person.getName());
        }

//        Person[]
    }


}
