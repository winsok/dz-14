package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsPage {

    private WebDriver driver;

    private By elementsButton = By.xpath("//h5[contains(text(), 'Elements')]");

    private By buttonsButton = By.id("item-4");

    private By clickmeButton = By.xpath("//button[text() = 'Click Me']");

    private By buttonText = By.id("dynamicClickMessage");

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openElementsPage() {

        WebElement openThePage = driver.findElement(elementsButton);
        openThePage.click();
    }

    public void clickMeTheButton() {
        WebElement clickButton = driver.findElement(clickmeButton);
        clickButton.click();
    }

    public void clickButtonsButton() {
        WebElement clickButtonsButton = driver.findElement(buttonsButton);
        clickButtonsButton.click();
    }

    public void getText() {
        WebElement dynamicText = driver.findElement(buttonText);
        System.out.println(dynamicText.getText());
    }

}
