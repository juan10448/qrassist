/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDao;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/**
 *
 * @author juans
 */
public class consultaFichas {
    
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        
        
    driver.get("http://localhost:8080/Qrassist_Sebas/consultarFicha.jsp");
    driver.manage().window().setSize(new Dimension(1382, 784));
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("idFicha")).click();
    driver.findElement(By.id("idFicha")).sendKeys("131313");
    driver.findElement(By.cssSelector(".submit-button")).click();
    driver.findElement(By.name("feFin")).click();
    driver.findElement(By.name("feFin")).sendKeys("2023-07-18");
    driver.findElement(By.cssSelector(".my-button:nth-child(7)")).click();
        
    }
    
}
