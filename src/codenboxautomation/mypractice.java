package codenboxautomation;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.awt.RenderingHints.Key;
import java.nio.channels.SelectableChannel;
import java.security.spec.KeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.swing.plaf.basic.BasicArrowButton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class mypractice {

	WebDriver driver = new ChromeDriver();

	String mywebsite = "https://codenboxautomationlab.com/practice/";

	Random rand = new Random();

	@BeforeTest

	public void MySetUp() {

		driver.manage().window().maximize();

		driver.get(mywebsite);

	}

	@Test(priority = 1, invocationCount = 1, enabled = false)
	public void Radio_Button_Example() {

		List<WebElement> AllRadioButtons = driver.findElements(By.className("radioButton"));
		// for ( int i=0;i<AllRadioButtons.size();i++)
		// AllRadioButtons.get(i).click();

		int randomindex = rand.nextInt(AllRadioButtons.size());

		AllRadioButtons.get(randomindex).click();

	}

	@Test(priority = 2, enabled = false)

	public void Dynamic_Dropdown_Example() throws InterruptedException {

		String[] contury = { "US", "CA", "BR", "AR", "ES", "Om", "FR" };

		int randomex = rand.nextInt(contury.length);

		WebElement Dynamic = driver.findElement(By.id("autocomplete"));

		Dynamic.sendKeys(contury[randomex]);
		Thread.sleep(2000);
		Dynamic.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));

	}

	@Test(priority = 3, enabled = false)

	public void Static_Dropdown_Example() {

		WebElement Static = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(Static);
		sel.selectByIndex(3);

	}

	@Test(priority = 4, enabled = false)

	public void Checkbox_Example() {
		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));

		int rando = rand.nextInt(check.size());

		check.get(rando).click();

	}

	@Test(priority = 5, enabled = false)

	public void Switch_Window_Example() {

		WebElement switc = driver.findElement(By.id("openwindow"));

		switc.click();
		
		List<String> windowhandls= new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windowhandls.get(1));
		
		WebElement contact = driver.findElement(By.id("menu-item-9680"))	;
		
		contact.click();
		

	}
	
	@Test(priority = 6, enabled = true)

	public void Switch_Tab_Example() {
		WebElement switchd = driver.findElement(By.id("opentab"));
		switchd.click();
		
		List<String> opentab = new ArrayList<String>(driver.getWindowHandles());
		
		
		driver.switchTo().window(opentab.get(1));
		
		
System.out.println(driver.getTitle());		

driver.close();
	}

	@Test(priority = 7, enabled = false)
	
	public void SwitchToAlertExample() {
		
		
		WebElement arr = driver.findElement(By.id("name"));
		
		arr.sendKeys("heba");
		
		WebElement ALERTBOX = driver.findElement(By.id("alertbtn"));
		
		ALERTBOX.click();

	//	driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().dismiss();
		//WebElement confarimBOX = driver.findElement(By.id("confirmbtn"));
		
		//confarimBOX.click();

		
		

		
		
		
	}



}
