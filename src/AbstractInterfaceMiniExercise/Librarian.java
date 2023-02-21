package AbstractInterfaceMiniExercise;

class Librarian extends Person{

    @Override
    public void WalkToContent() {
        System.out.println("I guess I'll clean up after everyone.");

    }
    @Override
    public void whereAmI() {
        System.out.println("Checking out material at the front front desk.");
    }



    public static void main(String[] args) {
        Librarian Stacy = new Librarian();
        Stacy.whereAmI();
        Stacy.WalkToContent();
    }

}
