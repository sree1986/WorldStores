package sree;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Productcalc
		{

			public static void main(String[] args) {
				// checking contact us hyperlink 
				WebDriver driver=new FirefoxDriver();
				driver.get("http://www.modern.co.uk/");
				driver.findElement(By.xpath(".//*[@id='modern-main-menu']/li[5]/a")).click();
				driver.findElement(By.xpath(".//*[@id='item_image']/img")).click();
				driver.findElement(By.xpath(".//*[@id='qty_574']")).click();
				driver.findElement(By.xpath(".//*[@id='qty_574']/option[10]")).click();
				
				driver.findElement(By.id("ws-btnaddcart")).click();
				
				
				
				
				
				
				
	

			}

		


	}


