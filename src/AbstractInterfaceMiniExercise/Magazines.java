package AbstractInterfaceMiniExercise;

class Magazines extends Media {
    public void listenToMe(){
        System.out.println("Use your eyeballs!");
    }

    public static void main(String[] args) {
        Magazines Vogue = new Magazines();
        Vogue.borrowMe();
    }

    @Override
    public void whereAmI() {

    }
}