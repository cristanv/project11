package deletecontactTest;

import org.testng.annotations.Test;

public class organizaionModule {

	
	@Test(groups = "smoke")
	public void createOrgTest() {
		System.out.println("createOrgTest executed");
	}
	@Test(groups = "regression")
	public void createOrganizationAndDeleteTest() {
		System.out.println("createOrganizationAndDeleteTest executed");
	}
}
