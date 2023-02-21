package AbstractInterfaceMiniExercise;

class Newspapers extends Media {
    public void listenToMe() {
        System.out.println("Use your eyes!");
    }

    public static void main(String[] args) {
        Newspapers blackAndWhite = new Newspapers();
        blackAndWhite.listenToMe();
        blackAndWhite.borrowMe();
    }
}
