import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebAdminUI {

    public static void main(String[] args) {


        // Create an instance of the driver
        WebDriver driver = new ChromeDriver();

        //maximize the browser window
        driver.manage().window().maximize();

        // Navigate to a web page (launch the Chrome browser and open the app Url)
        driver.get("http://10.16.1.17:8888");

        // Get the WebElement logIn
        WebElement login = driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-9\"]/ul/li[2]/a"));
        login.click();

        WebElement username = driver.findElement(By.id("Username"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("p@ssw0rd");

        WebElement signin = driver.findElement(By.xpath("/html/body/div/form/button"));
        signin.click();

        // Get webElement catalog

        WebElement Catalog = driver


                
        driver.close();
        driver.quit();







    }
}
