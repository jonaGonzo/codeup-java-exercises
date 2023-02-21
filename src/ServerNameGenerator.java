import java.util.random.RandomGenerator;

public class ServerNameGenerator {

    private static String[] adjectives = new String[]{
           "smart",
           "kind",
           "slick",
           "sexy",
           "incredible",
           "charming",
           "fly",
           "beautiful",
           "joyful",
           "dark",
    };
    private static String[] nouns = new String[]{
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

    public static String returnRandomElement(String[] strs){
        int randomIndex = (int) (Math.random() * strs.length);
        return strs[randomIndex];
    }

    public static void main(String[] args) {
        String randomNoun = returnRandomElement(nouns).toLowerCase();
        String randomAdj = returnRandomElement(adjectives).toLowerCase();
        System.out.printf("%s-%s", randomAdj, randomNoun);
    }

}

