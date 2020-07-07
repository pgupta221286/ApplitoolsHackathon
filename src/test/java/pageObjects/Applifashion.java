package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Applifashion{

	WebDriver webDriver;
	String device;

	public String main_logo = "IMG____9";
	public String search_box = "DIV__customsear__41";
	public String menu_bar = "DIV__mainmenu__15";
	public String wishlist = "A__wishlist__52";
	public String cart_number = "STRONG____50";
	public String open_search_box = "A__btnsearchm__59";
	public String profile = "A__accesslink__56";
	public String cart = "A__cartbt__49";	
	public String first_shoe="FIGURE____214";
	public String big_shoe_image = "DIV__topbanner__188";
	public String filters = "filter_col";
	public String grid_icon = "I__tiviewgrid__203";
	public String list_icon = "I__tiviewlist__205";
	public String add_to_wishlist = "I__tiheart__226";
	public String similar_shoes = "I__ticontrols__230";
	public String add_to_cart = "I__tishopping__234";
	public String show_filter_button = "ti-filter";
	public String apply_filters_button = "filterBtn";
	public String searchResults_xpath="//div[@class='grid_item']";
	public String about_us = "A____426";
	public String FAQ = "A____428";
	public String help = "A____430";
	public String my_account = "A____432";
	public String blog = "A____434";
	public String contacts = "A____436";
	public String address = "LI____441";
	public String email = "LI____444";
	public String email_box = "email_newsletter";
	


	public Applifashion(WebDriver driver, String device) {
		this.webDriver=driver;
		this.device = device;
	}


	public void filterBlackShoes() {
		if(device.equals("mobile") || device.equals("tablet")) {
			webDriver.findElement(By.id(show_filter_button)).click();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		webDriver.findElement(By.xpath("//label[contains(text(),'Black')]")).click();
		webDriver.findElement(By.id(apply_filters_button)).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickBlackShoe() {
		webDriver.findElement(By.xpath(first_shoe)).click();		
	}

}
