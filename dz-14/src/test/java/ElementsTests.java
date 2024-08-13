import org.example.ElementsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class ElementsTests extends BaseTest {

    @BeforeMethod
    public void initPages() {
        elementsPage = new ElementsPage(driver);;
    }

    @Test
    public void textPrint() {

        elementsPage.openElementsPage();
        elementsPage.clickButtonsButton();
        elementsPage.clickMeTheButton();
        elementsPage.getText();
    }
}
