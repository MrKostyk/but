import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/шлях/до/драйвера/chromedriver");


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.example.com");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        WebElement button = driver.findElement(By.id("button"));


        button.click();


        WebElement infoElement = driver.findElement(By.id("info"));
        String infoText = infoElement.getText();

  ь
        System.out.println(infoText);


        driver.quit();
    }
}