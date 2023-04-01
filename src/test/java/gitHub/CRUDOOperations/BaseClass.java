package gitHub.CRUDOOperations;
import  static io.restassured.RestAssured.*;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import GenericLibraryies.IEEndPointsAndPaths;
import GenericLibraryies.JavaUtilities;
import GenericLibraryies.PropertiesUtilities;

public class BaseClass {
	protected PropertiesUtilities  property;
	protected JavaUtilities javaUtil;
	public static String repoName;
@BeforeMethod
public void methodConfig() {
	property =new PropertiesUtilities();
	property.propertiesInitialization(IEEndPointsAndPaths.propertiespath);
	javaUtil =new JavaUtilities();
	baseURI = "https://api.github.com";
	
	
}
@AfterMethod
public void methodTearDown() {
	Reporter.log("Request completed",true);
}

}
