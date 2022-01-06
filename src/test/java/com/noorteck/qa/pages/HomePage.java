package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']//span[@class='label'][normalize-space()='Transfer']")
	WebElement transferButton;
	
	@FindBy(xpath = "//a[@class='ng-star-inserted']//mat-icon[@role='img'][normalize-space()='attach_money']")
	WebElement loansButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTransfer() {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(transferButton)).click();
	}
	
	public void clickLoans() {
		click(loansButton);
	}
}
