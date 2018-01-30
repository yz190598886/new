package seleniumtest;


import org.apache.commons.io.FileUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;


/**
 * Hello world!
 *
 */
public class App {

        public static void login(String mobile, String password) throws Exception {

                System.setProperty("webdriver.chrome.driver", "H:\\Temp\\chromedriver.exe");
                ChromeDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//设置默认等待时间，如果没有发现要找的元素就会默认等待10秒钟
                driver.get("https://test.chinaylzl.com/Gover");
                driver.findElement(By.id("mobile")).clear();
                driver.findElement(By.id("mobile")).sendKeys(mobile);
                driver.findElement(By.id("password")).clear();
                driver.findElement(By.id("password")).sendKeys(password);
                driver.findElement(By.id("login")).click();
                driver.getCurrentUrl();
                assertTrue(driver.getCurrentUrl().contains("/function/index"));
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");  //转换时间格式
                String time = dateFormat.format(Calendar.getInstance().getTime());  //获取当前时间
                File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  //执行屏幕截取
                FileUtils.copyFile(srcFile, new File("H:\\屏幕截图", time + ".png")); //利用FileUtils工具类的copyFile()方法保存getScreenshotAs()返回的文件;"屏幕截图"即时保存截图的文件夹
                    }

        public static void main(String[] args) throws Exception {
            login("13880400623", "158743");
        }
    }

