package Screen;


import object.Sound;

import java.util.Scanner;

public class titlePage {
     void main() {
         sound.setFile(0);
         playMusic(0);
         titlePage tp  = new titlePage();
         String choice;
         Scanner sc = new Scanner(System.in);
         //Welcome sign for the app

         System.out.println("");



        choice = sc.nextLine();



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
