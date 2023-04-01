package gitHub.CRUDOOperations;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibraryies.IEEndPointsAndPaths;

public class SearchRepoTest extends BaseClass {
	@Test
	 public void searchTest() {
		given()
		.queryParam("q", property.fetchParameter("repoName"))
		.queryParam("sort", property.fetchParameter("sort"))
		.when().get(IEEndPointsAndPaths.searchRepos)
		.then().log().all().assertThat().statusCode(200);
		

	}

}
