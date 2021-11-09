package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome2 {
    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.close();
    }


}
