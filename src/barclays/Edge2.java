package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge2 {

    public static void main(String[] args) {
        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.close();

    }



}
