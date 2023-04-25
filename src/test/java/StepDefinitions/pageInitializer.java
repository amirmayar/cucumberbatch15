package StepDefinitions;

import Utils.CommonMethods;
import pages.AddEmployeePage;
import pages.LoginPage;

public class pageInitializer {
    public  static LoginPage login;
    public  static AddEmployeePage addEmployeePage;
    public  static void initializePageObjects()
    {
        login = new LoginPage();
        addEmployeePage= new AddEmployeePage();
    }
}