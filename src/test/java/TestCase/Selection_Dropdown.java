package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BrowserSetup;
import PageObjectRepository.guberPage;
import Utility.UtilFile;

public class Selection_Dropdown extends BrowserSetup {

	static Properties prop;
	static FileInputStream file;
	static File filepath = new File(System.getProperty("user.dir") + "\\config\\file.properties");

	guberPage lp;
	UtilFile ut;

	public static void Configuration() {
		try {
			file = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeMethod
	public void OpeningBrwoser() throws Throwable {
		Configuration();
		driver = BrowserSetup.StartBrowser(prop.getProperty("BrowserType"), prop.getProperty("Url"));

	}

	@Test(priority=0,enabled=true)
	public void Choose_any_value_from_the_dropdown_list() {
		Configuration();
		lp = new guberPage(driver);
		ut = new UtilFile(driver);
		ut.pause(1000);
		lp.ClickOnItems();
		ut.pause(1000);
		lp.GetListOfItems(prop.getProperty("Items"));driver.quit();
		ut.pause(1000);
		driver.quit();
	}
	
	@Test(priority=1,enabled=true)
	public void PeopleNameWithOnlyBlueColor() {
		lp = new guberPage(driver);
		ut = new UtilFile(driver);
		ut.pause(1000);
		lp.PeopleNameWithBlueColor();
		ut.pause(1000);
		driver.quit();
}
	
	@Test(priority=2,enabled=true)
	public void returns_integer_after_division_by_2() {
		lp = new guberPage(driver);
		ut = new UtilFile(driver);
		ut.pause(1000);
		lp.GetListOfIds();
		driver.quit();
}
	
	@Test(priority=3,enabled=true)
	public void Create_list_of_peoplenames_with_Blue_text_in_the_Color_column() {
		lp = new guberPage(driver);
		ut = new UtilFile(driver);
		ut.pause(1000);
		lp.GetListofNameswhoareBlue();
		driver.quit();
}
	
	@Test(priority=4,enabled=true)
	public void CombinationOf2AND4() {
		lp = new guberPage(driver);
		ut = new UtilFile(driver);
		ut.pause(1000);
		lp.CombinationOf2AND4();
		driver.quit();
}
}