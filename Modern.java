package sree;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;

		public class Modern
		{

			public static void main(String[] args) {
				// checking contact us hyperlink 
				WebDriver driver=new FirefoxDriver();
				driver.get("http://www.modern.co.uk/");
				driver.findElement(By.xpath(".//*[@id='modern-main-menu']/li[5]/a")).click();
				
				driver.findElement(By.xpath(".//*[@id='modern-main-menu']/li[5]/div/div/div/ul/li[2]/a")).click();
				driver.findElement(By.xpath(".//*[@id='mod_block_products_list']/div[1]/table/tbody/tr/td[3]/div/form/div/select")).click();
				driver.findElement(By.xpath(".//*[@id='mod_block_products_list']/div[1]/table/tbody/tr/td[3]/div/form/div/select/option[1]")).click();
				driver.findElement(By.xpath(".//*[@id='mod_block_products_list']/div[1]/table/tbody/tr/td[3]/div/form/div/select/option[1]")).click();
				
				
				
				
				
				
				
				
	

			}

		


	}


