package controller;
import view.Splash;
/**
 *
 * @author Cuong
 */
public class Main {
    public static void main(String[] args) {
        try {
            new Splash().Intro();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
