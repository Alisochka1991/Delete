import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition()
    {
        wd=new ChromeDriver();
       // wd.get("https://contacts-app.tobbymarshall815.vercel.app/login");//open site
        System.setProperty("webdriver.crome.driver","D:/QA30/Delete/chromedriver.exe");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open site and remember story
       // wd.navigate().forward();
        //open site
    }

    @Test
    public void testName()
    {
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        wd.findElement(By.className("container"));
        wd.findElement(By.cssSelector(".container"));//tochka oznachaet klass

        wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElement(By.className("login_login__3EHKB"));

                wd.findElement(By.id("root"));
                wd.findElement(By.cssSelector("#root"));//reshetka oznzchaet id

        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.cssSelector("[href]"));
        wd.findElement(By.cssSelector("[href^='/lo']"));//start
        wd.findElement(By.cssSelector("[href$='/in']"));//zakanchivaetsa
        wd.findElement(By.cssSelector("[href*='/ogi']"));//soderzit

                wd.findElement(By.tagName("a"));
        wd.findElement(By.tagName("input"));
        wd.findElement(By.tagName("button"));
        wd.findElement(By.tagName("h"));

        wd.findElement(By.cssSelector("a"));

        wd.findElement(By.cssSelector("div"));

                wd.findElement(By.linkText("HOME"));
        wd.findElement(By.linkText("ABOUT"));
        wd.findElement(By.linkText("LOGIN"));


                wd.findElement(By.partialLinkText("HO"));
        wd.findElement(By.partialLinkText("LOG"));
        wd.findElement(By.partialLinkText("OUT"));
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
