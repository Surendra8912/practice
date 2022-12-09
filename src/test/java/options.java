//import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class options {
    WebDriver driver;

    public void Main() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        //single selection dropdown
    }
    public void book() throws InterruptedException {
        WebElement singleselection = driver.findElement(By.id("course"));
        Select singledropdown = new Select(singleselection);
        singledropdown.selectByIndex(1);
        Thread.sleep(5000);
        singledropdown.selectByValue("net");
        Thread.sleep(5000);
        singledropdown.selectByVisibleText("Python");
        Thread.sleep(5000);
        singledropdown.deselectByVisibleText("Python");
        Thread.sleep(3000);

        //Multiple selection dd
        WebElement multipleselection = driver.findElement(By.id("ide"));
        Select multidropdown = new Select(multipleselection);
        multidropdown.selectByIndex(2);
        Thread.sleep(3000);
        multidropdown.selectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);
        multidropdown.selectByValue("nb");
        Thread.sleep(3000);
        multidropdown.deselectByIndex(2);
        Thread.sleep(3000);
        multidropdown.deselectByVisibleText("IntelliJ IDEA");
        Thread.sleep(3000);
        //GET Options Single dd
        List<WebElement> singleoptions = singledropdown.getOptions();
        for(WebElement Element : singleoptions) {
            System.out.println("All the available options of single dropdown is: "+Element.getText());
        }
     //GET options Multiple dd
        List<WebElement> Multipleoptions = multidropdown.getOptions();
        for(WebElement multiple : Multipleoptions) {
            System.out.println("All the Available Multiselection dropdown options are:"+multiple.getText());
        }
   //Get Seleced options Single dd
        List<WebElement> Selectedopt = singledropdown.getAllSelectedOptions();
        for(WebElement selectsingle : Selectedopt) {
            System.out.println("All the selected options of Single dd:"+selectsingle.getText());
        }
        //first selected option in single dd
     WebElement firstone = singledropdown.getFirstSelectedOption();
            System.out.println("The first selected Option is:"+ firstone.getText());
            //first selected in multiple dd
     WebElement secondone = multidropdown.getFirstSelectedOption();
        System.out.println("The first selected option in multiple dd is:"+secondone.getText());
    }
}
