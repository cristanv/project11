package deletecontactTest;

import org.testng.annotations.Test;

public class campaignModule {
	
	@Test(groups = "smoketest")
	public void createcampaign() {
		System.out.println("createcampaign executed");
	}
	
	@Test(groups = "regression")
	public void deleteCampaign() {
		System.out.println("deletecampaign executed");
	}

}
