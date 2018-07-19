

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("https://www.booking.com/");
        
        WebElement destinationBox = driver.findElement(By.id("ss"));
        destinationBox.sendKeys("Belgrade");
        
        WebElement checkInBox = driver.findElement(By.className("c2-wrapper-s-checkin"));
        checkInBox.click();
        
        WebElement checkInDate = driver.findElement(By.className("c2-day-s-today"));
        checkInDate.click();
        
        WebElement checkOutBox = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[1]"));
        checkOutBox.click();
        
//        WebElement checkOutDate = driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div/div[3]/div/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[6]/td[2]/span"));
//        checkOutDate.click();

        List<WebElement> checkOutDates = driver.findElements(By.cssSelector("#frm > div.xp__fieldset > div.xp__dates > div > div:nth-child(3) > div > div > div > div.c2-calendar > div.c2-calendar-body > div.c2-calendar-viewport > div > div > div:nth-child(1) > table > tbody > tr:last-child > td.c2-day"));
        checkOutDates.get(checkOutDates.size() - 1).click();
        
        WebElement personsField = driver.findElement(By.id("xp__guests__toggle"));
        personsField.click();
        
        Select rooms = new Select(driver.findElement(By.id("no_rooms")));
        rooms.selectByValue("4");
        
        Select adults = new Select(driver.findElement(By.id("group_adults")));
        adults.selectByValue("8");
        
        Select children = new Select(driver.findElement(By.id("group_children")));
        children.selectByValue("2");
        
        Select children1AgeCheckIn = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 1 age\"]")));
        children1AgeCheckIn.selectByValue("12");
        
        Select children2AgeCheckIn = new Select(driver.findElement(By.cssSelector("[aria-label=\"Child 2 age\"]")));
        children2AgeCheckIn.selectByValue("12");
        
        WebElement searchButton = driver.findElement(By.className("sb-searchbox__button  "));
        searchButton.click();
        
    }
    
}
