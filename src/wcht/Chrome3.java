package wcht;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome3 {
    public static void main(String[] args) {
        String baseUrl= "https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.close();
    }



}
