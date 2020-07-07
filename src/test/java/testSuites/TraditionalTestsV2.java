package testSuites;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonFiles.CommonMethods;
import commonFiles.Settings;
import pageObjects.Applifashion;

public class TraditionalTestsV2 {

	SoftAssert softAssert;
	WebDriver driver;
	CommonMethods common;
	Settings setting = new Settings();

	@BeforeMethod
	public void initialize() {
		common = new CommonMethods();
		softAssert = new SoftAssert();
	}

	@AfterMethod
	public void cleanUp(){
		driver.quit();
	}



	@Test
	public void Task1_Laptop_Chrome() {

		String device = "laptop";
		String browser = "chrome";
		
		driver = common.launch(browser,device,1200,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isNotDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isNotDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isNotDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isNotDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	@Test
	public void Task1_Laptop_Edge() {

		String device = "laptop";
		String browser = "edge";
		
		driver = common.launch(browser,device,1200,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isNotDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isNotDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isNotDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isNotDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	@Test
	public void Task1_Laptop_Firefox() {

		String device = "laptop";
		String browser = "firefox";
		
		driver = common.launch(browser,device,1200,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isNotDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isNotDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isNotDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isNotDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	
	@Test
	public void Task1_Tablet_Chrome() {

		String device = "tablet";
		String browser = "chrome";
		
		driver = common.launch(browser,device,784,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isNotDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isNotDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isNotDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isNotDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isNotDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isNotDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	@Test
	public void Task1_Tablet_Edge() {

		String device = "tablet";
		String browser = "edge";
		
		driver = common.launch(browser,device,784,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isNotDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isNotDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isNotDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isNotDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isNotDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isNotDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	@Test
	public void Task1_Tablet_Firefox() {

		String device = "tablet";
		String browser = "firefox";
		
		driver = common.launch(browser,device,784,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isNotDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isNotDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isNotDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isNotDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isNotDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isNotDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isNotDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
	@Test
	public void Task1_Tablet_Mobile() {

		String device = "mobile";
		String browser = "chrome";
		
		driver = common.launch(browser,device,500,700);
		driver.get(setting.v2url);


		Applifashion appliPage = new Applifashion(driver, device);
		softAssert.assertTrue(common.hackathonReporter(1, "main_logo",appliPage.main_logo , common.isDisplayed(appliPage.main_logo)));
		softAssert.assertTrue(common.hackathonReporter(1, "search_box",appliPage.search_box , common.isNotDisplayed(appliPage.search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "menu_bar",appliPage.menu_bar , common.isNotDisplayed(appliPage.menu_bar)));
		softAssert.assertTrue(common.hackathonReporter(1, "wishlist",appliPage.wishlist , common.isNotDisplayed(appliPage.wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart_number",appliPage.cart_number , common.isNotDisplayed(appliPage.cart_number)));
		softAssert.assertTrue(common.hackathonReporter(1, "open_search_box",appliPage.open_search_box , common.isDisplayed(appliPage.open_search_box)));
		softAssert.assertTrue(common.hackathonReporter(1, "profile",appliPage.profile , common.isDisplayed(appliPage.profile)));
		softAssert.assertTrue(common.hackathonReporter(1, "cart",appliPage.cart , common.isDisplayed(appliPage.cart)));
		

		//Body
		softAssert.assertTrue(common.hackathonReporter(1, "filters",appliPage.filters , common.isNotDisplayed(appliPage.filters)));
		softAssert.assertTrue(common.hackathonReporter(1, "big_shoe_image",appliPage.big_shoe_image , common.isDisplayed(appliPage.big_shoe_image)));
		softAssert.assertTrue(common.hackathonReporter(1, "grid_icon",appliPage.grid_icon , common.isNotDisplayed(appliPage.grid_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "list_icon",appliPage.list_icon , common.isNotDisplayed(appliPage.list_icon)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_wishlist",appliPage.add_to_wishlist , common.isDisplayed(appliPage.add_to_wishlist)));
		softAssert.assertTrue(common.hackathonReporter(1, "similar_shoes",appliPage.similar_shoes , common.isDisplayed(appliPage.similar_shoes)));
		softAssert.assertTrue(common.hackathonReporter(1, "add_to_cart",appliPage.add_to_cart , common.isDisplayed(appliPage.add_to_cart)));
		softAssert.assertTrue(common.hackathonReporter(1, "show_filter_button",appliPage.show_filter_button , common.isDisplayed(appliPage.show_filter_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "apply_filters_button",appliPage.apply_filters_button , common.isNotDisplayed(appliPage.apply_filters_button)));
		softAssert.assertTrue(common.hackathonReporter(1, "first_shoe",appliPage.first_shoe , common.isDisplayed(appliPage.first_shoe)));

		//Footer
		softAssert.assertTrue(common.hackathonReporter(1, "about_us",appliPage.about_us , common.isNotDisplayed(appliPage.about_us)));
		softAssert.assertTrue(common.hackathonReporter(1, "FAQ",appliPage.FAQ , common.isNotDisplayed(appliPage.FAQ)));
		softAssert.assertTrue(common.hackathonReporter(1, "help",appliPage.help , common.isNotDisplayed(appliPage.help)));
		softAssert.assertTrue(common.hackathonReporter(1, "my_account",appliPage.my_account , common.isNotDisplayed(appliPage.my_account)));
		softAssert.assertTrue(common.hackathonReporter(1, "blog",appliPage.blog , common.isNotDisplayed(appliPage.blog)));
		softAssert.assertTrue(common.hackathonReporter(1, "contacts",appliPage.contacts , common.isNotDisplayed(appliPage.contacts)));
		
		softAssert.assertTrue(common.hackathonReporter(1, "address",appliPage.address , common.isNotDisplayed(appliPage.address)));
		softAssert.assertTrue(common.hackathonReporter(1, "email",appliPage.email , common.isNotDisplayed(appliPage.email)));

		softAssert.assertTrue(common.hackathonReporter(1, "email_box",appliPage.email_box , common.isNotDisplayed(appliPage.email_box)));
		
		softAssert.assertAll();
	}
	
}
