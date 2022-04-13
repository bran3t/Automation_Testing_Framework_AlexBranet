import managers.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TestRunner {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver openBrowser = new ChromeDriver();
//        openBrowser.get("https://www.google.com/");
//        openBrowser.close();

        WebDriverManager webDriverManagerObject = new WebDriverManager("Chrome");
        System.out.println(webDriverManagerObject.getDriverVersionDetect());
        webDriverManagerObject.getDriverVersionDetect().get("https://www.google.com/");
        webDriverManagerObject.getDriverVersionDetect().close();
        webDriverManagerObject.getDriverVersionDetect().quit();
    }
}
