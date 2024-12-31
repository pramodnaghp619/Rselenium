import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Welcome_message {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.idrive360.com/enterprise/login");
        Thread.sleep(10000);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("augtest_040823@idrive.com");


        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("123456");

        WebElement showpassword = driver.findElement(By.linkText("Show"));
        showpassword.click();

        WebElement submit = driver.findElement(By.id("frm-btn"));
        submit.click();

        Thread.sleep(15000);

        WebElement Upgrade_message = driver.findElement(By.id("upgrade"));
        System.out.println(Upgrade_message.getText());

        WebElement Account_message = driver.findElement(By.id("expiredmsg"));
        System.out.println(Account_message.getText());

        driver.quit();

    }
}
