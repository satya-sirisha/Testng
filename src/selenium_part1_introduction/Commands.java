package selenium_part1_introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commands {


static WebDriver driver;
	
	public static WebDriver browserSelect(String bname){
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium3.0\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();			
		} else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium3.0\\geckodriver-v0.13.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("The browser name is wrong");	
		}
		return driver;
	}
	
	public static void main(String[] args) throws InterruptedException {
		browserSelect("chrome");
		
//		driver.get("https://www.facebook.com/");
		
		//driver.navigate().to("https://www.facebook.com/");
		
//		Get title
//		Get current Url
//		Get page source 
//		get window handle = CDwindow-c2a4262d-7733-4cd4-ab27-362926e06205
//		close
//		quit
		
	/*	String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		String windowSessionID = driver.getWindowHandle();
		System.out.println(windowSessionID);

		
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Test1");
		
		driver.findElement(By.cssSelector("input[type='radio'][value='2'][name='sex']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();

		String pagetitle2 = driver.getTitle();
		System.out.println(pagetitle2);

		String pageURL2 = driver.getCurrentUrl();
		System.out.println(pageURL2);
		
		String windowSessionID2 = driver.getWindowHandle();
		System.out.println(windowSessionID2);
		
		if (pagetitle2.equals("Forgotten Password | Can't Log In | Facebook")) {
			System.out.println("My Test case is PASS");
		} else {
			System.out.println("My Test case is FAIL");
		}
		
		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		driver.navigate().forward();
		
		Thread.sleep(4000);
		driver.findElement(By.id("identify_email")).sendKeys("Supreet@test.com");
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		
		Thread.sleep(4000);
		driver.quit();*/
	}
	}


