package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//header")
    private WebElement header;

    @FindBy(xpath = "//div[contains(@id, 'navFooter')]")
    private WebElement footer;

    @FindBy(xpath = "//*[@id='nav-cart']")
    private WebElement cartIcon;

    @FindBy(xpath = "//a[contains(@class, 'nav-a nav-a-2 icp-link-style-2')]")
    private WebElement languageButton;

    @FindBy(xpath = "//div[@id='nav-flyout-icp']")
    private WebElement languageButtonPopUp;

    @FindBy(xpath = "//div[@id='nav-flyout-icp']//a[@href='#switch-lang=de_DE']")
    private WebElement differentlanguageButton;


    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a[@data-nav-role = 'signin']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[contains(text(), 'Start here')]")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@class='gigya-screen-dialog-main']")
    private WebElement signInPopup;

    @FindBy(xpath = "//*[@id='ap_email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElement searchField;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    private WebElement searchButton;


    @FindBy(xpath = "//span[contains(text(),'1-16 of')]")
    private WebElement searchListProductsCount;

    @FindBy(xpath = "(//span[@class='nav-text' and contains(text(),'English')])[1]")
    private WebElement selectedLanguage;

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    private WebElement signIn;

    @FindBy(xpath = "(//a[@class='a-link-normal a-text-normal'])[1]")
    private WebElement productItem;

    @FindBy(xpath = "//*[@id='nav-global-location-popover-link']")
    private WebElement deliverToButton;

    @FindBy(xpath = "//div[@class='a-popover-wrapper']")
    private WebElement chooseYourLocationPopup;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']")
    private WebElement nameOfCountryField;

    @FindBy(xpath = "//span[@class='a-button-text a-declarative']/span")
    private WebElement countryInCountryField;

    @FindBy(xpath = "//div[@class='a-popover-inner a-lgtbox-vertical-scroll']")
    private WebElement countryListPopup;

    @FindBy(xpath = "//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//a[@id='GLUXCountryList_231']")
    private WebElement selectedCountryButton;

    @FindBy(xpath = "//*[@name='glowDoneButton']")
    private WebElement doneButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void hoverOverSignInButton() {
        Actions action = new Actions(driver);
        action.moveToElement(signIn).build().perform();
        //waitVisibilityOfElement(10,signInButton);
        signInButton.isDisplayed();
    }

    public void hoverOverLanguageButton() {
        Actions action = new Actions(driver);
        action.moveToElement(languageButton).build().perform();
        waitVisibilityOfElement(10, selectedLanguage);
    }

    public void hoverOverNameOfCountryField() {
        Actions action = new Actions(driver);
        action.moveToElement(nameOfCountryField).build().perform();

    }

    public void hoverOverSelectedCountryButton() {
        Actions action = new Actions(driver);
        action.moveToElement(selectedCountryButton).build().perform();

    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void isHeaderVisible() {
        header.isDisplayed();
    }

    public String getCountryInCountryFieldText() {
        return countryInCountryField.getText();
    }

    public void isFooterVisible() {
        footer.isDisplayed();
    }

    public void isLanguageButtonPopUpVisible() {
        languageButtonPopUp.isDisplayed();
    }

    public void isChooseYourLocationPopupVisible() {
        chooseYourLocationPopup.isDisplayed();
    }

    public void isCartIconVisible() {
        cartIcon.isDisplayed();
    }

    public String getLanguageButtonText() {
        waitVisibilityOfElement(10, selectedLanguage);
        return selectedLanguage.getText();
    }

    public void isDeliverToButtonVisible() {
        deliverToButton.isDisplayed();
    }

    public void clickDeliverToButton() {
        deliverToButton.click();
    }

    public void clickNameOfCountryField() {
        nameOfCountryField.click();
    }

    public void isCountryListPopupVisible() {
        countryListPopup.isDisplayed();
    }

    public void isNameOfCountryFieldVisible() {
        nameOfCountryField.isDisplayed();
    }


    public void isSignInButtonVisible() {
        signInButton.isDisplayed();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickDoneButton() {
        doneButton.click();
    }

    public void isRegisterButtonVisible() {
        registerButton.isDisplayed();
    }

    public boolean isEmailFieldVisible() {
        return emailField.isDisplayed();
    }



    public void clickSelectedCountryButton() {
        selectedCountryButton.click();
    }


    public void isSearchFieldVisible() {
        searchField.isDisplayed();
    }

    public void clickCartButton() {
        cartIcon.click();
    }

    public void clickProduct() {
        productItem.click();

    }

    public void clickLanguageButton() {
        languageButton.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public WebElement getSearchListProductsCount() {
        return searchListProductsCount;
    }

    public String getSearchResultProducts() {
        return searchListProductsCount.getText();
    }

}