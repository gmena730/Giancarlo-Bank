package com.noorteck.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;

public class TransferPage extends CommonUI {
	
	@FindBy(css = ".mat-select-placeholder.ng-tns-c12-2.ng-star-inserted")
	WebElement originAcc;
	
	@FindBy(xpath = "//span[normalize-space()='Rainy Day']")
	WebElement rainyDays;
	
	@FindBy(xpath = "//*[@id=\"mat-select-1\"]/div/div[1]")
	WebElement destinationAcc;
	
	@FindBy(xpath = "//*[@id=\"mat-option-7\"]/span")
	WebElement investing;
	
	@FindBy(css = "#mat-input-0")
	WebElement amountField;
	
	@FindBy(css = "#mat-input-1")
	WebElement socialsecField;
	
	@FindBy(css = "#mat-input-2")
	WebElement pinField;
	
	@FindBy(css = "button[type='button'] span[class='mat-button-wrapper']")
	WebElement transferFundsButton;
	
	@FindBy(css = ".mat-card-title")
	WebElement successMessage;
	
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOriginAcc() {
		click(originAcc);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(rainyDays)).click();
	}
	
	public void clickDestinationAcc() {
		click(destinationAcc);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(investing)).click();
	}
	
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterSocialSec(String socialSec) {
		enter(socialsecField, socialSec);
	}
	
	public void enterPin(String pin) {
		enter(pinField, pin);
	}
	
	public void clickTransferFund( ) {
		click(transferFundsButton);
	}
	
	public void isSuccessMessageDisplayed() {
		isDisplayed(successMessage);
	}
	
}
