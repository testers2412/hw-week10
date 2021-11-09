package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge1 {
    public static void main(String[] args) {
        String baseUrl= "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.close();



    }


}
