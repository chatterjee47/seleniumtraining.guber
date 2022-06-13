package PageObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guberPage {
	WebDriver driver;
	
	public guberPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'Items')]")
	private WebElement Items;
	
	@FindBy(xpath = "//*[@class='dropdown-menu show']/a[@class='dropdown-item']")
	private List<WebElement> ListOfItems;
	
	@FindBy(xpath = "//table/tbody/tr/td[@bgcolor='Blue']//parent::*/td[1]")
	private List<WebElement> PeopleNameWithBlueColor;
	
	@FindBy(xpath = "//table/tbody/tr/td//parent::*/td[2]")
	private List<WebElement> GetListOfIds;
	
	
	@FindBy(xpath = "//table/tbody/tr/td[3]")
	private List<WebElement> GetBlues;
	
	@FindBy(xpath = "//table/tbody/tr/td[3]//parent::*/td[1]")
	private List<WebElement> ListofNames;
	
	
	
	
	public void GetListofNameswhoareBlue() {
		List<WebElement> listOfItems = GetBlues;
		int count = listOfItems.size();
		for(int i=0;i<count;i++) {
			if(listOfItems.get(i).getText().equals("Blue")) {
				System.out.println(listOfItems.get(i).getText());
				System.out.println(ListofNames.get(i).getText());
			}
		}
	}

	
	public void ClickOnItems() {
		Items.click();
	}
	
	
	public void CombinationOf2AND4() {
		List<WebElement> listOfItems = GetBlues;
		int count = listOfItems.size();
		for(int i=0;i<count;i++) {
			if(listOfItems.get(i).getText().equals("Blue")) {
			System.out.println(listOfItems.get(i).getText());
			String numberText = GetListOfIds.get(i).getText();
			int intNum=Integer.parseInt(numberText);   
			 if(intNum % 2 == 0) {
			 System.out.println(ListofNames.get(i).getText());
		}
			}
		}
	}
	public void GetListOfIds() {
		List<WebElement> listOfItems = GetListOfIds;
		int count = listOfItems.size();
		
		for(int i=0;i<count;i++) {
			String numberText = listOfItems.get(i).getText();
			int intNum=Integer.parseInt(numberText);   
			 if(intNum % 2 == 0) {
			 System.out.println(ListofNames.get(i).getText());
			 
			 }}
	}
	
	public void PeopleNameWithBlueColor() {
		List<WebElement> listOfItems = PeopleNameWithBlueColor;
		int count = listOfItems.size();
		
		for(int i=0;i<count;i++) {
			System.out.println(listOfItems.get(i).getText());
		}
	}
	
	public void GetListOfItems(String Item) {
		List<WebElement> listOfItems = ListOfItems;
		int count = listOfItems.size();
		
		for(int i=0;i<count;i++) {
			System.out.println(listOfItems.get(i).getText());
			if(listOfItems.get(i).getText().equals(Item)) {
				listOfItems.get(i).click();
				break;
			}
		}
	}

	

}
