package Screen;


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
            //Welcome sign for the app


            System.out.println("1) New Order");
            System.out.println("0) Exit");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    OrderScreen.main();
                    break;
                case "0":
                    System.out.print("Are you sure you want to exit? ");
                    System.out.println("Y) Yes");
                    System.out.println("N) Go Back");
                    choice2 = scanner.nextLine().toLowerCase();
                    if (choice2.equals("yes")) {
                        System.out.println("Thank you for visiting Spice Deli! ");
                    }
                    else {
                        return;
                    }
                    break;
                    default:
                        System.out.println("Invalid selection. Please try again");
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
