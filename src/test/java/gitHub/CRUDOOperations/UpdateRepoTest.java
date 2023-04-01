package gitHub.CRUDOOperations;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;
import Pojoclasses.RepositoryLib;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateRepoTest extends BaseClass{
@Test

public void upadteRepoTest() {
	RepositoryLib obj =new RepositoryLib();
	obj.setDescription("just for fun enjoy pandago");
	obj.setRepoStatus(true);
	given().body(obj)
	.contentType(ContentType.JSON)
	.pathParam("owner", property.fetchParameter("owner"))
	.pathParam("repo", property.fetchParameter("repo"))
	.when()
	.get(IEEndPointsAndPaths.patchRepo)
	.then()
	.log().all().assertThat().statusCode(200);
}
	


}
