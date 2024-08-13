import org.example.ElementsPage;
import org.example.WebTablesPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;


public class WebTablesTests extends BaseTest {

    @BeforeMethod
    public void initPages() {
        webTablesPage = new WebTablesPage(driver);;
    }

    @Test
    public void addingAndEditingUser() {
        webTablesPage.openElementsPage();
        webTablesPage.openWebTablesPage();
        webTablesPage.clickAddButton();
        webTablesPage.enterFirstname("Ignat");
        webTablesPage.enterLastname("Krabenko");
        webTablesPage.enterEmail("krabenko@yopmail.com");
        webTablesPage.enterAge("20");
        webTablesPage.enterSalary("100000");
        webTablesPage.enterDepartment("QA Department");
        webTablesPage.clickSubmitButton();
        webTablesPage.clickEditButton();
        webTablesPage.editFirstname("Vasyan");
        webTablesPage.editLastname("Krabyan");
        webTablesPage.editEmail("123@yopmail.com");
        webTablesPage.editAge("22");
        webTablesPage.editSalary("999999");
        webTablesPage.editDepartment("Development Department");
        webTablesPage.clickSubmitButton();
    }
}
