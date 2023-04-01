package gitHub.CRUDOOperations;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class GetResponseFromAuthentUser  extends BaseClass {
@Test
public void getResponseForUserTest() {
	  given()
			.auth()
			.oauth2(property.fetchParameter("token"))
			.when()
			.get(IEEndPointsAndPaths.getRepoForAuthUser)
			 .then()
			.log().all()
			.assertThat()
			.statusCode(200)
			.contentType(ContentType.JSON);
	//Assert.assertEquals( response.body().toString().contains("jenkinsPractice"));
			
	
}
}
