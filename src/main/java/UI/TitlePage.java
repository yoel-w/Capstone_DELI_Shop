package UI;


import Object.Sound;

import java.util.Scanner;

public class TitlePage {

    public static void main() {
        TitlePage titlePage = new TitlePage();
        titlePage.HomeScreen();
    }

    public void HomeScreen() {
        sound.setFile(0);
        playMusic(0);
        String choice;
        String choice2;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            //fonts/sign somewhere
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    stopMusic();
                    OrderScreen.main(scanner);
                    break;
                case "0":
                    boolean exitMenu = true;
                    while (exitMenu) {
                        System.out.println("Are you sure you want to exit? ");
                        System.out.println("Y) Yes");
                        System.out.println("N) Go Back");
                        System.out.println("");
                        System.out.print("Enter your choice: ");
                        choice2 = scanner.nextLine().toLowerCase();
                        if (choice2.equals("y")) {
                            System.out.println("Thank you for visiting Spice Deli! ");
                            running = false;
                            exitMenu = false;
                        } else if (choice2.equals("n")) {
                            exitMenu = false;
                        } else {
                            System.out.println("");
                            System.out.println("Invalid selection. Please try again");
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid selection. Please try again");
            }
        }
    }


    Sound sound = new Sound();

    public void playMusic(int i) {
        sound.setFile(0);
        sound.play();
        sound.loop();
    }

    public void stopMusic() {
        sound.stop();
    }

    public void playSE(int i) {
        sound.setFile(i);
        sound.play();
    }

}
