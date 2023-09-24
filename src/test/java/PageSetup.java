import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSetup {

    // typy zmiennych proste i obiektowe
    // przeciazanie metod - tzw. overload
    String projectLocation = System.getProperty("user.dir");
    ChromeDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", projectLocation + "/resources/chromedriver117.exe");
        driver = new ChromeDriver();

        // Page Object Model
        driver.manage().window().maximize();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
    }

    @AfterEach
    public void teardown() {
        // zmienne lokalne i globalne
        driver.quit();
    }
}
