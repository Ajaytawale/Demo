package testng;
package regression;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.uiFramework.KTCTC.Pages.InventoryCategoryPage;
import com.uiFramework.KTCTC.helper.browserConfiguration.ChromeBrowser;
import com.uiFramework.KTCTC.testbase.TestBase;

	

	public class InventoryCategoryTest extends TestBase{

		InventoryCategoryPage inventoryCategoryPage;
		String categoryName = "";
		String newCategoryName = "";
		
		@BeforeClass
		public void beforeClassOfA() {
			driver = ChromeBrowser.getBrowserInstance();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.manage().deleteAllCookies();
			//driver.manage().window().maximize();
			test = extent.createTest(getClass().getSimpleName());
			driver.get(proObj.getPropertyValueFromFile("baseURL"));
			cmObj.acceptPrivateConnectionWarningIfPresent(driver);		
			cmObj.loginToApplication(driver, proObj.getPropertyValueFromFile("adminNumber"),proObj.getPropertyValueFromFile("adminPass"));
		}
		
		@Test (priority = 1)
		public void verifyUserCanAddNewCategoryOnCategoryPage()
		{
			inventoryCategoryPage = new InventoryCategoryPage(driver);
			SoftAssert sAssert = new SoftAssert();
			cmObj.expandInventoryOption(driver);
			inventoryCategoryPage.navigateToCategoryPageFromInventory();
			categoryName = cmObj.getcharacterString(7);
			int initialCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();				
			inventoryCategoryPage.addNewCategoryOnCategoryPage(categoryName);
			boolean flag = inventoryCategoryPage.isCategoryAddedSuccessfullyMessageDisplayed();		
			int finalCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();
			sAssert.assertTrue(flag, "Category added successFully banner id not displayed");		
			sAssert.assertEquals(initialCount, finalCount-1, "Count is not updated after addition new category");	
			sAssert.assertAll();
			
		}
		
		@Test (priority = 2)
		public void verifyAddedCategoryIsDisplayedOnCategoryPage()
		{
			SoftAssert sAssert = new SoftAssert();
			boolean fl = inventoryCategoryPage.isMentionedCategoryPresentInTable(categoryName);
			sAssert.assertTrue(fl, "Added Category is not displayed on Category Page");		
			sAssert.assertAll();
		}
		
		@Test (priority = 3)
		public void verifyUserCanEditExistingCategory()
		{
			SoftAssert sAssert = new SoftAssert();
			newCategoryName = cmObj.getcharacterString(7);
			int initialCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();
			inventoryCategoryPage.editExistingCategoryOnCategoryPage(categoryName, newCategoryName);
			int finalCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();
			boolean flag = inventoryCategoryPage.isCategoryUpdatedSuccessfullyMessageDisplayed();		
			sAssert.assertTrue(flag, "Category updated successFully banner id not displayed");
			sAssert.assertEquals(initialCount, finalCount, "Count is falsely updated after updating category");		
			sAssert.assertAll();
		}
		
		@Test (priority = 4)
		public void verifyUpdatedCategoryIsDisplayedOnCategoryPage()
		{
			SoftAssert sAssert = new SoftAssert();
			boolean fl = inventoryCategoryPage.isMentionedCategoryPresentInTable(newCategoryName);			
			sAssert.assertTrue(fl, "Added Category is not displayed on Category Page");		
			boolean fl2 = inventoryCategoryPage.isMentionedCategoryPresentInTable(categoryName);			
			sAssert.assertFalse(fl2, "Existing category is still displayed");
			sAssert.assertAll();
		}
		
		@Test(priority = 5)
		public void verifyExistingCategoryCanBeDeleted()
		{
			SoftAssert sAssert = new SoftAssert();
			int initialCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();
			inventoryCategoryPage.deleteExistingCategoryOnCategoryPage(newCategoryName);
			boolean flag = inventoryCategoryPage.isCategoryDeletedSuccessfullyMessageDisplayed();
			int finalCount = inventoryCategoryPage.getCountOfRecordsOnCategoryPage();
			sAssert.assertTrue(flag, "Category deleted successFully banner is not displayed");
			sAssert.assertEquals(initialCount-1, finalCount, "Count is falsely updated after updating category");		
			sAssert.assertAll();
			
		}
		
		@Test(priority = 6)
		public void verifyDeletedCategoryIsNotDisplayedOnCategoryPage()
		{
			SoftAssert sAssert = new SoftAssert();
			boolean fl = inventoryCategoryPage.isMentionedCategoryPresentInTable(newCategoryName);			
			sAssert.assertFalse(fl, "Deleted Category is still displayed on Category Page");		
			
			sAssert.assertAll();
		}
		
		
	}


