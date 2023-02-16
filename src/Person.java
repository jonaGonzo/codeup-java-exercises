import java.io.PrintStream;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    //    *********** Getters and Setters ***********
    public String getName() {
        return name;
//TODO: return the person's name
    }

    public void setName(String name) {
        this.name = name;
//        System.out.println(name);
//TODO: change the name field to the passed value
    }

//    *********** Methods ***********
    public void sayHello() {
        this.name = "Hello, " + name + "!";
        System.out.println(name);
//TODO: print a message to the console using the person's name
    }

    public static Person[] addPerson(Person[] persons, Person person){
        Person[] personPlusOne = new Person[persons.length + 1];
        for(int i = 0; i < persons.length; i+= 1){
            personPlusOne[i] = persons[i];
        }
        return personPlusOne;
    }

//    public static void main(String[] args) {
////        Person user = new Person("Jona");
////        Person andrew = new Person("Andrew");
////        user.sayHello();
////        user.setName("James");
////        user.sayHello();
//
////        Person person1 = new Person("John");
////        Person person2 = new Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
////
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println(person1 == person2);
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//
//
//    }


}
