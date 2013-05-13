package automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.*;


/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 30.04.13
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
public class ActiveWindow extends AbstractScreen {
     private Pattern landvingPage;
    private Pattern btnSignUp;
    private Region window;
    public ActiveWindow() throws FindFailed {
        landvingPage=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Landving page\\LandvingPAge.png");
        btnSignUp=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Landving page\\btnSignup.png");
        window = getDriver().wait(landvingPage.similar((float) 0.5));
    }

    public ActiveWindow AppWindow() throws FindFailed, InterruptedException {
        window.setX(0);
        window.setY(0);
        window.setW(1310);
        window.setH(1020);
        Thread.sleep(1500);
        window.click(btnSignUp);
        return this;
    }
}
