package nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MultiBrowser1 {
    static String baseUrl = "https://www.nopcommerce.com/demo";
    static String browser;
    static WebDriver driver;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Browser name :");
        browser = sc.nextLine();
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get(baseUrl);
        }else if(browser.equalsIgnoreCase("FireFox")){
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            driver= new FirefoxDriver();
            driver.get(baseUrl);
        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            driver= new EdgeDriver();
            driver.get(baseUrl);
        }else{
            System.out.println("The browser name is not correct.");
        }sc.close();


    }






}
