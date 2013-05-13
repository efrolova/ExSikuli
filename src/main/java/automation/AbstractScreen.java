package automation;

import utils.DataProperties;
import utils.Driver;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import utils.User;

public class AbstractScreen {
    protected final static double WIN_TIMEOUT = Double.parseDouble(DataProperties.get("window.timeout"));
    protected final static double CTL_TIMEOUT = Double.parseDouble(DataProperties.get("control.timeout"));

    protected Screen getDriver() {
        return Driver.getInstance();
    }
//    protected String name=DataProperties.get("user.newName");
//    protected String pass= DataProperties.get("user.newName");
//    protected String e_mail=DataProperties.get("user.Email");
//    protected int FirstInd=1;
//    protected int EndInd=100;
//    protected void OptimazeUser( User[] array){
//
//        for(int i = FirstInd; i < EndInd; i++) {
//
//            array[i] = new User(name+i,pass+i, name+i+e_mail);
       // } }
//    protected    int i=3;
//    protected utils.User[] User = new User[50];
}
