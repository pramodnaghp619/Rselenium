import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Awesomeqatask {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://awesomeqa.com/practice.html");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("qa");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("test");

        WebElement Gender = driver.findElement(By.id("sex-0"));
        Gender.click();

        WebElement Exp = driver.findElement(By.id("exp-6"));
        Exp.click();

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.sendKeys("25/12/2024");

        WebElement Profession = driver.findElement(By.id("profession-1"));
        Profession.click();

        WebElement AutomationTool = driver.findElement(By.id("tool-2"));
        AutomationTool.click();

        WebElement SeleniumCommands = driver.findElement(By.xpath("//option[text()='WebElement Commands']"));
        SeleniumCommands.click();

        WebElement Submit = driver.findElement(By.id("submit"));
        Submit.click();

        driver.quit();


    }
}
