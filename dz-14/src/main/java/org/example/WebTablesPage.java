package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {

    private WebDriver driver;

    private By elementsButton = By.xpath("//h5[contains(text(), 'Elements')]");

    private By webTablesButton = By.xpath("//span[text() = 'Web Tables']");

    private By addButton = By.id("addNewRecordButton");

    private By firstNameField = By.id("firstName");

    private By lastNameField = By.id("lastName");

    private By emailField = By.id("userEmail");

    private By ageField = By.id("age");

    private By salaryField = By.id("salary");

    private By departmentField = By.id("department");

    private By submitButton = By.id("submit");

    private By editButton = By.xpath("(//span[@title = 'Edit'])[last()]");


    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openElementsPage() {
        WebElement openThePage = driver.findElement(elementsButton);
        openThePage.click();
    }

    public void openWebTablesPage() {
        WebElement openWebTablesPage = driver.findElement(webTablesButton);
        openWebTablesPage.click();
    }

    public void clickAddButton() {
        WebElement addBut = driver.findElement(addButton);
        addBut.click();
    }

    public void enterFirstname(String username) {
        WebElement enterFirstnameField = driver.findElement(firstNameField);
        enterFirstnameField.sendKeys(username);
    }

    public void enterLastname(String lastname) {
        WebElement enterLastnameField = driver.findElement(lastNameField);
        enterLastnameField.sendKeys(lastname);
    }

    public void enterEmail(String email) {
        WebElement enterEmailField = driver.findElement(emailField);
        enterEmailField.sendKeys(email);
    }

    public void enterAge(String age) {
        WebElement enterAgeField = driver.findElement(ageField);
        enterAgeField.sendKeys(age);
    }

    public void enterSalary(String salary) {
        WebElement enterSalaryField = driver.findElement(salaryField);
        enterSalaryField.sendKeys(salary);
    }

    public void enterDepartment(String department) {
        WebElement enterDepartmentField = driver.findElement(departmentField);
        enterDepartmentField.sendKeys(department);
    }

    public void clickSubmitButton() {
        WebElement clickSubmit = driver.findElement(submitButton);
        clickSubmit.click();
    }

    public void clickEditButton() {
        WebElement clickEdit = driver.findElement(editButton);
        clickEdit.click();
    }
//Edit methods

    public void editFirstname(String username) {
        WebElement editFirstnameField = driver.findElement(firstNameField);
        editFirstnameField.clear();
        editFirstnameField.sendKeys(username);
    }

    public void editLastname(String lastname) {
        WebElement editLastnameField = driver.findElement(lastNameField);
        editLastnameField.clear();
        editLastnameField.sendKeys(lastname);
    }

    public void editEmail(String email) {
        WebElement editEmailField = driver.findElement(emailField);
        editEmailField.clear();
        editEmailField.sendKeys(email);
    }

    public void editAge(String age) {
        WebElement editAgeField = driver.findElement(ageField);
        editAgeField.clear();
        editAgeField.sendKeys(age);
    }

    public void editSalary(String salary) {
        WebElement editSalaryField = driver.findElement(salaryField);
        editSalaryField.clear();
        editSalaryField.sendKeys(salary);
    }
    public void editDepartment(String department) {
        WebElement editDepartmentField = driver.findElement(departmentField);
        editDepartmentField.clear();
        editDepartmentField.sendKeys(department);
    }
}
