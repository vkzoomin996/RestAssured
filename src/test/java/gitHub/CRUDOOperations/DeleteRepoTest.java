package gitHub.CRUDOOperations;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;

public class DeleteRepoTest extends BaseClass {
	@Test
	public void deleterepoTest() {
		
		given().auth().oauth2(property.fetchParameter("token"))
		.pathParam("owner", property.fetchParameter("owner"))
		.pathParam("repo", property.fetchParameter("repo"))
		.when()
		.delete(IEEndPointsAndPaths.deleteRepo)
		.then()
		.log().all().assertThat().statusCode(204);
		
	}

}
