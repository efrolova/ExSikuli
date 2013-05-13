

import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.SikuliScript;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.DataProperties;
import utils.User;

public class BaseTestCase {


    //protected    int i=3;
  // protected utils.User[] User = new User[50];

	protected SikuliScript script;
	protected Process app;
	@BeforeMethod
//	public void setUp() throws InterruptedException, FindFailed {
////		openSpotify();
//	app = run();

	//}

//    @AfterMethod
//    public void tearDown() {
//		closeSpotify();
//        stop();
//   }

//	private Process run() {
//		try {
//			return Runtime.getRuntime().exec(DataProperties.get("vnc.path"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

//	private void stop() {
//		app.destroy();
//	}
//


protected void openVNC() throws InterruptedException, FindFailed {
		try {
			script = new SikuliScript();
			script.openApp(DataProperties.get("vnc.path"));

		} catch (AWTException e) {
			fail("Can't opeen VNC by path "+DataProperties.get("vnc.path"));
		}
	}

//	private void closeSpotify() {
//		//it should work like this but Sikuli crashed. don't
//		script.closeApp("vnc");
//	}
}
