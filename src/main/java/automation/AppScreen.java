
package automation;

import org.sikuli.script.*;

import org.testng.annotations.Test;
import utils.DataProperties;
/**
 * Created with IntelliJ IDEA.
 * User: efrolova
 * Date: 29.04.13
 * Time: 21:15
 * To change this template use File | Settings | File Templates.
 */


public class AppScreen extends AbstractScreen  {
    private Pattern newImage;
    private Pattern btnsetProflePhoto;
    private Pattern btnSetCoverPhoto;
    private Pattern btnNow;
    private Pattern welcomePage;
    private Pattern btnPhoto;
    private Pattern btnSave;
    private Pattern btnUse;
    private Pattern txtLocation;
    private Pattern txtWebsite;
     private Pattern txtInfo;
    private Pattern txtProfiveSaved;
    private Region window;

    public AppScreen() throws FindFailed {
       btnNow=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\btnNow.png") ;
        welcomePage =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\Welcome.png") ;
        btnsetProflePhoto=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\SetProfilePhoto.png") ;
        btnSetCoverPhoto=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\SetCoverPhoto.png") ;
       btnPhoto=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\smbPhoto.png") ;
         btnSave= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\btnSave.png") ;
         txtLocation=  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\location.png") ;
        txtWebsite=  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\website.png") ;
        txtInfo =  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\Info.png") ;
        btnUse  =  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\btnUse.png") ;
        txtProfiveSaved=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\User'sPage\\ProfileSaved.png") ;
        window = getDriver().wait(welcomePage.similar((float) 0.5));
        }



    public AppScreen AddImageWithWelcomePage() throws FindFailed, InterruptedException {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1200);
        Thread.sleep(1500);
       window.click(btnNow);
        window.click(btnsetProflePhoto);
        window.click(btnPhoto);
       window.click(btnUse.similar((float)0.9));
        window.click(txtLocation.similar((float)0.9));
        window.type((txtLocation.similar((float)0.9)),DataProperties.get("user.location"));
        window.click(txtWebsite.similar((float)0.9));
        window.type((txtWebsite.similar((float)0.9)),DataProperties.get("user.site"));
        window.click(txtInfo.similar((float)0.99));
        window.type((txtInfo.similar((float)0.99)),DataProperties.get("user.comment"));
        window.click(btnSave);
        window.exists(txtProfiveSaved);
        window.waitVanish(txtProfiveSaved,20);
        return this;
    }
}