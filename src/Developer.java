public class Developer extends Person {

    private boolean isTyping;

    public Developer(String name, boolean isTyping) {
        super(name);
        this.isTyping = isTyping;
    }

    public void isTyping() {
        if(isTyping){
            System.out.println(getName() + " is typing");
        } else {
            System.out.println(getName() + " is not typing");
        }
    }

    public static void main(String[] args) {
        Developer d = new Developer("Andrew", true);
        System.out.println(d.getName());
        d.isTyping();

        System.out.printf("""
                 /﹋\\
                (҂`_´)
                <,︻╤=╤====─ ҉ - - - JAVA
                 /﹋\\
                """);
    }

}
