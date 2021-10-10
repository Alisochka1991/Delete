import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition()
    {
        wd=new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");//open site
        System.setProperty("webdriver.crome.driver",)
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open site and remember story
       // wd.navigate().forward();
        //open site
    }

    @Test
    public void testName()
    {

        //click login button
    }
    @Test public void testName2()
    {

    }

    @AfterMethod
    public void postCondition()
    {
     //wd.quit();
    }

}
