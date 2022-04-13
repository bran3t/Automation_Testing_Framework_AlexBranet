package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

public class WebDriverManager {
    public WebDriverManager(String browserType) {
        this.browserType = browserType;
    }

    private WebDriver driverVersionDetect;

    private String browserType;

    private void initializeDriver() {
        if (browserType.toUpperCase(Locale.ROOT).equals("CHROME")) {
            driverVersionDetect = new ChromeDriver();
        } else if (browserType.toUpperCase(Locale.ROOT).equals("FIREFOX")) {
            driverVersionDetect = new FirefoxDriver();
        } else {
            System.out.println("Nu exista un astfel de browser implementat");
        }
    }
//  single tone desing pattern
    public WebDriver getDriverVersionDetect() {
        if (driverVersionDetect == null) {
            System.out.println("Se initializeaza browserul dorit");
            initializeDriver();
        }
        return this.driverVersionDetect;
    }

}
