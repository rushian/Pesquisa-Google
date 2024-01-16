import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement campoBusca = driver.findElement(By.name("q"));
        campoBusca.sendKeys("Testes Automatizados com java");
        campoBusca.sendKeys(Keys.TAB);
      
        driver.findElement(By.xpath("//div[4]/center/input[1]")).click();
        Thread.sleep(3000);
        driver.quit();   
    }
}