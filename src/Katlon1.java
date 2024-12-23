import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Katlon1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

        WebElement Make_appointment = driver.findElement(By.id("btn-make-appointment"));
        Make_appointment.click();

        WebElement User_name= driver.findElement(By.id("txt-username"));
        User_name.sendKeys("John Doe");

        WebElement Password = driver.findElement(By.id("txt-password"));
        Password.sendKeys("ThisIsNotAPassword");

        WebElement Login = driver.findElement(By.id("btn-login"));
        Login.click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

        WebElement Apply_checkbox = driver.findElement(By.id("chk_hospotal_readmission"));
        Apply_checkbox.click();

        WebElement calendar = driver.findElement(By.id("txt_visit_date"));
        calendar.sendKeys("25/12/2024");

        WebElement comment = driver.findElement(By.id("txt_comment"));
        comment.sendKeys("selenium");

        WebElement Book_appointment = driver.findElement(By.id("btn-book-appointment"));
        Book_appointment.click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

        WebElement confirmation_message = driver.findElement(By.xpath("//h2"));
        System.out.println(confirmation_message);

        WebElement Home_page_button = driver.findElement(By.linkText("Go to Homepage"));
        Home_page_button.click();

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
