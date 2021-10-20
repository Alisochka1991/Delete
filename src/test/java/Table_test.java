import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.ClientInfoStatus;
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
        String text2 = wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)")).getText();
        Assert.assertEquals(text2,"Francisco Chang");

        //ili odnoi strokoi
        Assert.assertEquals(wd.findElement(By.cssSelector("tr:nth-child(4) td:nth-child(2)")).getText(),"Francisco Chang");

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
        String text3 = ernst.getText();
        Assert.assertTrue(text3.contains("Ernst Handel"));

    }
    @Test
    public void tableHw2()
    {
        List<WebElement> elements = wd.findElements(By.cssSelector("th"));
        System.out.println(elements.size());

        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());

        List<WebElement> columns = wd.findElements(By.cssSelector("tr th"));
        System.out.println("Print columns numbers of last column---->");
        System.out.println(columns.size());

        List<WebElement> row3 = wd.findElements(By.cssSelector("tr:nth-child(3) td"));
        wd.findElement(By.xpath("//tr[3]/td"));
        System.out.printf("Row 3---->"+row3.size());//raspechatat vsy 3 kolonky

        for (WebElement el:row3) {
            System.out.printf(el.getText());
        }
        for (int i = 0; i < row3.size(); i++) {
            System.out.println(row3.get(i).getText());
        }

        //print last column
        List<WebElement> lastColumn = wd.findElements(By.cssSelector("tr td:last-child"));
        for (WebElement el:lastColumn) {
            System.out.println(el.getText());

        }

//print Maria
        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)")).getText());
    }

    @AfterMethod
    public void tearDown()
    {
        wd.quit();
    }
}
