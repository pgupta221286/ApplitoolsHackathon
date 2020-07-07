package testSuites;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.config.Configuration;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;

import commonFiles.CommonMethods;
import commonFiles.Settings;
import pageObjects.Applifashion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModernTestsV2 {
	VisualGridRunner runner;
	Eyes eyes;
	WebDriver driver;
	CommonMethods generic = new CommonMethods();
	Settings setting = new Settings();


	@Test
	public void Task1() {
		try {
			driver = generic.launch("edge","Tablet",800,600);
			
			driver.get(setting.v2url);
			
			//Test 1
			eyes.open(driver, "Hackathon App version", "Task 1", new RectangleSize(800, 600));
			eyes.check("Cross-Device Elements Test",Target.window());
			eyes.closeAsync();
			
		} 
		catch(Exception e){
			e.printStackTrace();
		}finally  {
			eyes.abortAsync();
			driver.quit();
		}
	}
	
	
	@Test
	public void Task2() {
		try {
			driver = generic.launch("edge","Tablet",800,600);

			driver.get(setting.v2url);
			
			//Test 2
			Applifashion appliPage = new Applifashion(driver,"tablet");
			appliPage.filterBlackShoes();
			eyes.open(driver, "Hackathon App version", "Task 2", new RectangleSize(800, 600));
			eyes.check("Filter Results",Target.region(By.id("product_grid")));
			eyes.closeAsync();
		} 
		catch(Exception e){
			e.printStackTrace();
		}finally  {
			eyes.abortAsync();
			driver.quit();
		}
	}

	
	@Test
	public void Task3() {
		try {
			driver = generic.launch("edge","Tablet",800,600);

			driver.get(setting.v2url);
			
			//Test 3
			Applifashion appliPage = new Applifashion(driver,"tablet");
			appliPage.filterBlackShoes();
			appliPage.clickBlackShoe();
			eyes.open(driver, "Hackathon App version", "Task 3", new RectangleSize(800, 600));
			eyes.check("Product Details test",Target.window());
			eyes.closeAsync();

		} 
		catch(Exception e){
			e.printStackTrace();
		}finally  {
			eyes.abortAsync();
			driver.quit();
		}
	}

	@BeforeClass
	public void initializeApplitools() {
		runner = new VisualGridRunner(10);
		
		// Create Eyes object with the runner, meaning it'll be a Visual Grid eyes.
		eyes = new Eyes(runner);

		//Setup eyes
		// Initialize eyes Configuration
		Configuration config = new Configuration();

		// You can get your api key from the Applitools dashboard
		config.setApiKey("rQtLDARMneJsFaFYjm1004tbIHyCjODZut48QZEazyHhw110");

		// create a new batch info instance and set it to the configuration
		config.setBatch(new BatchInfo("UFG Hackathon"));

		//Add browser
		config.addBrowser(1200, 700, BrowserType.CHROME);
		config.addBrowser(1200, 700, BrowserType.FIREFOX);
		config.addBrowser(1200, 700, BrowserType.EDGE_CHROMIUM);
		config.addBrowser(768, 700, BrowserType.CHROME);
		config.addBrowser(768, 700, BrowserType.FIREFOX);
		config.addBrowser(768, 700, BrowserType.EDGE_CHROMIUM);
		config.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT);

		// Set the configuration object to eyes
		eyes.setConfiguration(config);

	}

	@AfterClass
	private void tearDown() {
		
		TestResultsSummary allTestResults = runner.getAllTestResults(false);
		System.out.println(allTestResults);
	}
	
	
}
