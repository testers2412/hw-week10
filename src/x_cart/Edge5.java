package x_cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge5 {
    public static void main(String[] args) {
        String baseUrl="https://www.x-cart.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.close();
    }

}
