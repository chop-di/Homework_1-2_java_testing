import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
        driver.get("http://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("abc@gmail.com");
        element = driver.findElement(By.xpath("//input[@name='pass']"));
        element.sendKeys("abbaas");
        WebElement button = driver.findElement(By.xpath("//input[@name='login']"));
        button.click();
Thread.sleep(10000);
driver.close();
    }
}