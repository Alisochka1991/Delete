import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Table_test {
    WebDriver wd;

    @BeforeMethod
    public void init()
    {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
    @Test
    public void tableTestCss()
    {
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        String text = canada.getText();
        System.out.println(text);

        Assert.assertEquals(text,"Canada");
        Assert.assertTrue(text.contains("Can"));

    }
    @Test
    public void tableHW()
    {
        WebElement francisco = wd.findElement(By.cssSelector("tr:nth-child(4)"));
        String text = francisco.getText();
        System.out.println(text);
        Assert.assertTrue(text.contains("Francisco Chang"));
        Assert.assertFalse(text.contains("Francisso Chang"));

        wd.findElement(By.cssSelector("#navbtn_references"));
        wd.findElement(By.cssSelector(".color_h1"));
        wd.findElement(By.cssSelector(".intro"));
        wd.findElement(By.cssSelector("[class^='int']"));
        wd.findElement(By.cssSelector(".alt"));
        wd.findElement(By.cssSelector("[class$='lt']"));
        wd.findElement(By.cssSelector("#customers"));
        wd.findElement(By.cssSelector("[id*='stom']"));
        wd.findElement(By.cssSelector("[href='css_list.asp']"));
        wd.findElement(By.cssSelector("[href='css_table_size.asp']"));
        wd.findElement(By.cssSelector("[href^='css']"));
        wd.findElement(By.cssSelector("[href$='asp']"));
        wd.findElement(By.cssSelector("[href*='table']"));
        wd.findElement(By.cssSelector("."));



        WebElement ernst = wd.findElement(By.cssSelector("tr:nth-child(5) td:first-child"));
        String text2 = ernst.getText();
        Assert.assertTrue(text2.contains("Ernst Handel"));

    }
    @Test
    public void tableHw2()
    {
        WebElement element = wd.findElement(By.tagName("th"));
        List<WebElement> elements = wd.findElements(By.cssSelector("th"));
        for(int i=0;i<elements.size();i++)
        {
            System.out.println(elements.size());
        }
        System.out.println("     ");

        WebElement element1 = wd.findElement(By.tagName("tr"));
        List<WebElement> elements1 = wd.findElements(By.cssSelector("tr"));
        for(int i=0;i<elements.size();i++)
        {
            System.out.println(elements1.size());
        }


    }

    @AfterMethod
    public void tearDown()
    {
        wd.quit();
    }
}
