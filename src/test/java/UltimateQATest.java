import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// modyfikatory dostepu (public / private / protected)
public class UltimateQATest extends PageSetup {

    @Test
    public void testOne() throws InterruptedException {
        WebElement button = driver.findElementById("idExample");
        button.click();

        // Waity w Selenium: implicit wait, explicit wait, fluent wait
        Thread.sleep(2000);

        WebElement text = driver.findElementByClassName("entry-title");
        Assertions.assertEquals("Button success", text.getText());
    }


    @Test
    public void testTwo() throws InterruptedException {
        WebElement nameInput = driver.findElementById("et_pb_contact_name_0");
        nameInput.sendKeys("Tester");

        Thread.sleep(2000);

        WebElement emailInput = driver.findElementById("et_pb_contact_email_0");
        emailInput.sendKeys("tester@tester.pl");

        Thread.sleep(2000);

        WebElement buttonEmailMe = driver.findElementByName("et_builder_submit_button");
        buttonEmailMe.click();

        Thread.sleep(3000);

        WebElement thanksText = driver.findElementByXPath("//div[@class='et-pb-contact-message']/p");
        Assertions.assertEquals("Thanks for contacting us", thanksText.getText());

    }


}
