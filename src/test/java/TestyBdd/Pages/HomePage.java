package TestyBdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{
    private static String HOMEPAGE_URL = "https://skleptest.pl";

    @FindBy(how = How.CSS, using = ".site-title-description > .site-title")
    WebElement HomePageName;

    @FindBy(how = How.CSS, using = ".top-account")
    WebElement AccountButton;

    public void openHomePage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(HomePageName));
    }
    public String getHomepageName() {
        return HomePageName.getText();
    }
}
