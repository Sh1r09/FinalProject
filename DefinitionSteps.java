package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.HomePage;
import pagefactory.ProductPage;
import java.util.concurrent.TimeUnit;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
        driver.manage().timeouts().setScriptTimeout(5000,TimeUnit.MILLISECONDS);
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User checks header visibility")
    public void checkHeaderVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isHeaderVisible();
    }

    @And("User returns to the {string} page")
    public void returnToPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User hover over the language button")
    public void hoverOverLanguageButton() {
        homePage.hoverOverLanguageButton();


    }

    @And("User hover over 'Name of Country' field")
    public void hoverOverNameOfCountryField() {
        homePage.hoverOverNameOfCountryField();


    }

    @And("User hover over 'Selected Country' button")
    public void hoverOverSelectedCountryButton() {
        homePage.hoverOverSelectedCountryButton();


    }

    @And("User checks visibility of language button pop up")
    public void checkVisibilityLanguageButtonPopUp() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isLanguageButtonPopUpVisible();
    }

    @And("User checks 'Deliver to' button visibility")
    public void checkDeliverToButtonVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isDeliverToButtonVisible();
    }

    @And("User clicks on 'Deliver to' button")
    public void clickDeliverToButton() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.clickDeliverToButton();
    }


    @And("User checks search field visibility")
    public void checkSearchVisibility() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.isSearchFieldVisible();
    }

    @And("User checks 'Choose your location' pop up visibility")
    public void checkChooseYourLocationPopupVisibility() {
        homePage.isChooseYourLocationPopupVisible();
    }

    @And("User checks footer visibility")
    public void checkFooterVisibility() {
        homePage.isFooterVisible();
    }

    @And("User checks cart visibility")
    public void checkCartVisibility() {
        homePage.isCartIconVisible();
    }

    @And("User checks that language switcher is {string}")
    public void checkLanguage(final String language) {
        assertTrue(homePage.getLanguageButtonText().equalsIgnoreCase(language));
    }

    @And("User hover over Sign In button")
    public void hoverOverSignInButton() {
        homePage.hoverOverSignInButton();

    }

    @And("User checks register button visibility")
    public void checkRegisterButtonVisibility() {
        homePage.isRegisterButtonVisible();
    }

    @And("User checks sign in button visibility")
    public void checkSignInButtonVisibility() {
        homePage.isSignInButtonVisible();
    }

    @When("User clicks on 'Name of Country' field")
    public void clickNameOfCountryField() {
        homePage.clickNameOfCountryField();
    }

    @And("User checks 'Country list' pop up visibility")
    public void checkCountryListPopupVisibility() {
        homePage.isCountryListPopupVisible();

    }

    @When("User clicks on 'Selected Country' button")
    public void clickSelectedCountryButton() {
        homePage.clickSelectedCountryButton();
    }

    @When("User clicks 'Sign In' button")
    public void clickSignInButton() {
        homePage.clickSignInButton();
    }

    @Then("User checks email  field visibility on sign in page")
    public void checkEmailVisibility() {
        assertTrue(homePage.isEmailFieldVisible());
    }

    @And("User opens product page")
    public void openProductPage() {
        homePage.clickProduct();

    }

    @When("User clicks language button")
    public void clickLanguageButton() {
        homePage.clickLanguageButton();
    }

    @When("User clicks 'Done' button")
    public void clickDoneButton() {
        homePage.clickDoneButton();
    }

    @And("User checks that current url contains {string} language")
    public void checkCurrentUrl(final String language) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(language));
    }

    @And("User checks that selected country in country field is {string}")
    public void checkCurrentSelectedCountry(final String country) {
        assertTrue(homePage.getCountryInCountryFieldText().equals(country));
    }

    @And("User makes search by keyword {string}")
    public void enterKeywordToSearchField(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void clickSearchButton() throws InterruptedException {
        sleep(1500);
        homePage.clickSearchButton();
    }

    @And("User clicks 'Add to Cart' button on product")
    public void clickAddToCart() {
        productPage = pageFactoryManager.getProductPage();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        productPage.clickAddToCartButton();
    }

    @And("User checks that add to cart popup visible")
    public void checkAddToCartPopupVisibility() {
        productPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, productPage.getAddToCartPopupHeader());
        assertTrue(productPage.isAddToCartPopupVisible());
    }

    @And("User checks 'Cart' button visibility")
    public void checkCartButtonVisibility() {
        productPage.isCartButtonVisible();

    }

    @And("User checks 'Name of Country' field visibility")
    public void checkNameOfCountryFieldVisibility() {
        homePage.isNameOfCountryFieldVisible();

    }

    @And("User checks 'Proceed to checkout' button visibility")
    public void checkProceedToCheckoutButtonVisibility() {
        productPage.isProceedToCheckoutButtonVisible();

    }

    @And("User clicks 'Proceed to checkout' button")
    public void clickProceedToCheckoutButton() {
        productPage.clickProceedToCheckoutButton();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User clicks 'Continue' button")
    public void clickContinueButton() {
        productPage.clickContinueButton();
        productPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }



    @And("User checks 'Continue to Cart' button visibility")
    public void checkContinueToCartButtonVisibility() {
        productPage.isContinueToCartButtonVisible();
    }


    @And("User clicks 'Continue to Cart' button")
    public void clickContinueToCartButton() {
        productPage.clickContinueToCartButton();
    }

    @And("User checks that amount of products in search results list are {string}")
    public void checkAmountOfProductsInResultsList(final String expectedAmount) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSearchListProductsCount());
        assertEquals(homePage.getSearchResultProducts(), expectedAmount);
    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Given("User opens{string} page")
    public void userOpensHttpsWwwAmazonComPage() {
    }

    @Given("Given User opens {string} page")
    public void givenUserOpensHomePagePage() {
    }
}
