package GenericLibraryies;

public interface IEEndPointsAndPaths {
	String postRepoForAuthUser ="/user/repos";
	String getRepoForAuthUser="/user/repos";
	String getAllUserRepo ="/users/{username}/repos";
	String getRepoForOwner="/repos/{owner}/{repo}";
	String patchRepo="/repos/{owner}/{repo}";
	String deleteRepo ="/repos/{owner}/{repo}";
	String searchRepos ="/search/repositories";
	
	String propertiespath = System.getProperty("user.dir")+"/src/test/resources/pathParameters.properties";
	

}
