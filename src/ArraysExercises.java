import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] peopleArry = new Person[3];
        peopleArry[0] = new Person("Jona");
        peopleArry[1] = new Person("Action");
        peopleArry[2] = new Person("Nando");

        for(Person person : peopleArry){
            System.out.println(person.getName());
        }
        System.out.println("Adding Person to Array");
        peopleArry = Person.addPerson(peopleArry, new Person("Mary"));

        for(Person person : peopleArry){
            System.out.println(person.getName());
        }

    }


}
