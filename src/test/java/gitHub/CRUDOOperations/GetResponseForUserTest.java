package gitHub.CRUDOOperations;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;

import static io.restassured.RestAssured.*;

public class GetResponseForUserTest  extends BaseClass{
@Test
public void getResponseforUserTest() {
	given()
	.pathParam("username", property.fetchParameter("username"))
	.when()
	.get(IEEndPointsAndPaths.getAllUserRepo)
	.then()
	.log().all()
	.assertThat().statusCode(200);
	
	
	
	
	
}
}