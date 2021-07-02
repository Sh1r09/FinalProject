package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[@id='add-to-cart-button']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='hlb-view-cart-announce']")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@class='success-popup__shopping-wrapper']//h3[@class='success-popup__success-message']")
    private WebElement addToCartPopupHeader;

    @FindBy(xpath = "//span[@class='a-button a-button-span12 a-button-primary']")
    private WebElement continueButton;


    @FindBy(xpath = "//*[@id='hlb-ptc-btn']")
    private WebElement ProceedToCheckoutButton;

    @FindBy(xpath = "//a[contains(text(),'Continue to cart')]")
    private WebElement continueToCartButton;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public boolean isCartButtonVisible() {
        return cartButton.isDisplayed();
    }

    public boolean isProceedToCheckoutButtonVisible() {
        return ProceedToCheckoutButton.isDisplayed();
    }


    public void clickAddToCartButton() {
        addToCartButton.click();

    }

    public void clickProceedToCheckoutButton() {
        ProceedToCheckoutButton.click();

    }

    public boolean isAddToCartPopupVisible() {
        return addToCartPopupHeader.isDisplayed();
    }

    public void clickContinueButton() {
        continueButton.click();


    }

    public void isContinueToCartButtonVisible() {
        continueToCartButton.isDisplayed();
    }

    public void clickContinueToCartButton() {
        continueToCartButton.click();
    }

    public WebElement getAddToCartPopupHeader() {
        return addToCartPopupHeader;
    }
}
