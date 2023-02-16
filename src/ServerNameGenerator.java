import java.util.random.RandomGenerator;

public class ServerNameGenerator {
    String[] adjectives = new String[]{
           "smart",
           "kind",
           "slick",
           "sexy",
           "incredible",
           "charming",
           "fly",
           "beautiful",
           "joyful",
           "jolly",
    };
    String[] nouns = new String[]{
            "House",
            "Farm",
            "Dog",
            "Horse",
            "Donkey",
            "Duck",
            "Chicken",
            "Bee",
            "tractor",
            "truck",
    };

    public static int getRandomNumber(String[] words){
        return (int)Math.round(Math.random()*100);

    };


}

