package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;

public class LoansPage extends CommonUI {
	
	@FindBy(css = "#mat-input-0")
	WebElement nameField;
	
	@FindBy(css = "#mat-input-1")
	WebElement addressField;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow']")
	WebElement loanTypeButton;
	
	@FindBy(xpath = "//span[contains(text(), ' Retirement ')]")
	WebElement retirement;
	
	@FindBy(css = "#mat-input-2")
	WebElement repayLoanField;
	
	@FindBy(css = "#mat-input-3")
	WebElement amountField;
	
	@FindBy(css = "#mat-input-4")
	WebElement motherNameField;
	
	@FindBy(css = "#mat-input-5")
	WebElement socialSecField;
	
	@FindBy(css = ".v24DomSyncDenyAgent.mat-raised-button.mat-primary.cdk-focused.cdk-mouse-focused")
	WebElement confirmButton;
	
	@FindBy(css = ".mat-card-title")
	WebElement successMessage;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement firstNextButton;
	
	@FindBy(css = "")
	WebElement secondNextButton;
	
	
	public LoansPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterName(String name) {
		enter(nameField, name);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void clickLoanType() {
		click(loanTypeButton);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(retirement)).click();
	}
	
	public void enterRepayLoan(String repay) {
		enter(repayLoanField, repay);
	}
	
	public void enterAmount(String amount) {
		enter(amountField, amount);
	}
	
	public void enterMotherName(String motherName) {
		enter(motherNameField, motherName);
	}
	
	public void enterSocialSec(String socialSec) {
		enter(socialSecField, socialSec);
	}
	
	public void clickNext() {
		click(firstNextButton);
	}
	
	public void clickNextAgain() {
		click(secondNextButton);
	}
	
	public void isSuccessMessageDisplayed() {
		isDisplayed(successMessage);
	}
	
	public void clickConfirm() {
		click(confirmButton);
	}
}
