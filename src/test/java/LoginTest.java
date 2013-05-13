/**
 * @author EFrolova
 * Test automation of login functionality
 */


import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

import automation.ActiveWindow;
import automation.AppScreen;
import automation.LoginScreen;
import automation.MainScreen;
import org.testng.annotations.Test;

public class LoginTest extends BaseTestCase{



	public void ValidLoginInVNC_BaseTest() throws Exception {
     // app=run();
    //  openVNC();
        LoginScreen login = new LoginScreen();
		login.LoginInVnc() ;


	}
    @Test
    public void RunPictoPop() throws Exception {
        ValidLoginInVNC_BaseTest();
     MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
        runPictoPop.CheckOpenApp();
        runPictoPop.CloseVNCUser3();
    }
    @Test
    public void SignUpWithoutImage() throws Exception {

       ValidLoginInVNC_BaseTest();
       MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
       runPictoPop.LoginAsAdmin();
          runPictoPop.CheckOpenApp();
        runPictoPop.SignUpOpenApp();
        runPictoPop.SignUpSkipImage();
        runPictoPop.SignUpFullFormApp();
        runPictoPop.SignOut();
        runPictoPop.CloseVNCUser3();
    }

    @Test
    public void SignUpWithImage() throws Exception {

        ValidLoginInVNC_BaseTest();
        MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
        runPictoPop.CheckOpenApp();
        runPictoPop.SignUpOpenApp();
        runPictoPop.SignUpImage();
        runPictoPop.SignUpFullFormApp();
        runPictoPop.SignOut();
        runPictoPop.CloseVNCUser3();
    }
    @Test
    public void SignIn() throws Exception {

        ValidLoginInVNC_BaseTest();
        MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
         runPictoPop.CheckOpenApp();
        runPictoPop.SignInOpen();
        runPictoPop.CorrectSignIn();
        runPictoPop.SignOut();
        runPictoPop.CloseVNCUser3();
    }
    @Test
    public void SignUpNegName() throws Exception {

        ValidLoginInVNC_BaseTest();
        MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
        runPictoPop.CheckOpenApp();
        runPictoPop.SignUpOpenApp();
        runPictoPop.SignUpSkipImage();
        runPictoPop.SignInAppIncorrectName();
        runPictoPop.CloseAppWithSignUp();
        runPictoPop.CloseVNCUser3();
    }
    @Test
    public void SignUpExName() throws Exception {

        ValidLoginInVNC_BaseTest();
        MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
        runPictoPop.CheckOpenApp();
        runPictoPop.SignUpOpenApp();
        runPictoPop.SignUpSkipImage();
        runPictoPop.SignInAppExistsName();
        runPictoPop.CloseAppWithSignUp();
        runPictoPop.CloseVNCUser3();
    }
    @Test
    public void SetImageOnWelcomePage() throws Exception {
        ValidLoginInVNC_BaseTest();
       MainScreen runPictoPop=new MainScreen();
        runPictoPop.RunApp();
        runPictoPop.LoginAsAdmin();
        runPictoPop.CheckOpenApp();
        runPictoPop.SignUpOpenApp();
        runPictoPop.SignUpImage();
        runPictoPop.SignUpFullFormApp();
        AppScreen actionInPictoPop =new AppScreen();
        actionInPictoPop.AddImageWithWelcomePage();
        runPictoPop.SignOut();
        runPictoPop.CloseVNCUser3();
    }
//    @Test
//    public void CheckActiveWindWithoutVNC() throws Exception {
//        //For Start you should disable BeforeMetod in BaseTestCase class
//        ActiveWindow exmp=new ActiveWindow();
//        exmp.AppWindow();
//    }
}
