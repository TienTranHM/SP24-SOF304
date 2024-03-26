import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Fpoly\\SP_24\\SOF304_BL2\\Lib_SOF\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://lms.poly.edu.vn/");
        WebElement elementLogin =driver.findElement(By.xpath("//div[@class='p-4']//button[1]"));
        elementLogin.click();

        WebElement login = driver.findElement(By.xpath("//input[@id='username']"));
        login.sendKeys("tienthm@fpt.edu.vn");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");


    }
}