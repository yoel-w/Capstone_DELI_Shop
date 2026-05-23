package Screen;


import Object.Sound;

import java.util.Scanner;

public class TitlePage {
    void main() {

            sound.setFile(0);
            playMusic(0);
            TitlePage tp = new TitlePage();
            String choice;
            String choice2 = "";
            Scanner sc = new Scanner(System.in);
            //Welcome sign for the app


            System.out.println("1) New Order");
            System.out.println("0) Exit");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    OrderScreen.main();
                    break;
                case "0":
                    System.out.print("Are you sure you want to exit? ");
                    System.out.println("Y) Yes");
                    System.out.println("N) Go Back");
                    choice2 = sc.nextLine().toLowerCase();

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
