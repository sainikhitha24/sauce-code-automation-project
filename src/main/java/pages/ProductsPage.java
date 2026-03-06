package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    @FindBy(className = "title")
    private WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCartBackpackButton;

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartBadge;

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return pageTitle.getText();
    }

    public void addBackpackToCart() {
        addToCartBackpackButton.click();
    }

    public String getCartItemCount() {
        return cartBadge.getText();
    }
}
