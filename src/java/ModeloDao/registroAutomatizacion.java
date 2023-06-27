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
public class registroAutomatizacion {
    
    
    public static void main(String[] args){
        
        WebDriver driver = new ChromeDriver();
    
     driver.get("http://localhost:8080/Qrassist_Sebas/registroUsuario.jsp");
    driver.manage().window().setSize(new Dimension(618, 592));
    driver.findElement(By.name("nomUsu")).click();
    driver.findElement(By.name("nomUsu")).sendKeys("sophia");
    driver.findElement(By.name("apeUsu")).click();
    driver.findElement(By.name("apeUsu")).sendKeys("regino romero");
    driver.findElement(By.name("idTipoDoc")).click();
    {
      WebElement dropdown = driver.findElement(By.name("idTipoDoc"));
      dropdown.findElement(By.xpath("//option[. = 'Cedula Ciudadania']")).click();
    }
    driver.findElement(By.name("numDoc")).click();
    driver.findElement(By.name("numDoc")).sendKeys("11012883183");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("sophia1234");
    driver.findElement(By.name("mail")).click();
    driver.findElement(By.name("mail")).sendKeys("sophia123@gmail.com");
    driver.findElement(By.name("direc")).click();
    driver.findElement(By.name("direc")).sendKeys("carrera 95 n bis B 12");
    driver.findElement(By.name("direc")).click();
    driver.findElement(By.name("direc")).sendKeys("carrera 128 n bis B 12");
    driver.findElement(By.cssSelector("form")).click();
    driver.findElement(By.cssSelector("form")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("form"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.name("telefo")).sendKeys("3132184502");
    driver.findElement(By.name("telefo")).sendKeys("3132182302");
    driver.findElement(By.cssSelector(".register-button")).click();
    driver.close();
    }
    
}
