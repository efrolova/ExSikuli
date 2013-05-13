package automation;

import org.sikuli.script.*;

import org.testng.annotations.Test;
import utils.DataProperties;


public class LoginScreen extends AbstractScreen {

    private Pattern btnConnect;
    private Pattern connectWindow;
	private Region window ;
 //   private Region window1;
    private Pattern btnLogon;
    private Pattern logonWindow;
    private Pattern txtPass;
    private Pattern UserVNC;
    private Pattern UserVNC1;
    private Pattern WindowUsers;
    private Pattern txtPassUsers;
    private Pattern icLoginUsers;
 //   private Location loc;
   // private Screen currentLocation;
  //  private CapturePrompt x;
	public LoginScreen() throws FindFailed {

        btnConnect=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\btnConncect.png") ;
        connectWindow=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\ConectWindow.jpg")  ;
        btnLogon=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\btnLogon.png"  ) ;
        logonWindow=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\VNCAuthentic-1.png") ;
        txtPass=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\txtPassword.png") ;
        UserVNC= new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\1.png") ;
        UserVNC1= new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\1-1.png");
        WindowUsers=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\UsersWindow.png");
        txtPassUsers=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\Flapons.png");
        icLoginUsers=new Pattern( "C:\\Users\\efrolova\\ExSikuli\\src\\main\\resources\\VNC\\logonUser.png");
//        btnConnect= new Pattern((DataProperties.path("btnConncect.png")));
//        connectWindow=new Pattern((DataProperties.get("connectWindow")));
//        btnLogon=new Pattern(DataProperties.get("vnc.btnLogon"));
//        logonWindow=new Pattern(DataProperties.get("vnc.logonWindow"));
//        txtPass=new Pattern(DataProperties.get("vnc.txtPass"));
//        UserVNC= new Pattern(DataProperties.get("iserver2.UserVNC"));
//        UserVNC1= new Pattern(DataProperties.get("iserver2.UserVNC1"));
//        WindowUsers=new Pattern(DataProperties.get("iserver2.WindowUsers"));
//        txtPassUsers=new Pattern(DataProperties.get("iserver2.txtPassUsers"));
//        icLoginUsers=new Pattern(DataProperties.get("iserver2.icLoginUsers"));

        window=getDriver().wait(connectWindow);

   // loc.setLocation(313,0);
       // currentLocation=new Screen();

    }

	public LoginScreen LoginInVnc() throws  FindFailed {
      // window.waitVanish(connectWindow,1);
       // window.waitVanish(btnConnect,1);
        window.click(btnConnect);
       // window.waitVanish(logonWindow,1);
        window.type(txtPass,DataProperties.get("iserver2.pass"));
		//window.waitVanish(btnLogon,1);
        window.click(btnLogon);
//         currentLocation.capture(310,0,1020,1310);
       window.waitVanish(UserVNC1.similar((float)0.95), 5);
      //  window1 = window.offset(loc);
        // isLoginWindowExist();
       // currentLocation.onAppear(WindowUsers);
      //  window.setRect(310,0,1020,1310);
       // window.morphTo(window1);
        window.setW(1310);
        window.setH(1010);
        //window.find(UserVNC);
       window.click(UserVNC.similar((float)0.95));
       // window.waitVanish(txtPassUsers,2);
       window.click(txtPassUsers);
       window.type(txtPassUsers,DataProperties.get("user3.VNC"));
       window.click(icLoginUsers);

        return this;
	}

	
	public boolean isLoginWindowExist() {
		try {
			getDriver().find(WindowUsers);
            window=getDriver().wait(WindowUsers);
			return true;
		} catch (FindFailed e) {
			return false;
		}
	}
	

	}

