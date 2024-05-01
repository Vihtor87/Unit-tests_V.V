package seminars.five;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest {

    @Test
    public void testGoogleSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();

        Thread.sleep(30);

        List<WebElement> searchRes = driver.findElements(By.cssSelector("div"));

        boolean isFound = false;
        for (WebElement webElement : searchRes) {
            //System.out.println(webElement.getText());
            if (webElement.getText().contains("https://www.selenium.dev")) {
                isFound = true;
                break;
            }
        }

        assertTrue(isFound);
        driver.quit();
    }

    @Test
    public void checkRegistrationToSite() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");

        WebElement loginBox = driver.findElement(By.id("user-name"));
        Thread.sleep(1000);
        loginBox.sendKeys("standard_user");
        WebElement pswBox = driver.findElement(By.id("password"));
        Thread.sleep(1000);
        pswBox.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));

        Thread.sleep(1000);

        loginButton.click();

        Thread.sleep(1000);

        WebElement productsLabel = driver.findElement(By.className("title"));

        assertEquals("Products", productsLabel.getText());
        driver.quit();
    }
}
