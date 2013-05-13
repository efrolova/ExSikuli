package automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import utils.DataProperties;
import utils.User;
public class MainScreen extends AbstractScreen {
//	private Pattern search;
//	private Pattern showAllResults;
    private Pattern btnRunApp;
    private Pattern WindowSimulator;
    private Pattern winAdminAccess;
    private Pattern adminPass;
    private Pattern adminLogin;
    private Pattern btnContinue;
    private Pattern appWasRun;
    private Pattern appIcon;
    private Pattern btnSignUp;
    private Pattern btnSignIn;
    private Pattern txtbUserName;
    private Pattern txtbUserPass;
    private Pattern btnlogin;
    private Pattern btnSkipSignUp;
  //  private Pattern txtUserEmail;
    private Pattern txtUserEmailReal;
    private Pattern signupOpen;
    private Pattern txtWelcome;
    private Pattern btnCreateAccount;
    private Pattern errorName;
    private Pattern errorUserNameExists;
    private Pattern btnCancel;
    private Pattern btnReturn ;
    private Pattern btnDismiss;
    private Pattern simWindow;
    private Pattern closeSim;
    private Pattern smbIOS;
    private Pattern closeUser3;
    private Pattern closeSeans;
    private Pattern imageForSignup;
    private Pattern btnContinueSignup;
    private Pattern welcomePage;
    private Pattern btnSkip;
    private Pattern smbList;
    private Pattern suggestion;
    private Pattern favoriteSet;
    private Pattern SignOut;
    private Region window;
//

	public MainScreen() throws FindFailed {
//        btnRunApp= new Pattern(DataProperties.path("btnRunApp"));
//        WindowSimulator=new Pattern(DataProperties.path("WindowSimulator"));
//        winAdminAccess=new Pattern(DataProperties.path("winAdminAccess"));
//        btnContinue=new Pattern(DataProperties.path("btnContinue"));
//        adminLogin=new Pattern(DataProperties.path("adminLogin"));
//        adminPass=new Pattern(DataProperties.path("adminPass"));
        btnRunApp=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\btnRunApp.png");
        WindowSimulator=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\SuccessLoginUser3.png" );
        winAdminAccess=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\AdminAccess.png");
        btnContinue=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\btnПродолжить.png");
        adminLogin=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\adminName.png");
        adminPass=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\adminPass.png");
              appWasRun=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\AppWasRun.png");
        appIcon=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\IconGeist.png");
        btnSignIn= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Landving page\\btnSignIn.png");
        btnSignUp=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Landving page\\btnSignup.png");
        txtbUserName=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignIn\\Username.png");
        txtbUserPass=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignIn\\Password.png");
        btnlogin=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignIn\\LogIn.png");
       btnSkipSignUp=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnSkip.png");
        btnSkip=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Home page\\btnSkip.png");
        //txtUserEmail= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\WindowSignup.png");
       // txtUserName1= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\UserName.png");
        signupOpen=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\WindowSignup.png");
        txtWelcome= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignIn\\TxtWelcome.png");
        btnCreateAccount=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnCreateAccount.png");
       txtUserEmailReal=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnEmail.png");
        errorName=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\UserNameIncorrectLong.png");
        errorUserNameExists=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\UserNameUnvaliable.png");
        btnCancel=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnCancel.png");
        btnReturn=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnReturn.png");
        btnDismiss =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\btnDis.png");
        simWindow=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\SimulatorIOS.png");
        closeSim=  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\CloseSimu.png");
        smbIOS= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\SymbIOS.PNG ");
        closeUser3=  new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\CloseUser3.PNG ");
        closeSeans= new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\CloseSeans.PNG ");
        imageForSignup=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\ImagesOnSignup.png");
        btnContinueSignup=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\BtnContinue.png") ;
        welcomePage =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\SignUp\\Welcome.png") ;
        smbList  =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Home page\\symList.png") ;
        suggestion =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Home page\\suggestion.png") ;
        favoriteSet =new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Home page\\FavoriteSets.png") ;
        SignOut=new Pattern("C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\Home page\\SignOut.png") ;
        window = getDriver().wait(WindowSimulator.similar((float) 0.3));
	}
//
	public MainScreen RunApp() throws FindFailed, InterruptedException {

        window.setX(0);
        window.setY(0);
        window.setW(1310);
        window.setH(1020);
      // Thread.sleep(500);
//        window.wait(WindowSimulator, 15);
               window.wait(btnRunApp.similar((float)0.8),10);
        //window.find(UserVNC);
        // window.waitVanish(btnRunApp, 2);
        window.click(btnRunApp.similar((float)0.8));
        //Thread.sleep(500);
        window.click(btnRunApp.similar((float)0.8));
    return this;
    }
    public MainScreen LoginAsAdmin() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1310);
        window.setH(1010);
        Thread.sleep(1000);
     //  while (window.exists(winAdminAccess)) {
      do {
          window.click(btnRunApp.similar((float)0.8));
          window.wait(winAdminAccess.similar((float)0.9), 30);
      }
        while (window.exists(winAdminAccess.similar((float)0.9)) == null);
//        window.find(winAdminAccess);
          window.findNow(adminLogin);
          window.click(adminLogin.similar((float) 0.8));
          window.type(adminLogin.similar((float) 0.8), DataProperties.get("iserver.adminName"));
          window.type(adminPass.similar((float)0.8),DataProperties.get("iserver2.pass"));
          window.click(btnContinue);
		return this;
	}
    public MainScreen CheckOpenApp() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1100);
        Thread.sleep(1000);
        if (window.find(appWasRun.similar((float) 0.7))==null)
        {
            window.click(appIcon.similar((float) 0.7));
            Thread.sleep(1500);
        }
        else {window.exists(appWasRun.similar((float) 0.9)); }
        return this;
    }
    public MainScreen SignInOpen() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1200);
        Thread.sleep(1500);
        window.click(btnSignIn);
        return this;
    }
    public MainScreen CorrectSignIn() throws FindFailed, InterruptedException  {
//        User[] User1 = new User[50];
//        AbstractScreen arr= new AbstractScreen();
//        arr.OptimazeUser(User1);

        do{
            window.wait(txtbUserName.similar((float) 0.95),5);
            window.click(txtbUserName.similar((float) 0.95));
         //   window.type(txtbUserName.similar((float) 0.95), User1[FirstInd].getUserName());
            window.type(txtbUserName.similar((float) 0.95),DataProperties.get("user.Exists"));
        }
        while (window.exists(txtbUserName)==null);

        window.click(txtbUserPass.similar((float) 0.95));
       // window.type(txtbUserName.similar((float) 0.95), User[i].getUserName());

//        utils.User[] User1 = new User[50];
//        OptimazeUser(User1);
       // window.type(txtbUserPass,User1[FirstInd].getPassword());
        window.type(txtbUserPass.similar((float) 0.95),DataProperties.get("user.Exists"));
        window.click(btnlogin);
        window.exists(txtWelcome);
//        window.wait(txtWelcome.similar((float)0.9),10);
        window.waitVanish(txtWelcome,20);
        return this;
    }

    public MainScreen SignUpOpenApp() throws FindFailed, InterruptedException  {
        window.wait(btnSignUp,20);
        window.click(btnSignUp);

        return this;

    }
    public MainScreen SignUpSkipImage() throws FindFailed, InterruptedException  {
    window.wait(btnSkipSignUp);
    window.click(btnSkipSignUp);

        return this;

    }
    public MainScreen SignUpFullFormApp() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1200);
        Thread.sleep(1500);
   //      while (window.exists(signupOpen)!=null);
      //  window.wait(txtUserEmail,20);
        //     window.type(txtbUserName.similar((float)0.99),"user9");
            // while (window.find(txtbUserName)==null);
         //utils.User[]User1 = new User[50];
        //OptimazeUser(User1);
        window.click(signupOpen.targetOffset(-10, -105));
        window.type(signupOpen.targetOffset(-10,-105),DataProperties.get("user.newName"));
    //    window.click(txtbUserName.similar((float)0.9));
   //     window.type(signupOpen.targetOffset(-10, -225),User1[FirstInd+1].getUserName());

        window.find(txtbUserPass);
        window.click(txtbUserPass.similar((float)0.9));
     //   window.type(txtbUserPass.similar((float) 0.95),User1[FirstInd+1].getPassword());
        window.type(txtbUserPass.similar((float) 0.9),DataProperties.get("user.newName"));
      //  window.click(txtbUserPass.targetOffset(-10,-120));
        //window.type(txtUserEmail.targetOffset(-10,-120),"user3");

        window.click(txtUserEmailReal.similar((float)1));
        window.type(txtUserEmailReal.similar((float)0.95),DataProperties.get("user.newName")+DataProperties.get("user.Email"));
      //  window.type(txtUserEmailReal.similar((float)0.95),User1[FirstInd+1].getEmail());
        window.click(btnCreateAccount);
//        window.click(txtbUserPass.similar((float) 0.95));
//       window.click(txtUserEmail.similar((float) 0.95));
//        window.type(txtUserEmail.similar((float) 0.95),"user3@mail.ru");
         window.exists(welcomePage);
     return this;
    }
    public MainScreen SignUpImage() throws FindFailed, InterruptedException  {
      window.click(imageForSignup.targetOffset(-150,-71));
        window.click(imageForSignup.targetOffset(-156, 90));
        window.click(imageForSignup.targetOffset(18, -64));
        window.click(imageForSignup.targetOffset(-15, 60));
        window.click(imageForSignup.targetOffset(155, -70));
        window.wait(btnContinueSignup,5);
        window.click(btnContinueSignup);
        return this;
    }
    public MainScreen SignInAppIncorrectName() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1200);
        Thread.sleep(1500);

        window.click(signupOpen.targetOffset(-10, -105));
        window.type(signupOpen.targetOffset(-10,-105),DataProperties.get("user.smallName"));
        window.find(txtbUserPass);
        window.click(txtbUserPass.similar((float)0.9));
        window.wait(errorName,5);
        window.click(errorName.targetOffset(0,45));
        window.click(btnCreateAccount);
        window.wait(errorName,5);
        window.click(errorName.targetOffset(0,45));
        return this;
    }
    public MainScreen SignInAppExistsName() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1400);
        window.setH(1200);
        Thread.sleep(1500);
        window.click(signupOpen.targetOffset(-10, -105));
        window.type(signupOpen.targetOffset(-10,-105),DataProperties.get("user.Exists"));

        window.click(txtbUserPass.similar((float)0.9));
        window.type(txtbUserPass.similar((float) 0.9),DataProperties.get("user.Exists"));
        window.click(txtUserEmailReal.similar((float) 0.95));
        window.type(txtUserEmailReal.similar((float) 0.95), DataProperties.get("user.Exists")+DataProperties.get("user.Email"));
        window.click(btnCreateAccount);
        window.wait(errorUserNameExists,5);
      // do  {
      Thread.sleep(1500);
        window.find(btnDismiss);
        window.click(btnDismiss);

      // while (window.exists(btnCancel.similar((float)0.9))==null);
        return this;
    }
    public MainScreen CloseAppWithSignUp() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1310);
        window.setH(1010);
        Thread.sleep(2000);
        window.click(btnCancel.similar((float)0.9));
        window.click(btnReturn.similar((float)0.9));
        window.wait(btnSignUp,20);
        return this;}

    public MainScreen CloseVNCUser3() throws FindFailed, InterruptedException  {
        window.setX(0);
        window.setY(0);
        window.setW(1500);
        window.setH(1300);
        Thread.sleep(500);
        window.click(simWindow.similar((float)0.8));
        window.wait(closeSim.similar((float)0.8),5);
        window.click(closeSim.similar((float)0.8));
        Thread.sleep(1000);
        window.click(smbIOS.similar((float)0.85));
        window.click(closeUser3.similar((float)0.85));
        window.click(closeSeans.similar((float)0.85));
        Thread.sleep(1500);

        return this;
    }
    public MainScreen SignOut() throws FindFailed, InterruptedException  {
       if  (window.exists(btnSkip)!=null)
       {window.click(btnSkip);

       } else
       if (window.exists(smbList)!=null)  {
           window.wait(smbList,10);    }

           window.click(smbList);

        window.dragDrop(suggestion,favoriteSet);
        window.click(SignOut.similar((float)0.95));
        window.click(SignOut.similar((float)0.95));
        return this;
    }
}