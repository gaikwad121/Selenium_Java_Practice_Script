package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.annotations.Test;

import base.BaseTest;
public class Xpath_Code extends BaseTest{
	@Test
	void Test1() throws InterruptedException {
		 
		// Find the sign-up button from the registration fom present in the facebook Appication
     driver.get("https://www.facebook.com/r.php?entry_point=login");
     driver.navigate().refresh();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div/button")).click();
	}
@Test
void Test2() {
	//Locate Firstname field from Signup button in facebook
	driver.get("https://www.facebook.com/r.php?entry_point=login");
    driver.navigate().refresh();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

WebElement txt=	driver.findElement(By.xpath("//button[.='Sign Up']/parent::div/parent::div/child::div//div[text()='First name']"));
//.sendKeys("jyo");
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].value='Jyo'; arguments[0].dispatchEvent(new Event('input'));", txt);
}
}
