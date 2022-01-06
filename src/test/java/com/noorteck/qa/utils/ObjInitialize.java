package com.noorteck.qa.utils;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.LoansPage;
import com.noorteck.qa.pages.TransferPage;

public class ObjInitialize extends Constants {

	public static void initializeClassObj() {
		homePageObj = new HomePage();
		transferPageObj = new TransferPage();
		loansPageObj = new LoansPage();

	}
}
