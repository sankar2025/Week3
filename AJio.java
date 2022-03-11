package week3.day1;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AJio {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();	
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[1]")).click();

		driver.findElement(By.xpath("(//div[@class='facet-linkhead']//label)[4]")).click();
		
			
	   String  countItem=driver.findElement(By.className("length")).getText();
	   System.out.println("Total No of item  - "+countItem);
	
	   
	   
		System.out.println("Name of the Brand ");
		List <WebElement> bagscountname = driver.findElements(By.className("brand"));
		for (int i = 0; i < bagscountname.size(); i++) {
			System.out.println(bagscountname.get(i).getText());		
			
			
		}
	
		System.out.println("Name of the Bags ");
		List<WebElement> bagsName = driver.findElements(By.className("nameCls"));
	for (int j=0; j < bagsName.size(); j++) {
		System.out.println(bagsName.get(j).getText());
		
	}
	


	}

}
