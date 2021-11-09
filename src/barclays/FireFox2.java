package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox2 {
    public static void main(String[] args) {
        String baseUrl= "https://www.barclays.co.uk/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.close();
    }


}
