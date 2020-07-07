package commonFiles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {

	String browserName;
	String windowSize;
	String deviceName;
	
	WebDriver webDriver;
	
	Settings config=new Settings();

	public CommonMethods(WebDriver driver){
		this.webDriver=driver;
	}
	public CommonMethods() {
	}
	
	public WebDriver launch(String browser,String deviceName, int width,int height) {
		if(browser.equalsIgnoreCase("chrome"))
		{	
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chrome.exe");
			webDriver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{	
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/firefox.exe");
			webDriver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{	
			System.setProperty("webdriver.edge.driver", "./src/test/resources/edge.exe");
			webDriver = new EdgeDriver();
		}

		this.browserName = browser.toString();
		this.windowSize = width+"x"+height;
		this.deviceName = deviceName;

		Dimension d = new Dimension(width,height);
        //Resize current window to the set dimension
        webDriver.manage().window().setSize(d);

		webDriver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		return webDriver;
	}


	public boolean isDisplayed(String id) {
		return webDriver.findElements(By.id(id)).size()>0 && webDriver.findElement(By.id(id)).isDisplayed();
	}
	
	public boolean isNotDisplayed(String id) {
		return webDriver.findElements(By.id(id)).size()==0 || !webDriver.findElement(By.id(id)).isDisplayed();
	}
	
	public boolean hackathonReporter(int taskNumber, String test, String domId, Boolean result) {
		Settings config=new Settings();
		String file = config.file;
		try{
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write("Task: " + taskNumber + ", Test Name: Check " + test.replace("_", " ") + " visibility" +", DOM Id: " + domId + ", Browser: " + browserName 
					+ ", Viewport: " + windowSize + ", Device: " + deviceName + ", Status: " + (result? "Pass" : "Fail"));
			writer.newLine();
			writer.close();
		}catch(Exception e){
			System.out.println("ERROR!!!");
			e.printStackTrace();
		}
		return result;
	}

}
