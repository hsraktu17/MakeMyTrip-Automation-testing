

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\mynam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.makemytrip.com/railways/");
        System.out.println("https://www.makemytrip.com/railways/");
        System.out.println("makemytrip");
        driver.manage().window().maximize();


        WebElement span1=driver.findElement(By.xpath("//span[text()='From']"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();",span1);
        Thread.sleep(2000);
        WebElement FromLocation=driver.findElement(By.xpath("//input[@placeholder='From']"));
        FromLocation.sendKeys("Delhi");
        Thread.sleep(2000);
        FromLocation.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        FromLocation.sendKeys(Keys.ENTER);
        Thread.sleep(2000);



        WebElement span2=driver.findElement(By.xpath("//span[text()=\"To\"]"));
        executor.executeScript("arguments[0].click();",span2);
        Thread.sleep(2000);
        WebElement ToLocation=driver.findElement(By.xpath("//input[@placeholder='To']"));
        ToLocation.sendKeys("Lucknow");
        Thread.sleep(2000);
        ToLocation.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        ToLocation.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement e5=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/label/span"));
        executor.executeScript("arguments[0].click();",e5);
        Thread.sleep(2000);
        WebElement e6= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]"));
        executor.executeScript("arguments[0].click();",e6);
        Thread.sleep(2000);


        WebElement e7=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span"));
        executor.executeScript("arguments[0].click();",e7);
        Thread.sleep(2000);
        WebElement e8= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/ul/li[3]"));
        executor.executeScript("arguments[0].click();",e8);
        Thread.sleep(2000);

        WebElement e9=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
        executor.executeScript("arguments[0].click();",e9);
        Thread.sleep(2000);

        System.out.println("Testing Successful");



        driver.quit();

    }
}
