package com.singtel.pages;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.singtel.elements.LandingPageElements;
import com.singtel.step_defs.AbstractBase;

import io.cucumber.datatable.DataTable;

public class LandingPage {

	WebDriver driver;
	AbstractBase base;
	LandingPageElements homeElements;
	private WebDriver webdriver;

	public LandingPage(AbstractBase base) {
		this.base = base;
		this.driver = base.getDriver();
		homeElements = new LandingPageElements(this.driver);
	}

	public void redirectToLandingPage() {
		String landingPageUrl = base.getLandingPageURL();
		driver.get(landingPageUrl);
	}

	public void login(String username, String password) {

		homeElements.txtbx_userName.sendKeys(username);
		homeElements.txtbx_nextButton.click();
		homeElements.txtbx_password.sendKeys(password);
		homeElements.btn_login.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void verifyLogin() {
		String actualUrl = driver.getCurrentUrl();
		boolean actualValue = actualUrl.contains("home");
		System.out.println("dasda      sdasdas " + actualUrl);
		Assert.assertEquals(true, actualValue);
	}

	public void userUploadProfilePicture() throws InterruptedException {
		// Click Profile
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Profile;
		Profile = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]")));
		Profile.click();

		WebElement EditProfile;
		EditProfile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]")));
		EditProfile.click();
		Thread.sleep(2000);
		// Upload image
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('style', arguments[1])",
				driver.findElement(By.xpath("/descendant::input[@type='file'][2]")), "0");
		// Thread.sleep(2000);

		jse.executeScript("arguments[0].setAttribute('class', arguments[1])",
				driver.findElement(By.xpath("/descendant::input[@type='file'][2]/../../div[2]")), "a");
		// Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='file']"))
				.sendKeys("C:\\Users\\Admin\\Pictures\\IndrasenJagtapAadharcard.JPG");
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		// Thread.sleep(6000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

	}

	public void userEntersBioOnProfilePage(String bio) throws InterruptedException {
		// Click Profile
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Profile;
		Profile = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]")));
		Profile.click();

		WebElement EditProfile;
		EditProfile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]")));
		EditProfile.click();
		Thread.sleep(2000);

		wait = new WebDriverWait(driver, 30);
		// BIO
		WebElement TextBio;
		TextBio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("description")));
		TextBio.click();
		TextBio.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		TextBio.sendKeys(bio);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

	}

	public void userEntersLocationOnProfilePage(String location) throws InterruptedException {
		// Click Profile
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Profile;
		Profile = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]")));
		Profile.click();

		WebElement EditProfile;
		EditProfile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]")));
		EditProfile.click();
		Thread.sleep(5000);

		// Location
		wait = new WebDriverWait(driver, 30);
		WebElement Location;
		Location = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("location")));
		// driver.findElement(By.name("location")).click();
		Location.click();
		// driver.findElement(By.name("location")).clear();;

		Location.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		// driver.findElement(By.name("location")).sendKeys(location);

		Location.sendKeys(location);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

	}

	public void userEntersWebsiteOnProfilePage(String website) throws InterruptedException {
		// Click Profile
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Profile;
		Profile = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]")));
		Profile.click();

		WebElement EditProfile;
		EditProfile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]")));
		EditProfile.click();
		Thread.sleep(2000);

		// Website
		wait = new WebDriverWait(driver, 30);
		WebElement Website;
		Website = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("url")));
		Website.click();
		Thread.sleep(2000);
		Website.clear();

		// Website.sendKeys(Keys.CONTROL + "A" + Keys.BACK_SPACE);
		Website.sendKeys(website);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();

	}

	public void fetchAndVerifyUserDetails(String bio, String location, String password) throws InterruptedException {
		// Click Profile
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement Profile;
		Profile = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[contains(normalize-space(),'Profile')]")));
		Profile.click();

		WebElement EditProfile;
		EditProfile = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Edit profile')]")));
		EditProfile.click();
		Thread.sleep(2000);

		String actualBio = driver.findElement(By.name("description")).getText();
		String actualLocation = driver.findElement(By.name("location")).getAttribute("value");
		String actualUrl = driver.findElement(By.name("url")).getAttribute("value");

		Assert.assertEquals(bio, actualBio);
		Assert.assertEquals(location, actualLocation);
		Assert.assertEquals(password, actualUrl);
	}

	public void retrieveTheTweets(String search) throws InterruptedException {

		// driver.findElement(By.xpath("//input[@aria-label='Search query']")).

		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement Website;
			Website = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Search query']")));
			Website.click();
			Thread.sleep(2000);
			Website.clear();
			Website.sendKeys(search);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@data-testid='TypeaheadUser']//span[text()='The Times Of India']"))
					.click();

			int i = 1;
			while (true) {

				System.out.println("i chi value ++++++++=============" + i);
				String timeXpth = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div["
						+ i + "]/div/div/article/div/div/div/div[2]/div[2]/div[1]/div/div/div[1]/a/time";
				Thread.sleep(3000);

				JavascriptExecutor je = (JavascriptExecutor) driver;
				je.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(timeXpth)));
				Thread.sleep(3000);
				// je.executeScript("window.scrollBy(0,350)", "");
				String timeXpath = driver.findElement(By.xpath(timeXpth)).getText();

				System.out.println(timeXpath);

				if (timeXpath.contains("s") || timeXpath.contains("m") || timeXpath.equals("1h")) {
					String contentXpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/section/div/div/div["
							+ i + "]/div/div/article/div/div/div/div[2]/div[2]/div[2]/div[1]";
					String content = driver.findElement(By.xpath(contentXpath)).getText();

					// Step h
					printTweetInChunk(content);

					System.out.println(
							"*******************************************************************************************************************************************************************************");

				} else {
					System.out.println("Break hot aahe ==== " + timeXpath);
					break;
				}
				i++;
			}
		} catch (Exception e) {

		}

	}

	public static void printTweetInChunk(String content) {
		char[] ch = content.toCharArray();
		if (ch.length > 50) {
			float f = ch.length / 50;
			int remainder = ch.length % 50;
			System.out.println("sdad = " + remainder);
			int temp = Math.round(f);
			System.out.println(temp);

			int t = 0;
			for (int z = 0; z < temp; z++) {
				int y = 50 + t;
				System.out.println(z + 1 + " Chunk of data ");
				while (t < y) {
					System.out.print(ch[t]);
					t++;

				}
				System.out.println();

			}
			if (remainder != 0) {
				System.out.println(temp + 1 + " Chunk of data ");

				System.out.println();
				for (int k = t; k < ch.length; k++) {
					System.out.print(ch[k]);
				}

			}

		}
	}

}