import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter virtualPet = new VirtualPetShelter();

        virtualPet.addPet(new OrganicDog("Marmaduke", "The dog"));
        virtualPet.addPet(new OrganicDog("Beethoven", "The dog"));
        virtualPet.addPet(new OrganicCat("Binx", "The cat"));
        virtualPet.addPet(new OrganicCat("Luna", "The cat"));
        virtualPet.addPet(new RobotDog("Ajax", "The Robo-Dog"));
        virtualPet.addPet(new RobotDog("Cujo", "The Robo-Dog"));
        virtualPet.addPet(new RobotCat("Rachael", "The Robo-Cat"));
        virtualPet.addPet(new RobotCat("Phoebe", "The Robo-Cat"));


        System.out.println("Welcome to the CSB Animal Shelter!");
        System.out.println("");
        System.out.println
                ("          ___\n" +
                "       .-'`   `'-.\n" +
                "   _,.'.===   ===.'.,_\n" +
                "  / /  .___. .___.  \\ \\\n" +
                " / /   ( o ) ( o )   \\ \\                                            _\n" +
                ": /|    '-'___'-'    |\\ ;                                          (_)\n" +
                "| |`\\_,.-'`   `\"-.,_/'| |                                          /|\n" +
                "| |  \\             /  | |                                         /\\;\n" +
                "| |   \\           /   | | _                              ___     /\\/\n" +
                "| |    \\   __    /\\   | |' `\\-.-.-.-.-.-.-.-.-.-.-.-.-./`   `\"-,/\\/ \n" +
                "| |     \\ (__)  /\\ `-'| |    `\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\`\\       \\/\n" +
                "| |      \\-...-/  `-,_| |      \\`\\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\ \\       \\\n" +
                "| |       '---'    /  | |       | | | | | | | | | | | | | |       |\n" +
                "| |               |   | |       | | | | | | | | | | | | | |       |\n" +
                "\\_/               |   \\_/       | | | | | | | | | | | | | | .--.  ;\n" +
                "                  |       .--.  | | | | | | | | | | | | | | |  | /\n" +
                "                   \\      |  | / / / / / / / / / / / / / /  |  |/\n" +
                "                   |`-.___|  |/-'-'-'-'-'-'-'-'-'-'-'-'-'`--|  |\n" +
                "            ,.-----'~~;   |  |                  (_(_(______)|  |\n" +
                "           (_(_(_______)  |  |                        ,-----`~~~\\\n" +
                "                    ,-----`~~~\\                      (_(_(_______)\n" +
                "                   (_(_(_______)");
        System.out.println("");
        virtualPet.showPetStats();
        menu();
        int selection = input.nextInt();
        selection = selectionParameters(input, virtualPet, selection);

        while (selection >= 1 && selection <= 10) {
            if (selection == 1) {
                System.out.println("You have fed all of the live pets.");
                virtualPet.feedAllOrganic();
                System.out.println
                               ("   __________________,............., \n" +
                                "   /_/_/_/_/_/_/_/_/,-',  ,. -,-,--/|\n" +
                                "  /_/_/_/_/_/_/_/,-' //  /-| / /--/ /\n" +
                                " /_/_/_/_/_/_/,-' `-''--'  `' '--/ /\n" +
                                "/_/_/_/_/_/_,:................../ /\n" +
                                "|________,'                   hh|/\n" +
                                "         \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'");
            }
            if (selection == 2) {
                System.out.println("You have given all of the live pets water.");
                System.out.println
                               ("  .   *   ..  . *  *\n" +
                                "*  * @()Ooc()*   o  .\n" +
                                "    (Q@*0CG*O()  ___\n" +
                                "   |\\_________/|/ _ \\\n" +
                                "   |  |  |  |  | / | |\n" +
                                "   |  |  |  |  | | | |\n" +
                                "   |  |  |  |  | | | |\n" +
                                "   |  |  |  |  | | | |\n" +
                                "   |  |  |  |  | | | |\n" +
                                "   |  |  |  |  | \\_| |\n" +
                                "   |  |  |  |  |\\___/\n" +
                                "   |\\_|__|__|_/|\n" +
                                "    \\_________/");
                virtualPet.waterAllOrganic();
            }
            if (selection == 3) {
                System.out.println("You have oiled up all of the robo-pets.");
                System.out.println
                                ("     _ \n" +
                                "     [_] \n" +
                                "  .--' `--.\n" +
                                "  | baby  |\n" +
                                "  |~~oil~~|\n" +
                                "  |       |\n" +
                                "  `-------' \n" +
                                "\n" +
                                "Made with REAL babies too....");
                virtualPet.oilAllRobotPets();
            }
            String name = "";
            if (selection == 4) {
                System.out.println("You want to play with one of the live pets. Please choose one by name");
                virtualPet.showPetStats();
                name = nameMatch(input, virtualPet);
                System.out.println(
                        "You have played with " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
                virtualPet.virtualPets.get(name).play();
            }
            if (selection == 5) {
                System.out.println("You would like to adopt a pet.");
                virtualPet.showPetStats();
                System.out.println("Which pet would you like to adopt?");
                name = nameMatch(input, virtualPet);
                System.out.println(
                        "You have adopted " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase());
                System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
                        + " is looking forward to their forever home!");
                virtualPet.adoption(name);
            }

            if (selection == 6) {
                System.out.println("You would like to admit a pet to the shelter.\n"
                        + "I will need some information about this pet.");
                System.out.println("What is your animal's name?");
                name = input.next();
                System.out.println("How would you describe " + name.substring(0, 1).toUpperCase()
                        + name.substring(1).toLowerCase() + "?");
                input.nextLine();
                String description = input.nextLine();
                System.out.println(
                        "What kind of animal is " + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase()
                                + "\n1. Organic Dog" + "\n2. Organic Cat" + "\n3. Robot Dog" + "\n4. Robot Cat");
                int choice = input.nextInt();
                while (choice < 1 || choice > 4) {
                    System.out.println("You have entered an invalid choice.");
                    virtualPet.showPetStats();
                    admitMenu(virtualPet, name, description, choice);
                    choice = input.nextInt();
                }
                admitMenu(virtualPet, name, description, choice);
            }
            if (selection == 7) {
                System.out.println("You have cleaned all of the dogs cages. Thanks!");
                System.out.println
                                (" ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||     Here you go, sweep\n" +
                                "  ||     that up..............\n" +
                                " /||\\\n" +
                                "/||||\\\n" +
                                "======         __|__\n" +
                                "||||||        / ~@~ \\\n" +
                                "||||||       |-------|\n" +
                                "||||||       |_______|");
                virtualPet.cleanAllCages();
            }
            if (selection == 8) {
                System.out.println("Thanks for taking the dogs for a walk!");
                System.out.println
                               ("         _\n" +
                                "        (_)\n" +
                                "       .-|-.\n" +
                                "      /  |  \\__\n" +
                                "      \\  |     '._\n" +
                                "         |\\       '-._  ,_\n" +
                                "         | \\        ,_'-/_`>\n" +
                                "        /  /        ( __ )\n" +
                                "       /_ /_        / > \\ >\n" +
                                " ");
                virtualPet.walkAllDogs();
            }
            if (selection == 9) {
                System.out.println("You have cleaned the litter box. Thanks!");
                System.out.println
                                (" ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||\n" +
                                "  ||     Here you go, sweep\n" +
                                "  ||     that up..............\n" +
                                " /||\\\n" +
                                "/||||\\\n" +
                                "======         __|__\n" +
                                "||||||        / ~@~ \\\n" +
                                "||||||       |-------|\n" +
                                "||||||       |_______|");
                virtualPet.cleanLitterBox();
            }
            if (selection == 10) {
                System.out.println("Thanks for stopping by the CSB Animal Shelter!");
                System.exit(0);
            }
            virtualPet.tickAll(selection);
            virtualPet.showPetStats();
            menu();
            selection = input.nextInt();
            selection = selectionParameters(input, virtualPet, selection);
        }
    }

    public static int selectionParameters(Scanner input, VirtualPetShelter virtualPet, int selection) {
        while (selection < 1 || selection > 10) {
            System.out.println("You have entered an invalid choice.");
            virtualPet.showPetStats();
            menu();
            selection = input.nextInt();
        }
        return selection;
    }

    public static void menu() {
        System.out.println("\nWhat would you like to do next? " + "\n1. Feed the live pets."
                + "\n2. Refill water for the live pets." + "\n3. Oil the robotic pets." + "\n4. Play with a pet"
                + "\n5. Adopt a pet" + "\n6. Admit a pet" + "\n7. Clean the dogs cages" + "\n8. Walk the dogs"
                + "\n9. Clean the litter box" + "\n10. Quit");
    }

    public static String nameMatch(Scanner input, VirtualPetShelter virtualPet) {
        String name = input.next().toLowerCase();
        input.nextLine();
        while (!virtualPet.selectPetName(name)) {
            System.out.println("Sorry we don't have an live pet by that name.");
            virtualPet.showPetStats();
            System.out.println("Please choose one.");
            name = input.next();
            input.nextLine();
        }
        return name;
    }

    public static void admitMenu(VirtualPetShelter virtualPet, String name, String description, int choice) {
        if (choice == 1) {
            virtualPet.addPet(new OrganicDog(name, description));
        }
        if (choice == 2) {
            virtualPet.addPet(new OrganicCat(name, description));
        }
        if (choice == 3) {
            virtualPet.addPet(new RobotDog(name, description));
        }
        if (choice == 4) {
            virtualPet.addPet(new RobotCat(name, description));
        }
    }
}
