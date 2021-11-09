package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox1 {
    public static void main(String[] args) {
        String baseUrl= "https://www.nopcommerce.com/demo";

        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.get(baseUrl);
        driver.close();


    }

}
