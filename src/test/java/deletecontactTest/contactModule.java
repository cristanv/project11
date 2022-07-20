package deletecontactTest;

import org.testng.annotations.Test;

public class contactModule {
	
	@Test(groups = "smoketest")
	public void createModule() {
		System.out.println("create contact...");
	}
	

	@Test(groups = "regression")
	public void deleteModule() {
		System.out.println("deletemodule contact...");
	}

}
