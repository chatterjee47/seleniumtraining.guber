package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilFile {
	WebDriver driver;
	static String parentId;
	static String childId;

	public UtilFile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void pause(Integer milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	

}
