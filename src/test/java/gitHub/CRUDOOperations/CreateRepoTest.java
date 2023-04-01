package gitHub.CRUDOOperations;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;
import Pojoclasses.RepositoryLib;
import static io.restassured.RestAssured.*;

public class CreateRepoTest extends BaseClass {
	@Test
	public  void createRepoTest() {
		
		repoName = property.fetchParameter("repoName")+javaUtil.generaterandomNumber(100);
		
		RepositoryLib repoObj = new RepositoryLib(repoName, property.fetchParameter("description"), property.fetchParameter("homepage"), false);
		given().auth().oauth2("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")
		.body(repoObj)
		.when()
		.post(IEEndPointsAndPaths.postRepoForAuthUser)
		.then()
		.log().all().assertThat()
		.statusCode(201);
		
	}

}