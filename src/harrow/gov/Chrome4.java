package harrow.gov;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome4 {
    public static void main(String[] args) {
        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.close();
    }

}
