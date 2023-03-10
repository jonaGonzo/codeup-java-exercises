package AbstractInterfaceMiniExercise;

abstract class Media implements Location {
    public void borrowMe() {
        System.out.println("Borrow me, not keep me! Please bring me back on due date, thank you.");
    }

    public abstract void listenToMe();
}


//    Consider a library. In the library, there are various forms of media accessible to the public. A patron of a library can access
//newspapers, books, microfiche, magazines, records, cds, etc.
//Create a Media.Media abstract class
//  Identify at least one process that can be done the same way for each form of media. Add a public
//  void instance method named after this thing and give it a message to print simply print out generally describing this process.
//  Identify at least one process that be done for each form of media but requires a unique approach / implementation for each specific
//  sub-type of media. Create an abstract method that defines method signature for this process but does not include the method body.
//Extend from Media.Media with one of the above listed sub-types of media
//  Include an implementation (method body) of the abstract method created in the Media.Media class
//BONUS: identify and add another abstract method to the Media.Media class and extend the Media.Media class in additional sub-types










