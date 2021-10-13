package view;
/**
 *
 * @author Cuong
 */
public class Splash {
    public static void Intro() throws InterruptedException {
        Loading load = new Loading();
        for(int i=0;i<=100;i++){
            Thread.sleep(20);
            load.setVisible(true);
            load.LoadingLabel.setText("Loading..."+i+"%");
            load.LoadingBar.setValue(i);
            if(i==100){
                SignUp signUp = new SignUp();
                signUp.setVisible(true);
                load.dispose();
            }
        }
    }
}
