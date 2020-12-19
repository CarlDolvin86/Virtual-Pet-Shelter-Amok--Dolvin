
public abstract class Dog extends VirtualPet {

    public Dog(String name, String description) {
        super(name, description);
    }

    public void walk() {
        happiness += 5;
        System.out.println
                ("      _\n" +
                        "        (_)\n" +
                        "       .-|-.\n" +
                        "      /  |  \\__\n" +
                        "      \\  |     '._\n" +
                        "         |\\       '-._  ,_\n" +
                        "         | \\        ,_'-/_`>\n" +
                        "        /  /        ( __ )\n" +
                        "  jgs  /_ /_        / > \\ >\n" +
                        " ");
    }
}

