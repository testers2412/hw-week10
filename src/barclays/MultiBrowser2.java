package barclays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowser2 {
    static String baseUrl = "https://www.barclays.co.uk/";
    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Browser name: ");
        browser= sc.nextLine();
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get(baseUrl);
            driver.close();
        }else if(browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(baseUrl);
            driver.close();
        }else if (browser.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            driver = new EdgeDriver();
            driver.get(baseUrl);
            driver.close();
        }else{
            System.out.println("The browser name is not correct");
        }
        sc.close();
    }



}
