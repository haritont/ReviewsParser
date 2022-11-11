import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Parser {
    private String url;
    private WebDriver driver;

    public Parser(){
        System.setProperty("webdriver.chrome.driver", "selenium\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void Start(){
        driver.get(url);
        Work();
    }

    private void Work(){
        ArrayList<WebElement> companies = (ArrayList<WebElement>) driver.findElements(new By.ByXPath("//*[@id=\"main\"]/div[1]/div/div"));
    }

    public void End(){
        driver.quit();
    }
}
