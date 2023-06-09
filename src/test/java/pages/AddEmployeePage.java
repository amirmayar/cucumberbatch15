package pages;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.GlobalVariables;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    @FindBy(id = "menu_pim_viewPimModule")
    public static WebElement pimTab;

    @FindBy(id = "menu_pim_addEmployee")
    public static WebElement eddEmpBtn;

    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "middleName")
    public WebElement middleNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

    public AddEmployeePage() {
        PageFactory.initElements(driver, this);

    }
}
