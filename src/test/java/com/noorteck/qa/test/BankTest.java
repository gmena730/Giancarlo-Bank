package com.noorteck.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class BankTest extends ObjInitialize {

	public static void main(String[] args) throws InterruptedException {

		// *** Test Case One ***
		
		// 1) Open the browser
		CommonUI.openBrowser("Chrome");
		// 2) Enter the URL https://usdemo.vee24.com/#/transactions
		CommonUI.navigate("https://usdemo.vee24.com/#/transactions");
		
		ObjInitialize.initializeClassObj();

		testCaseOne();
		
		CommonUI.quitBrowser();
		
		
		// *** Test Case Two ***
		
		// 1) Open the browser
		CommonUI.openBrowser("Chrome");
		// 2) Enter the URL https://usdemo.vee24.com/#/transactions
		CommonUI.navigate("https://usdemo.vee24.com/#/transactions");
		
		testCaseTwo();
		
		CommonUI.quitBrowser();

	}

	public static void testCaseOne() throws InterruptedException {
		// 3) Click on Transfer from menu
		homePageObj.clickTransfer();
		// 4) Select Rainy Day from Origin Account dropdown
		transferPageObj.clickOriginAcc();
		// 5) Select Investing from Destination Account dropdown
		transferPageObj.clickDestinationAcc();
		// 6) Enter 1000 in Amount textbox
		transferPageObj.enterAmount("1000");
		// 7) Enter 123435677 in Social Security textbox
		transferPageObj.enterSocialSec("123435677");
		// 8) Enter 1235 in ATM PIN textbox
		transferPageObj.enterPin("1235");
		// 9) Click on Transfer Funds button
		transferPageObj.clickTransferFund();
		// 10) Verify “Success! Funds successfully transferred.” messaged displayed
		transferPageObj.isSuccessMessageDisplayed();
	}

	public static void testCaseTwo() throws InterruptedException {

		// 3) Click on Loans from menu
		homePageObj.clickLoans();
		// 4) Enter John Cena in name textbox
		loansPageObj.enterName("John Cena");
		// 5) Enter 123 Java drive in Address textbox
		loansPageObj.enterAddress("123 Java drive");
		// 6) Select Retirement from Loan Type dropdown
		loansPageObj.clickLoanType();
		// 7) Enter 2 in Years to Repay Loan textbox
		loansPageObj.enterRepayLoan("2");
		// 8) Click Next button
		loansPageObj.clickNext();
		// 9) Enter 5000 in Amount textbox
		loansPageObj.enterAmount("5000");
		// 10) Enter Kim in Mother’s Maiden Name textbox
		loansPageObj.enterMotherName("Kim");
		// 11) Enter 123456778 in Social Security Number textbox
		loansPageObj.enterSocialSec("123456778");
		// 12) Click Next button
		loansPageObj.clickNextAgain(); //Unable to find working locator
		// 13) Click Confirm button
		loansPageObj.clickConfirm();
		// 14) Verify “Submission Success!” messaged displayed
		loansPageObj.isSuccessMessageDisplayed();
	}

}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FORGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FORGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/