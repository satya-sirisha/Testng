package selenium_part1_introduction;


import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBatch {
  private WebDriver driver;
  private String baseUrl;
  public TestBatch() {
	// TODO Auto-generated constructor stub
  }

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\choud\\Desktop\\SELENIUM\\geckodriver\\geckodriver.exe");
	  driver=new FirefoxDriver();
   //driver.manage().window().maximize();
    baseUrl = "https://www.facebook.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void TestBatch1() throws Exception {
    driver.get(baseUrl );
   // driver.findElement(By.id("u_0_k")).clear();
    driver.findElement(By.id("u_0_l")).sendKeys("test");
    driver.findElement(By.id("u_0_i")).clear();
    driver.findElement(By.id("u_0_i")).sendKeys("edureka");
    driver.findElement(By.name("reg_email__")).clear();
    driver.findElement(By.name("reg_email__")).sendKeys("test@edureka.com");
    driver.findElement(By.id("u_0_s")).clear();
    driver.findElement(By.id("u_0_s")).sendKeys("test123");
	   
  }

  
}
