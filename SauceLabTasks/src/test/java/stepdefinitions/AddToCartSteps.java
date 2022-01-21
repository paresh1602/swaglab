package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.SeleniumUtility;
import webpages.HomePage;
import webpages.LoginPage;

public class AddToCartSteps extends SeleniumUtility {
	public WebDriver driver;
	String url, userName, pwd;
	LoginPage loginPage;
	HomePage homePage;

	@Given("User open the url and login")
	public void user_open_the_url_and_login() {
		url = readPropFile("appUrl");
		userName = readPropFile("username");
		pwd = readPropFile("password");
		String browserName = readPropFile("browser");
		String appUrl = readPropFile("url");
		driver = setUp(browserName, appUrl);

	}

	@When("User click on add to cart button")
	public void user_click_on_add_to_cart_button() {
		homePage = new HomePage(driver);
		homePage.addToCart();
	}

	@Then("Item should get added to cart and displayed in cart")
	public void item_should_get_added_to_cart_and_displayed_in_cart() {
		homePage.goToCartPage();
		WebElement element = driver.findElement(By.className("cart_quantity"));
		Assert.assertTrue(element.isDisplayed());
	}

	@When("User click on another item add to cart button")
	public void user_click_on_another_item_add_to_cart_button() {
		driver.navigate().back();
		homePage.addToCarts();
	}

	@Then("Items should get added to cart and displayed in cart")
	public void items_should_get_added_to_cart_and_displayed_in_cart() {
		homePage.goToCartPage();
	}
}
